package dio.santander.desafios.pathernsgof.services;


import dio.santander.desafios.pathernsgof.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "viacep",url = "https://viacep.com.br/ws/")
public interface ViaCEPService {

    @GetMapping(path = "{cep}/json/")
    Address foundCEP(@PathVariable("cep") String cep);
}
