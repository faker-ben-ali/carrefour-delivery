package ben_ali.faker.carrefour_delivery.carrefourdelivery.entities;

import ben_ali.faker.carrefour_delivery.carrefourdelivery.enums.TypeLivraison;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


/**
 * @author BenAli Faker
 * @version 1.0
 * @Post CTO
 * @Date 04/07/2024
 * @Time 09:32
 * @since 1.0
 pour les noms des colonnes on peut spécifie le name, type, length, columnDefinition dans la balise @column
aussi des autres paramètres mais pour avancer sur le projet
je garde le nom par defaut de l'attribut "CamelCase" d'ou la balise @column sans paramètre
 */
@Entity
@Table // cette balise n'est pas obligatoire si on garde le nom par defaut de la table
// comme le nom de l'entité
//aussi la balise @Table est utlisé pour définir les index les contraintes ....
//NB : @Column non obligatoire si on va garder les noms des attribut java
//mêmes remarques pour @Data comme dans AuditLot.java
@Data
public class ModeLivraison implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomClient;
    @Column
    private String prenomClient;
    @Column
    private String adresseClient;

    @Column
    private String nomLivreur;
    @Column
    private String prenomLivreur;
    /**
     * autres colonnes à ajouter selon le besion comme i - nfo de livreur -
     * complement info client - info marchandise -info de suivi -Audit ....
     *
     */
    @Enumerated(EnumType.STRING)
    private TypeLivraison type;

}
