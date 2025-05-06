package com.medo.pharmacy.controller;


import com.medo.pharmacy.model.Produit;
import com.medo.pharmacy.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/produits")
public class ProduitController  {

    @Autowired
    private ProduitService produitService;



    @PostMapping("/add")
    public Produit  AjouterProduit(@RequestBody  Produit produit) {

       return produitService.addProduit(produit);

    }

    @GetMapping("/list")
    public Iterable<Produit> listeProduits() {

        return produitService.getAllProduits();
    }

    @PutMapping("/update")
    public Produit updateProduit(@RequestBody Produit produit) {
        return produitService.updateProduit(produit);
    }

    @DeleteMapping("/delete")
    public void deleteProduit(@RequestBody Produit produit) {
          produitService.deleteProduit(produit.getId());
    }




}
