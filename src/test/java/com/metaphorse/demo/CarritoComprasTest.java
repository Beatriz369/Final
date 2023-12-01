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
import com.methaphorse.demo.model.CarritoCompras;
import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.model.CarritoCompras;
import com.methaphorse.demo.repository.CarritoComprasRepository;
import com.methaphorse.demo.repository.CarritoComprasRepository;
import com.methaphorse.demo.service.CarritoComprasService;
import com.methaphorse.demo.service.CarritoComprasService;
import com.methaphorse.demo.serviceImpl.CarritoComprasServiceImpl;
import com.methaphorse.demo.serviceImpl.CarritoComprasServiceImpl;


@SpringBootTest(classes = { CarritoComprasService.class, CarritoComprasServiceImpl.class, CarritoComprasRepository.class })//aqui llamar clases
@ContextConfiguration

public class CarritoComprasTest {
	@InjectMocks
	private CarritoComprasService Service = new CarritoComprasServiceImpl();// aqui

	@MockBean
	private CarritoComprasRepository repository;//aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		CarritoCompras rol = new CarritoCompras(1L,1, "2023-11-01");
		List<CarritoCompras> roles = new ArrayList<CarritoCompras>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<CarritoCompras> roles2 = Service.llamartodos();

		assertEquals(1, roles2.size());
		
		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		CarritoCompras rol = new CarritoCompras(1,1, "2023-11-01");

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
		CarritoCompras rol = new CarritoCompras(1,1, "2023-11-01");

		when(repository.findByCarritoid(1L)).thenReturn(rol);
		CarritoCompras rolesGet = Service.llamaruno(1L);

		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		CarritoCompras rol = new CarritoCompras(1L,1, "2023-11-01");

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.modificar(rol);
		assertNotNull(rolesGet);

	}

	
	  @Test public void eliminarTest() throws Exception {
	  when(repository.deleteByCarritoid(1L)).thenReturn("Eliminado");
	  String ServiceE = Service.eliminar(1L);
	  assertEquals("Eliminado", ServiceE);
	  }
	 




}
