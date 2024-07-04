package ben_ali.faker.carrefour_delivery.carrefourdelivery.repositories;

import ben_ali.faker.carrefour_delivery.carrefourdelivery.entities.ModeLivraison;
import ben_ali.faker.carrefour_delivery.carrefourdelivery.entities.TempLot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author BenAli Faker
 * @version 1.0
 * @Post CTO
 * @Date 04/07/2024
 * @Time 09:47
 * @since 1.0
 **/
public interface TempLotRepository extends JpaRepository<TempLot,Long> {
    List<TempLot> findByModeLivraisonAndReservedFalse(ModeLivraison modeLivraison);
}
