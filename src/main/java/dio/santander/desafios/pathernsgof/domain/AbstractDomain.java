package dio.santander.desafios.pathernsgof.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.web.bind.annotation.Mapping;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass
public class AbstractDomain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updateDate;

    @Version
    private int version;

    @PrePersist
    public void prePersist(){
        createdDate = LocalDateTime.now();
        updateDate = createdDate;
    }
    @PreUpdate
    public void preUpdate() {
        updateDate = LocalDateTime.now();
    }
}
