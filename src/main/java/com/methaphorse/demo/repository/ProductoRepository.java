package com.methaphorse.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.methaphorse.demo.model.Producto;

import jakarta.transaction.Transactional;

@Repository
@Transactional



public interface ProductoRepository  extends  JpaRepository<Producto, Long> {

	Producto findByProductoid(@Param("productoid") Long productoid);
	List<Producto> findAll();
	String deleteByProductoid(@Param("productoid") Long productoid);

}
