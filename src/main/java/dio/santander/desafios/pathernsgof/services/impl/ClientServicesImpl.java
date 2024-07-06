package dio.santander.desafios.pathernsgof.services.impl;


import dio.santander.desafios.pathernsgof.domain.Address;
import dio.santander.desafios.pathernsgof.domain.Client;
import dio.santander.desafios.pathernsgof.dto.ClientDto;
import dio.santander.desafios.pathernsgof.dto.ClientDtoUpdate;
import dio.santander.desafios.pathernsgof.repository.AddressRepository;
import dio.santander.desafios.pathernsgof.repository.ClientRepository;
import dio.santander.desafios.pathernsgof.services.ClientServices;
import dio.santander.desafios.pathernsgof.services.ViaCEPService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServicesImpl implements ClientServices {

    @Autowired
    private ClientRepository repository;

    @Autowired
    private ViaCEPService viaCEPService;

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public void create(ClientDto clientDto) {
        Client client = new Client();
        client.setAddress(findAddress(client.getAddress().getCep()));
        BeanUtils.copyProperties(clientDto, client);
        repository.save(client);
    }

    private Address findAddress(String cep) {
        Address address;
        address = addressRepository.findByCep(cep).orElseGet(() -> {
            Address newAddress = viaCEPService.foundCEP(cep);
            addressRepository.save(newAddress);
            return newAddress;
        });
        return address;
    }

    @Override
    public Client getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void update(Long id, ClientDtoUpdate clientDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }
}
