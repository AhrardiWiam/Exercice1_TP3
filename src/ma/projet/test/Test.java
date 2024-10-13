/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {

        //HibernateUtil.getSessionFactory();
        ProduitService ps = new ProduitService();
        //Création des Produits    
//        ps.create(new Produit("HP", "F14C", new Date(), 3479.99, "Pc portable"));
//        ps.create(new Produit("DELL", "B74C", new Date(), 3259.99, "Pc portable"));
//        ps.create(new Produit("DELL", "G40W", new Date(), 279.99, "clavier"));
//        ps.create(new Produit("HP", "F14K", new Date(), 179.99, "clavier"));
//        ps.create(new Produit("HP", "H20M", new Date(), 139.99, "souris"));
//        System.out.println(ps.findAll());
//        System.out.println(ps.findById(2));
//        ps.delete(ps.findById(3));
//        ps.update(new Produit(1,"HP", "F14C", new Date(), 3349.99, "Pc portable"));

        //Afficher la liste des produits dont le prix est supérieur à 1000 dh
        List<Produit> l1 = ps.findAll();
//        for (Produit e : l1) {
//            if (e.getPrix() > 1000) {
//                System.out.println(e);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Entrer la premiere date (La plus récente) :");
            Date d1 = dateFormat.parse(sc.nextLine());
            System.out.println("Entrer la deuxieme date (La plus ancienne) :");
            Date d2 = dateFormat.parse(sc.nextLine());
            for (Produit e : l1) {
                if (e.getDateAchat().before(d1) && e.getDateAchat().after(d2)) {
                    System.out.println(e);
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
