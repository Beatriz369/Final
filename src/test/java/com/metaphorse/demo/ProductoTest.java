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
import com.methaphorse.demo.model.Producto;
import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.model.Vendedor;
import com.methaphorse.demo.repository.ProductoRepository;
import com.methaphorse.demo.service.ProductoService;
import com.methaphorse.demo.serviceImpl.ProductoServiceImpl;

@SpringBootTest(classes = { ProductoService.class, ProductoServiceImpl.class, ProductoRepository.class }) // aqui llamar
																											// clases
@ContextConfiguration

public class ProductoTest {
	@InjectMocks
	private ProductoService rolService = new ProductoServiceImpl();// aqui

	@MockBean
	private ProductoRepository repository;// aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		Producto rol = new Producto(1L,"iphone 15", "telefono alta gamma",3500, 1,1);
		List<Producto> roles = new ArrayList<Producto>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<Producto> roles2 = rolService.llamartodos();

		assertEquals(1, roles2.size());

		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		Producto rol = new Producto(1L,"iphone 15", "telefono alta gamma",3500, 1,1);
		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = rolService.guardar(rol);
		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
	Producto rol = new Producto(1L,"iphone 15", "telefono alta gamma",3500, 1,1);
		when(repository.findByProductoid(1L)).thenReturn(rol);
		Producto rolesGet = rolService.llamaruno(1L);
		assertNotNull(rolesGet);

	}
	
	
	
	

	@Test
	public void modificarTest() {
		Producto rol = new Producto(1L,"iphone 15", "telefono alta gamma",3500, 1,1);

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = rolService.modificar(rol);

		assertNotNull(rolesGet);

	}

	@Test public void eliminarTest() throws Exception {
	  when(repository.deleteByProductoid(1L)).thenReturn("Eliminado"); 
	  String  rolServiceE = rolService.eliminar(1L);
	  assertEquals("Eliminado", rolServiceE);
	  }
	
}
