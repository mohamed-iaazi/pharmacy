package com.medo.pharmacy.repository;

import com.medo.pharmacy.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
