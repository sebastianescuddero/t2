package pe.edu.cibertec.api_rest_t2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_rest_t2.dto.mantenimientoVehiculoDto;
import pe.edu.cibertec.api_rest_t2.repository.mantenimientoVehiculoRepository;
import pe.edu.cibertec.api_rest_t2.service.IMantenimientoVehiculoService;

@RequiredArgsConstructor
@Service
public class mantenimientoVehiculoService implements IMantenimientoVehiculoService {
    private final mantenimientoVehiculoRepository mantenimientoVehiculoRepository;

    @Override
    public void registrarMantenimientoVehiculo(mantenimientoVehiculoDto mantenimientoVehiculoDto) {
        mantenimientoVehiculoRepository.registrarNuevoMantenimiento(
                mantenimientoVehiculoDto.getVehiculoIdvehiculo(),
                mantenimientoVehiculoDto.getTipoMantenimientoIdtipomantenimiento(),
                mantenimientoVehiculoDto.getCosto());
    }
}
