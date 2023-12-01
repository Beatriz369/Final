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

import com.methaphorse.demo.model.Vendedor;
import com.methaphorse.demo.repository.VendedorRepository;
import com.methaphorse.demo.service.VendedorService;
import com.methaphorse.demo.serviceImpl.VendedorServiceImpl;

@SpringBootTest(classes = { VendedorService.class, VendedorServiceImpl.class, VendedorRepository.class })//aqui llamar clases
@ContextConfiguration

public class VendedorTest {
	@InjectMocks
	private VendedorService Service = new VendedorServiceImpl();// aqui

	@MockBean
	private VendedorRepository repository;//aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		Vendedor rol = new Vendedor(1l,1, "Vendedor", "rol del vendedor");
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		vendedores.add(rol);

		when(repository.findAll()).thenReturn(vendedores);
		List<Vendedor> vendedores2 = Service.llamartodos();

		assertEquals(1, vendedores2.size());
		
		System.out.println(vendedores2.size());
	}

	@Test
	public void guardarTest() {
		Vendedor vendedore = new Vendedor(1l,1, "x", "x 345");

		when(repository.save(vendedore)).thenReturn(vendedore);
		String vendedoreGet = Service.guardar(vendedore);

		assertNotNull(vendedoreGet);

	}
	@Test
	public void llamarolTest() {
		Vendedor vendedortraer = new Vendedor(1L,1, "Vendedor", "rol del vendedor");

		when(repository.findByVendedorid(1L)).thenReturn(vendedortraer);
		Vendedor vendedorGet = Service.llamaruno(1L);

		assertNotNull(vendedorGet);

	}

	@Test
	public void modificarTest() {
		Vendedor rol = new Vendedor(1L,1, "Vendedor", "rol del vendedor");

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.modificar(rol);

		assertNotNull(rolesGet);

	}

	
	  @Test public void eliminarTest() throws Exception {
	  when(repository.deleteByVendedorid(1L)).thenReturn("Eliminado"); 
	  String rolServiceE = Service.eliminar(1L); 
	  
	  
	  assertEquals("Eliminado", rolServiceE);
	  }
	 
	
}
