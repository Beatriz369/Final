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

import com.methaphorse.demo.model.Transaccion;
import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.repository.TransaccionRepository;
import com.methaphorse.demo.repository.TransaccionRepository;
import com.methaphorse.demo.service.TransaccionService;
import com.methaphorse.demo.service.TransaccionService;
import com.methaphorse.demo.serviceImpl.TransaccionServiceImpl;
import com.methaphorse.demo.serviceImpl.TransaccionServiceImpl;

@SpringBootTest(classes = { TransaccionService.class, TransaccionServiceImpl.class, TransaccionRepository.class }) // aqui
																													// llamar
																													// clases
@ContextConfiguration

public class TransaccionTest {
	@InjectMocks
	private TransaccionService Service = new TransaccionServiceImpl();// aqui

	@MockBean
	private TransaccionRepository repository;// aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		Transaccion rol = new Transaccion(1L, 1, "22-11-2023", "mi casa 22", "Pagado", 56000);
		List<Transaccion> roles = new ArrayList<Transaccion>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<Transaccion> roles2 = Service.llamartodos();

		assertEquals(1, roles2.size());

		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		Transaccion rol = new Transaccion(1L, 1, "22-11-2023", "mi casa 22", "Pagado", 56000);
		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
		Transaccion rol = new Transaccion(1L, 1, "22-11-2023", "mi casa 22", "Pagado", 56000);
		when(repository.findByTransaccionid(1L)).thenReturn(rol);
		Transaccion rolesGet = Service.llamaruno(1L);
		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		Transaccion rol = new Transaccion(1L, 1, "22-11-2023", "mi casa 22", "Pagado", 56000);
		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.modificar(rol);
		assertNotNull(rolesGet);

	}

	@Test public void eliminarTest() throws Exception {
	  when(repository.deleteByTransaccionid(1L)).thenReturn("Eliminado"); 
	  String rolServiceE =Service.eliminar(1L); assertEquals("Eliminado", rolServiceE);
	  }

}
