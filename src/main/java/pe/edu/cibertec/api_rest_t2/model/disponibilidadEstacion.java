package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Disponibilidad_Estacion")
public class disponibilidadEstacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddisponibilidad;
    private String disponibilidad;
}
