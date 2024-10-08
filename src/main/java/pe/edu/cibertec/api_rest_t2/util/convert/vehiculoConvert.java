package pe.edu.cibertec.api_rest_t2.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_rest_t2.dto.vehiculoDto;
import pe.edu.cibertec.api_rest_t2.model.vehiculo;

@Component
public class vehiculoConvert {
    public vehiculoDto convertirVehiculoAVehiculoDto(vehiculo vehiculo){
        return vehiculoDto.builder().idvehiculo(vehiculo.getIdvehiculo())
                .modelo(vehiculo.getModelo())
                .año(vehiculo.getAño())
                .estadoVehiculoEstado(vehiculo.getEstado().getEstado())
                .clienteNombre(vehiculo.getCliente().getNombre())
                .build();
    }
}
