package ben_ali.faker.carrefour_delivery.carrefourdelivery.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BenAli Faker
 * @version 1.0
 * @Post CTO
 * @Date 04/07/2024
 * @Time 10:20
 * @since 1.0
 *  dans la réalité on doit utiliser cette Entité au lieu de l'imbriquer dans l'entité Livraison (Mode Livraison) mais pour contrainte de temps j'ai pas utilisé ce modèle
 **/
@Entity
@Data
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String adresse;
}
