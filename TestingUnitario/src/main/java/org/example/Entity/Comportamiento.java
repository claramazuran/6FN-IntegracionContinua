package org.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comportamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComportamiento;

    private String nombreComportamiento;
    private Date fechaHoraBajaComportamiento;

}
