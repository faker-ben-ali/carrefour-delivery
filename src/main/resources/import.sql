INSERT INTO mode_livraison (nom_client, prenom_client, adresse_client, nom_livreur, prenom_livreur, type)
VALUES ('Vincent', 'Jean', '123 Rue de Paris', 'Martin', 'Paul', 'DRIVE');

INSERT INTO mode_livraison (nom_client, prenom_client, adresse_client, nom_livreur, prenom_livreur, type)
VALUES ('Paris', 'Marie', '456 Avenue de Lyon', 'Dupuis', 'Sophie', 'DELIVERY');


INSERT INTO temp_lot (date, date_debut, date_fin, mode_livraison_id, reserved)
VALUES ('2024-07-04', '08:00:00', '10:00:00', 1, false);

INSERT INTO temp_lot (date, date_debut, date_fin, mode_livraison_id, reserved)
VALUES ('2024-07-04', '10:00:00', '12:00:00', 2, false);