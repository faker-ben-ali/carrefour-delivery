package ben_ali.faker.carrefour_delivery.carrefourdelivery.services;

import ben_ali.faker.carrefour_delivery.carrefourdelivery.entities.ModeLivraison;
import ben_ali.faker.carrefour_delivery.carrefourdelivery.entities.TempLot;
import ben_ali.faker.carrefour_delivery.carrefourdelivery.repositories.ModeLivraisonRepository;
import ben_ali.faker.carrefour_delivery.carrefourdelivery.repositories.TempLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BenAli Faker
 * @version 1.0
 * @Post CTO
 * @Date 04/07/2024
 * @Time 09:57
 * @since 1.0
 **/
@Service
public class LivraisonService {

    @Autowired
    private ModeLivraisonRepository modeLivraisonRepository;

    @Autowired
    private TempLotRepository tempsLotRepository;

    public List<ModeLivraison> getAllModesLivraison() {
        return modeLivraisonRepository.findAll();
    }

    public List<TempLot> getCreneauDisponible(Long deliveryModeId) {
        ModeLivraison deliveryMode = modeLivraisonRepository.findById(deliveryModeId).orElseThrow();
        return tempsLotRepository.findByModeLivraisonAndReservedFalse(deliveryMode);
    }

    public TempLot reserverCreaneau(Long timeslotId) {
        TempLot timeslot = tempsLotRepository.findById(timeslotId).orElseThrow();
        timeslot.setReserved(true);
        return tempsLotRepository.save(timeslot);
    }
}
