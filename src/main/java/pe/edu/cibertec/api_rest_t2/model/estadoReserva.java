package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Estado_Reserva")
public class estadoReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestador;
    private String estador;
}
