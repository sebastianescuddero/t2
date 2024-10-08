package pe.edu.cibertec.api_rest_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Reservas_Carga")
public class reservasCarga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserva;
    @ManyToOne
    @JoinColumn(name = "idcliente")
    private cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idestacion")
    private estacionesCarga estacionesCarga;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_reserva;
    @ManyToOne
    @JoinColumn(name = "idestador")
    private estadoReserva estadoReserva;
}
