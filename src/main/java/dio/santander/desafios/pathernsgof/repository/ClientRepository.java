package dio.santander.desafios.pathernsgof.repository;

import dio.santander.desafios.pathernsgof.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
