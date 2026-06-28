# Changelog

Toutes les modifications notables de ce projet seront documentées dans ce fichier.

## v0.1 - 2026-06-28

### Ajouté
- Initialisation du projet avec les dossiers `backend/` et `frontend/`
- Implémentation du backend pour la gestion des clients (`Client.java` et `CRM.java`)
- Création de la partie frontend (`index.html` et `style.css`)
- Ajout d'un menu déroulant en JavaScript pour le filtrage des clients par statut dans `index.html` 
- Ajout de la méthode de recherche d'un client par nom dans `CRM.java`
- Fusion des 2 branches avec le main. (sans conflit)
- Initialisation et structuration finale du fichier `README.md`

### Corrigé
- Résolution d'un conflit de fusion volontaire sur le fichier `README.md` entre les branches feature/fitrage-statut et feature/recherche-client.


## Explication du conflit sur README.md

Nous avons volontairement créé un conflit sur le fichier `README.md` . En effet le binome travaillaant sur la branche feature/filtrage-statut et celui travaillant egalement sur feature/recherche-client ont simultanément modifié le fichier `README.md` en ajoutant des sections differentes. De ce fait en essayant de fusionner les 2 a la branche principale main, un conflit est survenu sur le fichier `README.md`.


## Logique de résolution

Pour résoudre ce conflit, nous avons cliqué sur Accept both changes dans le fichier `README.md`. Puis nous avons créé un commit et l'avons envoyé sur notre repo Github.