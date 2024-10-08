package pe.edu.cibertec.api_rest_t2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_rest_t2.dto.vehiculoDto;
import pe.edu.cibertec.api_rest_t2.model.vehiculo;
import pe.edu.cibertec.api_rest_t2.repository.vehiculoRepository;
import pe.edu.cibertec.api_rest_t2.service.IVehiculoService;
import pe.edu.cibertec.api_rest_t2.util.convert.vehiculoConvert;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class vehiculoService implements IVehiculoService {
    private final vehiculoRepository vehiculoRepository;
    private final vehiculoConvert vehiculoConvert;
    @Override
    public List<vehiculoDto> buscarPorModelo(String modelo) {
        List<vehiculoDto> vehiculoDtos = new ArrayList<>();
        for (vehiculo vehiculo : vehiculoRepository.findByModelo(modelo)) {
            vehiculoDtos.add(vehiculoConvert.convertirVehiculoAVehiculoDto(vehiculo));
        }
        return vehiculoDtos;
    }

    @Override
    public List<vehiculoDto> buscarPorCliente(int idcliente) {
        List<vehiculoDto> vehiculoDtos = new ArrayList<>();
        for (vehiculo vehiculo : vehiculoRepository.findByClienteIdcliente(idcliente)) {
            vehiculoDtos.add(vehiculoConvert.convertirVehiculoAVehiculoDto(vehiculo));
        }
        return vehiculoDtos;
    }
}
