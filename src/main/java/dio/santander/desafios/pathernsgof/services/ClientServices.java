package dio.santander.desafios.pathernsgof.services;

import dio.santander.desafios.pathernsgof.domain.Client;
import dio.santander.desafios.pathernsgof.dto.ClientDto;
import dio.santander.desafios.pathernsgof.dto.ClientDtoUpdate;

import java.util.List;

public interface ClientServices {

    void create(ClientDto clientDto);
    Client getById(Long id);
    void update(Long id, ClientDtoUpdate clientDto);
    void delete(Long id);
    List<Client> findAll();
}
