package pe.edu.cibertec.api_rest_t2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.api_rest_t2.dto.reservasCargaDto;
import pe.edu.cibertec.api_rest_t2.service.impl.reservasCargaService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reservasCarga")
public class reservasCargaController {
    @Autowired
    private reservasCargaService reservasCargaService;

    @GetMapping("/cliente")
    public List<reservasCargaDto> obtenerReservasPorCliente(@RequestParam String clienteNombre) {
        return reservasCargaService.obtenerReservasPorCliente(clienteNombre);
    }

    @GetMapping("/estado")
    public List<reservasCargaDto> obtenerReservasPorEstado(@RequestParam String estadoReservaEstador) {
        return reservasCargaService.obtenerReservasPorEstado(estadoReservaEstador);
    }
}
