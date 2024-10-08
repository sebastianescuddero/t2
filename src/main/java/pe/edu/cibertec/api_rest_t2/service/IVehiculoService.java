package pe.edu.cibertec.api_rest_t2.service;

import pe.edu.cibertec.api_rest_t2.dto.vehiculoDto;

import java.util.List;

public interface IVehiculoService {
    List<vehiculoDto> buscarPorModelo(String modelo);
    List<vehiculoDto> buscarPorCliente(int idcliente);
}
