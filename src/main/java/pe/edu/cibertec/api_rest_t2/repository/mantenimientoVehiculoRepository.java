package pe.edu.cibertec.api_rest_t2.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_rest_t2.model.mantenimientoVehiculo;

@Repository
public interface mantenimientoVehiculoRepository extends JpaRepository<mantenimientoVehiculo, Integer> {
    @Transactional
    @Modifying
    @Procedure(procedureName = "GenerarRegistrarMantenimiento")
    void registrarNuevoMantenimiento(
            @Param("p_idvehiculo") Integer vehiculoIdvehiculo,
            @Param("p_idtipomantenimiento") Integer tipoMantenimientoIdtipomantenimiento,
            @Param("p_costo") Double costo);
}
