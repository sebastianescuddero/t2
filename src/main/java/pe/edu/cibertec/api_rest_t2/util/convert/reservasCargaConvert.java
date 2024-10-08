package pe.edu.cibertec.api_rest_t2.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_rest_t2.dto.estacionesCargaDto;
import pe.edu.cibertec.api_rest_t2.dto.reservasCargaDto;
import pe.edu.cibertec.api_rest_t2.model.estacionesCarga;
import pe.edu.cibertec.api_rest_t2.model.reservasCarga;

@Component
public class reservasCargaConvert {
    public reservasCargaDto convertirreservasCargaAreservasCargaDto(reservasCarga reservasCarga){
        return reservasCargaDto.builder().idreserva(reservasCarga.getIdreserva())
                .clienteNombre(reservasCarga.getCliente().getNombre())
                .estacionesCargaUbicacion(reservasCarga.getEstacionesCarga().getUbicacion())
                .fecha_reserva(reservasCarga.getFecha_reserva())
                .estadoReservaEstador(reservasCarga.getEstadoReserva().getEstador())
                .build();
    }
}
