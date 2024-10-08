package pe.edu.cibertec.api_rest_t2.service;

import pe.edu.cibertec.api_rest_t2.dto.reservasCargaDto;

import java.util.List;

public interface IReservasCargaService {
    List<reservasCargaDto> obtenerReservasPorCliente(String clienteNombre);
    List<reservasCargaDto> obtenerReservasPorEstado(String estadoReservaEstador);
}
