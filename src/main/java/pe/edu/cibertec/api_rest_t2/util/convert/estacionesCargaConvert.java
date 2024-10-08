package pe.edu.cibertec.api_rest_t2.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_rest_t2.dto.estacionesCargaDto;
import pe.edu.cibertec.api_rest_t2.model.estacionesCarga;

@Component
public class estacionesCargaConvert {
    public estacionesCargaDto convertirEstacionesCargaAEstacionesCargaDto(estacionesCarga estacionesCarga){
        return estacionesCargaDto.builder().idestacion(estacionesCarga.getIdestacion())
                .ubicacion(estacionesCarga.getUbicacion())
                .capacidad(estacionesCarga.getCapacidad())
                .disponibilidadEstacionDisponibilidad(estacionesCarga.getDisponibilidadEstacion().getDisponibilidad())
                .build();
    }
}
