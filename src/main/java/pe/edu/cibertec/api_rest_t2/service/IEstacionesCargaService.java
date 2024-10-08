package pe.edu.cibertec.api_rest_t2.service;

import pe.edu.cibertec.api_rest_t2.dto.estacionesCargaDto;

import java.util.List;

public interface IEstacionesCargaService {
    List<estacionesCargaDto> obtenerEstacionesDisponibles(String disponibilidadEstacionDisponibilidad);
    List<estacionesCargaDto> obtenerEstacionesPorUbicacion(String ubicacion);
}
