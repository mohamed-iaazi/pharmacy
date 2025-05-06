package com.medo.pharmacy.service;


import com.medo.pharmacy.model.Produit;
import com.medo.pharmacy.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Iterable<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit getProduit(int id) {
        return produitRepository.getProduitsById(id);
    }

    public void deleteProduit(long id) {
          produitRepository.deleteById(id);
    }

    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }


}
