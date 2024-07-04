# carrefour-delivery application pour carrefour market

-- 1ére option Lancer le contenu de schema.sql manuellement avant de demarrer le projet afin d'assurer que les tables sont créées
-- la 2éme option et d'ajouter liquibase avec changeLog pour demarrer avec l'application
-- 3éme option configure le projet pour lancer le auto-ddl à true  
-- Voir application.properties et schema.sql pour plus des détailles

## Description

Une application développé pour donner la main aux clients de choisir et désigner un créneau pour la livraison de leurs marchandises

## Prérequis

- Java 21
- Maven
- Git

I )  Installation

Clonez le dépôt :

1 -
git clone url_a_mettre_après_creation_de_github

ouvrir un IDE comme eclipse ou IntelliJ

importez le projet as existing Maven project

2 - clone dans un IDE directement en utilisant l'assistant


II ) Utilisation

Endpoints

pour Obtenir tous les modes de livraison.
URL : http://localhost:8080/livraison/modes
Méthode HTTP : GET

pour Obtenir les créneaux horaires disponibles pour un mode de livraison donné.
http://localhost:8080/ tempslots?deliveryModeId={deliveryModeId}
Méthode HTTP : GET

pour Réserver un créneau horaire.
URL : http://localhost:8080/ tempslots/reserve?timeslotId={timeslotId}
Méthode HTTP : POST

VOUS POUVEZ UTILSER Postman pour tester les endpoints

III ) Démarrer application :

- via IDE en cliquant sur run as java application
- via le jar créer après le lancement de goal maven "clean install" java -jar nom-appli.jar

Accédez à la console H2 via http://localhost:8080/h2-console avec les informations suivantes :

URL de connexion : jdbc:h2:mem:testdb
Nom d'utilisateur : carrefour
Mot de passe : 12345

II ) Notes:
1. Il y a une entité pour le domaine modèle client qui est normalement entre en relation avec le domaine modèle livraison mais il y juste l'implémentation  mais je le n'utilise pas à cause du contrainte du temp (n'hésitez pas de voir les deux modèles)