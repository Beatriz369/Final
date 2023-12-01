package com.methaphorse.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.model.Vendedor;

import java.util.Optional;



	@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
		Usuario findByUserid(@Param("userid") Long userid);
		List<Usuario> findByNombreusuario(@Param("nombreusuario") String nombreusuario);
		List<Usuario> findAll();
		String deleteByUserid(@Param("userid") Long userid);
}
