package pe.edu.cibertec.api_rest_t2.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class reservasCargaDto {
    private int idreserva;
    private String clienteNombre;
    private String estacionesCargaUbicacion;
    private Date fecha_reserva;
    private String estadoReservaEstador;
}
