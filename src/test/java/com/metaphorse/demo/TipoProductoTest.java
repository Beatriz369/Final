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
import com.methaphorse.demo.model.TipoProducto;
import com.methaphorse.demo.model.Vendedor;
import com.methaphorse.demo.model.TipoProducto;
import com.methaphorse.demo.repository.TipoProductoRepository;
import com.methaphorse.demo.repository.TipoProductoRepository;
import com.methaphorse.demo.service.TipoProductoService;
import com.methaphorse.demo.service.TipoProductoService;
import com.methaphorse.demo.serviceImpl.TipoProductoServiceImpl;
import com.methaphorse.demo.serviceImpl.TipoProductoServiceImpl;

@SpringBootTest(classes = { TipoProductoService.class, TipoProductoServiceImpl.class, TipoProductoRepository.class }) // aqui
																														// llamar
																														// clases
@ContextConfiguration

public class TipoProductoTest {
	@InjectMocks
	private TipoProductoService rolService = new TipoProductoServiceImpl();// aqui

	@MockBean
	private TipoProductoRepository repository;// aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		TipoProducto rol = new TipoProducto(1L, "telefonia celular");
		List<TipoProducto> roles = new ArrayList<TipoProducto>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<TipoProducto> roles2 = rolService.llamartodos();

		assertEquals(1, roles2.size());

		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		TipoProducto rol = new TipoProducto(1L, "telefonia celular");

		when(repository.save(rol)).thenReturn(rol);
		String  rolesGet = rolService.guardar(rol);

		assertNotNull(rolesGet);

	}
	

	@Test
	public void llamarolTest() {
		TipoProducto rol = new TipoProducto(1L, "telefonia celular");

		when(repository.findByTipoproductoid(1L)).thenReturn(rol);
		TipoProducto rolesGet = rolService.llamaruno(1L);

		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		TipoProducto rol = new TipoProducto(1L, "telefonia celular");

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = rolService.modificar(rol);

		assertNotNull(rolesGet);

	}

	@Test public void eliminarTest() throws Exception {
	  when(repository.deleteByTipoproductoid(1L)).thenReturn("Eliminado"); String
	  rolServiceE =rolService.eliminar(1L); assertEquals("Eliminado", rolServiceE);
	  }

}
