package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Vehiculos")
public class vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idvehiculo;
    private String modelo;
    private Integer año;
    @ManyToOne
    @JoinColumn(name = "idestado")
    private estadoVehiculo estado;
    @ManyToOne
    @JoinColumn(name = "idcliente")
    private cliente cliente;
}
