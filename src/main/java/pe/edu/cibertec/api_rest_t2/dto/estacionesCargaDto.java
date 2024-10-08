package pe.edu.cibertec.api_rest_t2.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class estacionesCargaDto {
    private int idestacion;
    private String ubicacion;
    private int capacidad;
    private String disponibilidadEstacionDisponibilidad;
}
