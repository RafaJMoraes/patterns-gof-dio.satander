package dio.santander.desafios.pathernsgof.dto;

import dio.santander.desafios.pathernsgof.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class ClientDtoAbstract {
    private String name;
    private Address address;
}
