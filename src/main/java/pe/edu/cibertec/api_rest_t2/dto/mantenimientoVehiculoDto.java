package pe.edu.cibertec.api_rest_t2.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class mantenimientoVehiculoDto {
    private Integer idmantenimiento;
    private Integer vehiculoIdvehiculo;
    private Date fecha_mantenimiento;
    private Integer tipoMantenimientoIdtipomantenimiento;
    private Double costo;
}
