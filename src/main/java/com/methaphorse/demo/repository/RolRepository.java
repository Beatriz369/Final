/**
 * 
 */
package com.methaphorse.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.model.Vendedor;

import jakarta.transaction.Transactional;

/**
 * @author INVITADO 1
 *
 */

	@Repository
	@Transactional
	public interface RolRepository extends JpaRepository<Rol, Long> {
		Rol findByRolid(@Param("rolid") Long rolid);
		List<Rol> findAll();
		String deleteByRolid(@Param("rolid") Long rolid);
}
	
	
	
	