-- 1ére option Lancer le contenu de schema.sql manuellement avant de demarrer le projet afin d'assurer que les tables sont créées
-- la 2éme option et d'ajouter liquibase avec changeLog pour demarrer avec l'application
-- 3éme option configure le projet pour lancer le auto-ddl à true
CREATE TABLE mode_livraison (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                nom_client VARCHAR(255),
                                prenom_client VARCHAR(255),
                                adresse_client VARCHAR(255),
                                nom_livreur VARCHAR(255),
                                prenom_livreur VARCHAR(255),
                                type VARCHAR(255)
    -- Ajouter d'autres colonnes si nécessaire
);


CREATE TABLE temp_lot (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           date DATE,
                           date_debut TIME,
                           date_fin TIME,
                           mode_livraison_id BIGINT,
                           reserved BOOLEAN,
                           FOREIGN KEY (mode_livraison_id) REFERENCES mode_livraison(id)
);