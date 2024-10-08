package pe.edu.cibertec.api_rest_t2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.api_rest_t2.dto.estacionesCargaDto;
import pe.edu.cibertec.api_rest_t2.service.impl.estacionesCargaService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/estacionesCarga")
public class estacionesCargaController {
    @Autowired
    private estacionesCargaService estacionesCargaService;

    @GetMapping("/disponibles")
    public List<estacionesCargaDto> obtenerEstacionesDisponibles(@RequestParam String disponibilidadEstacionDisponibilidad) {
        return estacionesCargaService.obtenerEstacionesDisponibles(disponibilidadEstacionDisponibilidad);
    }

    @GetMapping("/ubicacion")
    public List<estacionesCargaDto> obtenerEstacionesPorUbicacion(@RequestParam String ubicacion) {
        return estacionesCargaService.obtenerEstacionesPorUbicacion(ubicacion);
    }
}
