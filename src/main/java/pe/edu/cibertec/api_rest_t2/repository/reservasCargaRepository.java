package pe.edu.cibertec.api_rest_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_rest_t2.model.reservasCarga;

import java.util.List;

@Repository
public interface reservasCargaRepository extends JpaRepository<reservasCarga, Integer> {
    // Consulta JPQL: Encontrar reservas por cliente
    @Query("SELECT r FROM reservasCarga r WHERE r.cliente.nombre = :nombre")
    List<reservasCarga> buscarPorCliente(@Param("nombre") String cliente);

    // Consulta JPQL: Encontrar reservas por estado
    @Query("SELECT r FROM reservasCarga r WHERE r.estadoReserva.estador = :estador")
    List<reservasCarga> buscarPorEstadoReserva(@Param("estador") String estador);
}
