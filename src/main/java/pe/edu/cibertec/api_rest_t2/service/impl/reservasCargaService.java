package pe.edu.cibertec.api_rest_t2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_rest_t2.dto.reservasCargaDto;
import pe.edu.cibertec.api_rest_t2.model.reservasCarga;
import pe.edu.cibertec.api_rest_t2.model.vehiculo;
import pe.edu.cibertec.api_rest_t2.repository.reservasCargaRepository;
import pe.edu.cibertec.api_rest_t2.service.IReservasCargaService;
import pe.edu.cibertec.api_rest_t2.util.convert.reservasCargaConvert;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class reservasCargaService implements IReservasCargaService {
    private final reservasCargaRepository reservasCargaRepository;
    private final reservasCargaConvert reservasCargaConvert;
    @Override
    public List<reservasCargaDto> obtenerReservasPorCliente(String clienteNombre) {
        List<reservasCargaDto> reservasCargaDtos = new ArrayList<>();
        for (reservasCarga reservasCarga : reservasCargaRepository.buscarPorCliente(clienteNombre)) {
            reservasCargaDtos.add(reservasCargaConvert.convertirreservasCargaAreservasCargaDto(reservasCarga));
        }
        return reservasCargaDtos;
    }

    @Override
    public List<reservasCargaDto> obtenerReservasPorEstado(String estadoReservaEstador) {
        List<reservasCargaDto> reservasCargaDtos = new ArrayList<>();
        for (reservasCarga reservasCarga : reservasCargaRepository.buscarPorEstadoReserva(estadoReservaEstador)) {
            reservasCargaDtos.add(reservasCargaConvert.convertirreservasCargaAreservasCargaDto(reservasCarga));
        }
        return reservasCargaDtos;
    }
}
