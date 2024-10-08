package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Tipo_Mantenimiento")
public class tipoMantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipomantenimiento;
    private String tipomantenimiento;
}
