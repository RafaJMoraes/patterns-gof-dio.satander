package dio.santander.desafios.pathernsgof.controller;


import dio.santander.desafios.pathernsgof.domain.Client;
import dio.santander.desafios.pathernsgof.dto.ClientDto;
import dio.santander.desafios.pathernsgof.dto.ClientDtoUpdate;
import dio.santander.desafios.pathernsgof.services.AddressServices;
import dio.santander.desafios.pathernsgof.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {


    @Autowired
    private AddressServices services;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(services.findAll());
    }


}
