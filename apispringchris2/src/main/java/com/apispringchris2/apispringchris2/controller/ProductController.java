package com.apispringchris2.apispringchris2.controller;

import org.springframework.web.bind.annotation.*;
import com.apispringchris2.apispringchris2.model.Product;

/**
 * author : Christophe
 * @RestController - indique que cette classe va pouvoir traiter les requêtes
 *      et que chaque méthode renverra directement la réponse JSON à l'utilisateur
 * @RequestMapping - permet de faire le lien entre l(URI /Produits,
 *      invoquée via le verbe Get d'Http, et la méthode listeProduits()
 *
 */

@RestController
public class ProductController {
    @RequestMapping(value="/Produits", method= RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple de produit";
    }

    /*
    // méthode également fonctionnelle
    @RequestMapping(value = "/Produits/{id}", method = RequestMethod.GET)
    public String afficherUnProduit(@PathVariable int id) {
        return "Vous avez demandé un produit avec l'id  " + id;
    }
    */

    /*
    // méthode raccourcie également fonctionnelle effectuant la même
    // requête que la précédente avec ma++le RequestMapping, mais cette
    // fois-ci plus courte
    @GetMapping(value = "/Produits/{id}")
    public String afficherUnProduit(@PathVariable int id) {
        return "Vous avez demandé un produit avec l'id  " + id;
    }
    */

    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        Product product=new Product(id, new String("Aspirateur"), 100 );
        return product;
    }

}

