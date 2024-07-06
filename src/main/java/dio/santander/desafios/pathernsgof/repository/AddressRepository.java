package dio.santander.desafios.pathernsgof.repository;

import dio.santander.desafios.pathernsgof.domain.Address;
import dio.santander.desafios.pathernsgof.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface AddressRepository extends JpaRepository<Address, String> {
    Optional<Address> findByCep(String cep);
}
