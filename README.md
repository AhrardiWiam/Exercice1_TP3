# Exercice1_TP3: Gestion des Produits


## Outils Utilisés
- **Java 8** (IDE : NetBeans)
- **Hibernate** (pour la gestion de la persistance)
- **MySQL** (pour la base de données)

## Structure du Projet
Le projet est organisé en plusieurs packages avec les classes suivantes :

- **ma.projet.entity**
  - `Produit` : Classe représentant l'entité Produit avec ses attributs et ses annotations pour la base de données.

- **ma.projet.config**
  - `hibernate.cfg.xml` : Fichier de configuration Hibernate pour la connexion à la base de données.

- **ma.projet.util**
  - `HibernateUtil` : Classe utilitaire pour créer et gérer les sessions Hibernate.

- **ma.projet.dao**
  - `IDao` : Interface définissant les méthodes de base pour les opérations CRUD (Create, Read, Update, Delete).

- **ma.projet.service**
  - `ProduitService` : Classe implémentant l'interface `IDao` pour la gestion des produits.

## Fonctionnalités de l'Application
L'application permet de réaliser les actions suivantes :

1. **Créer des produits** dans la base de données.
2. **Afficher la liste des produits**.
3. **Afficher les informations d'un produit spécifique**. 
4. **Supprimer un produit**.
5. **Modifier les informations d'un produit** .
6. **Afficher la liste des produits dont le prix est supérieur à 1000 DH**.
7. **Afficher la liste des produits commandés entre deux dates spécifiques** saisies par l'utilisateur.

## Démonstration 

https://github.com/user-attachments/assets/6a99f3de-5d19-416b-b8d6-a3eccb9b60cf

