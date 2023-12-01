package com.metaphorse.demo;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import com.methaphorse.demo.controller.ResourceNotFoundException;
import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.repository.RolRepository;
import com.methaphorse.demo.service.RolService;
import com.methaphorse.demo.serviceImpl.RolServiceImpl;

@SpringBootTest(classes = { RolService.class, RolServiceImpl.class, RolRepository.class })//aqui llamar clases
@ContextConfiguration



//Revisar tipode datos en ids  long bd   

class RolesTests {

	@InjectMocks
	private RolService rolService = new RolServiceImpl();// aqui

	@MockBean
	private RolRepository repository;//aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() throws ResourceNotFoundException {
		Rol rol = new Rol(1l, "Vendedor", "rol del vendedor");
		List<Rol> roles = new ArrayList<Rol>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<Rol> roles2 = rolService.llamaroles();

		assertEquals(1, roles2.size());
		
		System.out.println(roles2.size());
	}

	
	
	
	
	@Test
	public void guardarTest() {
		Rol rol = new Rol(1l, "Vendedor", "rol del vendedor");

		when(repository.save(rol)).thenReturn(rol);
		Rol rolesGet = rolService.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() throws ResourceNotFoundException {
		Rol rol = new Rol(1l, "Vendedor", "rol del vendedor");

		when(repository.findByRolid(1L)).thenReturn(rol);
		Rol rolesGet = rolService.llamarol(1L);

		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		Rol rol = new Rol(1l, "Vendedor", "rol del vendedor");

		when(repository.save(rol)).thenReturn(rol);
		Rol rolesGet = rolService.modificar(rol);

		assertNotNull(rolesGet);

	}

	
	  @Test public void eliminarTest() throws Exception {
	  when(repository.deleteByRolid(1L)).thenReturn("Eliminado"); String
	  rolServiceE =rolService.eliminar(1L); assertEquals("Eliminado", rolServiceE);
	  }
	 



}