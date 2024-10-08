package pe.edu.cibertec.api_rest_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_rest_t2.model.estacionesCarga;

import java.util.List;

@Repository
public interface estacionesCargaRepository extends JpaRepository<estacionesCarga, Integer> {
    // Consulta JPQL: Encontrar estaciones disponibles
    @Query("SELECT e FROM estacionesCarga e WHERE e.disponibilidadEstacion.disponibilidad = :disponibilidad")
    List<estacionesCarga> buscarPorDisponibilidad(@Param("disponibilidad") String disponibilidad);

    // Consulta JPQL: Encontrar estaciones por ubicación
    @Query("SELECT e FROM estacionesCarga e WHERE e.ubicacion = :ubicacion")
    List<estacionesCarga> buscarPorUbicacion(@Param("ubicacion") String ubicacion);
}
