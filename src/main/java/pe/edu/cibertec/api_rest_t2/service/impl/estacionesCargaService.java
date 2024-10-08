package pe.edu.cibertec.api_rest_t2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_rest_t2.dto.estacionesCargaDto;
import pe.edu.cibertec.api_rest_t2.model.estacionesCarga;
import pe.edu.cibertec.api_rest_t2.service.IEstacionesCargaService;
import pe.edu.cibertec.api_rest_t2.repository.estacionesCargaRepository;
import pe.edu.cibertec.api_rest_t2.util.convert.estacionesCargaConvert;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class estacionesCargaService implements IEstacionesCargaService {
    private final estacionesCargaRepository estacionesCargaRepository;
    private final estacionesCargaConvert estacionesCargaConvert;
    @Override
    public List<estacionesCargaDto> obtenerEstacionesDisponibles(String disponibilidadEstacionDisponibilidad) {
        List<estacionesCargaDto> estacionesCargaDtos = new ArrayList<>();
        for (estacionesCarga estacionesCarga : estacionesCargaRepository.buscarPorDisponibilidad(disponibilidadEstacionDisponibilidad)) {
            estacionesCargaDtos.add(estacionesCargaConvert.convertirEstacionesCargaAEstacionesCargaDto(estacionesCarga));
        }
        return estacionesCargaDtos;
    }

    @Override
    public List<estacionesCargaDto> obtenerEstacionesPorUbicacion(String ubicacion) {
        List<estacionesCargaDto> estacionesCargaDtos = new ArrayList<>();
        for (estacionesCarga estacionesCarga : estacionesCargaRepository.buscarPorUbicacion(ubicacion)) {
            estacionesCargaDtos.add(estacionesCargaConvert.convertirEstacionesCargaAEstacionesCargaDto(estacionesCarga));
        }
        return estacionesCargaDtos;
    }
}
