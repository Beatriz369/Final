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
import com.methaphorse.demo.model.ElementosCarrito;
import com.methaphorse.demo.model.Producto;
import com.methaphorse.demo.model.ElementosCarrito;
import com.methaphorse.demo.repository.ElementosCarritoRepository;
import com.methaphorse.demo.repository.ElementosCarritoRepository;
import com.methaphorse.demo.service.ElementosCarritoService;
import com.methaphorse.demo.service.ElementosCarritoService;
import com.methaphorse.demo.serviceImpl.ElementosCarritoServiceImpl;
import com.methaphorse.demo.serviceImpl.ElementosCarritoServiceImpl;

@SpringBootTest(classes = { ElementosCarritoService.class, ElementosCarritoServiceImpl.class,
		ElementosCarritoRepository.class }) // aqui llamar clases
@ContextConfiguration
public class ElementosCarritoTest {
	@InjectMocks
	private ElementosCarritoService Service = new ElementosCarritoServiceImpl();// aqui

	@MockBean
	private ElementosCarritoRepository repository;// aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		ElementosCarrito rol = new ElementosCarrito(1L, 1, 1, 1);
		List<ElementosCarrito> roles = new ArrayList<ElementosCarrito>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<ElementosCarrito> roles2 = Service.llamartodos();

		assertEquals(1, roles2.size());

		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		ElementosCarrito rol = new ElementosCarrito(1L, 1, 1, 1);

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
		ElementosCarrito rol = new ElementosCarrito(1L, 1, 1, 1);
		when(repository.findByElementoid(1L)).thenReturn(rol);
		ElementosCarrito rolesGet = Service.llamaruno(1L);
		assertNotNull(rolesGet);

	}

	
	
	
	
	
	@Test
	public void modificarTest() {
		ElementosCarrito rol = new ElementosCarrito(1L, 1, 1, 1);

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.modificar(rol);
		assertNotNull(rolesGet);

	}

	@Test public void eliminarTest() throws Exception {
	  when(repository.deleteByElementoid(1L)).thenReturn("Eliminado"); 
	  String rolServiceE = Service.eliminar(1L); 
	  assertEquals("Eliminado", rolServiceE);
	  }

}
