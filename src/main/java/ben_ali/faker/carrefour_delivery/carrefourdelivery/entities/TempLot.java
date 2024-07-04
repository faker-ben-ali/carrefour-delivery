package ben_ali.faker.carrefour_delivery.carrefourdelivery.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author BenAli Faker
 * @version 1.0
 * @Post CTO
 * @Date 04/07/2024
 * @Time 09:33
 * @since 1.0
 **/
@Entity
//NB : @Column non obligatoire si on va garder les noms des attributs java
//Data : non obligatoire si garde le mm nom de l'éntité java
@Data // pour activer data sur eclipse , il faut installer le jar lombok , pour éviter
// la génération
//getter/setter, constructeur ... aussi autres options pour service comme reguiredArgsConstructor
//afin de dire que les attributs d'un service font parties de constructeur
// avec plusieurs autres options
public class TempLot {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDate date;
    @Column
    private LocalTime dateDebut;
    @Column
    private LocalTime dateFin;

}
