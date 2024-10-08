package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Mantenimiento_Vehiculo")
public class mantenimientoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmantenimiento;
    @ManyToOne
    @JoinColumn(name = "idvehiculo")
    private vehiculo vehiculo;
    private Date fecha_mantenimiento;
    @ManyToOne
    @JoinColumn(name = "idtipomantenimiento")
    private tipoMantenimiento tipoMantenimiento;
    private Double costo;
}
