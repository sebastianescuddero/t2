package pe.edu.cibertec.api_rest_t2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.api_rest_t2.dto.GenericResponseDto;
import pe.edu.cibertec.api_rest_t2.dto.mantenimientoVehiculoDto;
import pe.edu.cibertec.api_rest_t2.service.impl.mantenimientoVehiculoService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mantenimientoVehiculo")
public class mantenimientoVehiculoController {
    @Autowired
    private mantenimientoVehiculoService mantenimientoVehiculoService;

    @PostMapping("")
    public ResponseEntity<GenericResponseDto<String>> registrarMantenimiento(
            @RequestBody mantenimientoVehiculoDto mantenimientoVehiculoDto
    ){
        try{
            mantenimientoVehiculoService.registrarMantenimientoVehiculo(mantenimientoVehiculoDto);
            return new ResponseEntity<>(GenericResponseDto.
                    <String>builder().correcto(true)
                    .mensaje("Mantenimiento registrado correctamente")
                    .build(), HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(GenericResponseDto.
                    <String>builder().correcto(false)
                    .mensaje("Mantenimiento no registrado")
                    .build(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
