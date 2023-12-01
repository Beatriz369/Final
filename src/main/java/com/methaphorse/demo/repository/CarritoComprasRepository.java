package com.methaphorse.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.CarritoCompras;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public interface CarritoComprasRepository extends JpaRepository<CarritoCompras, Long> {
	CarritoCompras findByCarritoid(@Param("carritoid") Long carritoid);

	List<CarritoCompras> findAll();

	String deleteByCarritoid(@Param("carritoid") Long carritoid);

}
