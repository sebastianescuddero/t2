package pe.edu.cibertec.api_rest_t2.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class vehiculoDto {
    private Integer idvehiculo;
    private String modelo;
    private Integer año;
    private String estadoVehiculoEstado;
    private String clienteNombre;
}
