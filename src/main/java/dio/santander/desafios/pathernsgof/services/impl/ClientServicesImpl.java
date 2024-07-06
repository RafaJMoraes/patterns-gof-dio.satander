package dio.santander.desafios.pathernsgof.services.impl;


import dio.santander.desafios.pathernsgof.domain.Client;
import dio.santander.desafios.pathernsgof.dto.ClientDto;
import dio.santander.desafios.pathernsgof.dto.ClientDtoUpdate;
import dio.santander.desafios.pathernsgof.repository.ClientRepository;
import dio.santander.desafios.pathernsgof.services.ClientServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServicesImpl implements ClientServices {


    @Autowired
    private ClientRepository repository;

    @Override
    public void create(ClientDto clientDto) {
        Client client = new Client();
        BeanUtils.copyProperties(clientDto, client);
        repository.save(client);
    }

    @Override
    public Client getById(Long id) {
        return repository.findById(id).orEls;
    }

    @Override
    public void update(ClientDtoUpdate clientDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }
}
