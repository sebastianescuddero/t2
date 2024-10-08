package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Estaciones_Carga")
public class estacionesCarga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestacion;
    private String ubicacion;
    private int capacidad;
    @ManyToOne
    @JoinColumn(name = "iddisponibilidad")
    private disponibilidadEstacion disponibilidadEstacion;
}
