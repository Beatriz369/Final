package com.methaphorse.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.Compradores;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface CompradoresRepository extends JpaRepository<Compradores, Long> {
	Compradores findByCompradorid(@Param("compradorid") Long compradorid);
	List<Compradores> findAll();
	String deleteByCompradorid(@Param("compradorid") Long compradorid);


}
