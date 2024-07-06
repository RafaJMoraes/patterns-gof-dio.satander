package dio.santander.desafios.pathernsgof.services.impl;


import dio.santander.desafios.pathernsgof.domain.Address;
import dio.santander.desafios.pathernsgof.repository.AddressRepository;
import dio.santander.desafios.pathernsgof.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServicesImpl implements AddressServices {

    @Autowired
    private AddressRepository repository;
    @Override
    public List<Address> findAll() {
        return repository.findAll();
    }
}
