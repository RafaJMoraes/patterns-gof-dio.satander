package dio.santander.desafios.pathernsgof.domain;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.springframework.web.bind.annotation.Mapping;

@MappedSuperclass
public class AbstractDomain {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

}
