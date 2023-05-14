package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import com.example.demo.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {

		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);

	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);

	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}

	@Override
	public List<Produit> findByNomProduit(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}