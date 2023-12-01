
package com.methaphorse.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.Vendedor;
import jakarta.transaction.Transactional;

/**
 * @author INVITADO 1
 *
 */

	@Repository
	@Transactional
	public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
		Vendedor findByVendedorid(@Param("vendedorid") Long vendedorid);
		List<Vendedor> findAll();
		String deleteByVendedorid(@Param("vendedorid") Long vendedorid);
}
	
	
		