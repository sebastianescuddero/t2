package pe.edu.cibertec.api_rest_t2.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.api_rest_t2.dto.vehiculoDto;
import pe.edu.cibertec.api_rest_t2.service.impl.vehiculoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/vehiculos")
public class vehiculoController {
    @Autowired
    private vehiculoService vehiculoService;

    // Endpoint para buscar vehículos por modelo y devolver DTOs
    @GetMapping("/buscarPorModelo")
    public List<vehiculoDto> buscarPorModelo(@RequestParam String modelo) {
        return vehiculoService.buscarPorModelo(modelo);
    }

    // Endpoint para buscar vehículos asignados a un cliente específico y devolver DTOs
    @GetMapping("/cliente/{idcliente}")
    public List<vehiculoDto> buscarPorCliente(@PathVariable int idcliente) {
        return vehiculoService.buscarPorCliente(idcliente);
    }
}
