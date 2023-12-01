package com.methaphorse.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.ComentarioResena;
import jakarta.transaction.Transactional;



@Repository
@Transactional

	public interface ComentarioResenaRepository extends JpaRepository<ComentarioResena, Long> {
		ComentarioResena findByComentarioid(@Param("comentarioid") Long comentarioid);
		List<ComentarioResena> findAll();
		String deleteByComentarioid(@Param("comentarioid") Long comentarioid);
	
	
}
