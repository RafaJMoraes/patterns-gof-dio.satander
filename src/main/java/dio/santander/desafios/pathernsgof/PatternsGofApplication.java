package dio.santander.desafios.pathernsgof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Generated project by intellij initializr
 * Modules
 * Spring Data Jpa
 * Spring Web
 * H2 Database
 * OpenFeign
 *
 * @author rafaeljmoraes
 * */
@EnableFeignClients
@SpringBootApplication
public class PatternsGofApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsGofApplication.class, args);
    }

}
