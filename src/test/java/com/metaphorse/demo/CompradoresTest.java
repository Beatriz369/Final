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
import com.methaphorse.demo.model.Compradores;
import com.methaphorse.demo.model.Compradores;
import com.methaphorse.demo.repository.CompradoresRepository;
import com.methaphorse.demo.repository.CompradoresRepository;
import com.methaphorse.demo.service.CompradoresService;
import com.methaphorse.demo.service.CompradoresService;
import com.methaphorse.demo.serviceImpl.CompradoresServiceImpl;
import com.methaphorse.demo.serviceImpl.CompradoresServiceImpl;


@SpringBootTest(classes = { CompradoresService.class, CompradoresServiceImpl.class, CompradoresRepository.class })//aqui llamar clases
@ContextConfiguration
public class CompradoresTest {
	@InjectMocks
	private CompradoresService rolService = new CompradoresServiceImpl();// aqui

	@MockBean
	private CompradoresRepository repository;//aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		Compradores rol = new Compradores(1L, "ALISSON", "Tinckuctu 53",1,1,1);
		List<Compradores> roles = new ArrayList<Compradores>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<Compradores> roles2 = rolService.llamartodos();

		assertEquals(1, roles2.size());
		
		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		Compradores rol = new Compradores(1L, "ALISSON", "Tinckuctu 53",1,1,1);

		when(repository.save(rol)).thenReturn(rol);
		Compradores rolesGet = rolService.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
		Compradores rol = new Compradores(1L, "ALISSON", "Tinckuctu 53",1,1,1);

		when(repository.findByCompradorid(1L)).thenReturn(rol);
		Compradores rolesGet = rolService.llamaruno(1L);

		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		Compradores rol = new Compradores(1L, "ALISSON", "Tinckuctu 53",1,1,1);
		when(repository.save(rol)).thenReturn(rol);
		Compradores rolesGet = rolService.modificar(rol);
		assertNotNull(rolesGet);

	}

	
	  @Test public void eliminarTest() throws Exception {
	  when(repository.deleteByCompradorid(1L)).thenReturn("Eliminado"); 
	  String  rolServiceE = rolService.eliminar(1L);
	  assertEquals("Eliminado", rolServiceE);
	  }
	 

}
