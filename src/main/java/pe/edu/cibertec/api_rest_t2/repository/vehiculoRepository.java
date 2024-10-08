package pe.edu.cibertec.api_rest_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_rest_t2.model.vehiculo;

import java.util.List;

@Repository
public interface vehiculoRepository extends JpaRepository<vehiculo, Integer> {
    List<vehiculo> findByModelo(String modelo);
    List<vehiculo> findByClienteIdcliente(int idcliente);
}
