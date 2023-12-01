package com.methaphorse.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.Transaccion;



	@Repository
	public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
		Transaccion findByTransaccionid(@Param("transaccionid") Long transaccionid);
			List<Transaccion> findAll();
		String deleteByTransaccionid(@Param("transaccionid") Long transaccionid);
}
