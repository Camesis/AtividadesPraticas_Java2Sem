package com.example.atividadepratica6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atividadepratica6.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}