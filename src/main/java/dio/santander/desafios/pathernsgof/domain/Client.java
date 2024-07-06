package dio.santander.desafios.pathernsgof.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_client",catalog = "tabela de clientes da aplicacao teste")
public class Client extends AbstractDomain {

    private String name;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
