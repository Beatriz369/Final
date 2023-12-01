package com.methaphorse.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.methaphorse.demo.model.ElementosCarrito;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public interface ElementosCarritoRepository extends JpaRepository<ElementosCarrito, Long> {
	ElementosCarrito findByElementoid(@Param("elementoid") Long elementoid);
	List<ElementosCarrito> findAll();
	String deleteByElementoid(@Param("elementoid") Long elementoid);
}

