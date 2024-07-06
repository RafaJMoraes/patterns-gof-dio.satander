package dio.santander.desafios.pathernsgof.domain;


import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.web.bind.annotation.Mapping;

import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractDomain {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @CreatedDate
    private LocalDateTime createdDate;

    private LocalDateTime updateDate;
}
