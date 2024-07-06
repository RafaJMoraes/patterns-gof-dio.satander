package dio.santander.desafios.pathernsgof.controller;


import dio.santander.desafios.pathernsgof.domain.Client;
import dio.santander.desafios.pathernsgof.dto.ClientDto;
import dio.santander.desafios.pathernsgof.dto.ClientDtoUpdate;
import dio.santander.desafios.pathernsgof.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {


    @Autowired
    private ClientServices services;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(services.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(services.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> createClient(@RequestBody ClientDto clientDto){
        services.create(clientDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Criado com sucesso");
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> updateById(@PathVariable Long id, @RequestBody ClientDtoUpdate clientDtoUpdate){
        Client client = services.getById(id);
        if(client==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        services.update(id, clientDtoUpdate);
        return ResponseEntity.status(HttpStatus.OK).body("Alterado com Sucesso");
    }



    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> removeById(@PathVariable Long id){
        Client client = services.getById(id);
        if(client==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        services.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Alterado com Sucesso");
    }

}
