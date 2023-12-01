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
import com.methaphorse.demo.model.ComentarioResena;
import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.repository.ComentarioResenaRepository;
import com.methaphorse.demo.repository.ComentarioResenaRepository;
import com.methaphorse.demo.service.ComentarioResenaService;
import com.methaphorse.demo.service.ComentarioResenaService;
import com.methaphorse.demo.serviceImpl.ComentarioResenaServiceImpl;
import com.methaphorse.demo.serviceImpl.ComentarioResenaServiceImpl;


@SpringBootTest(classes = { ComentarioResenaService.class, ComentarioResenaServiceImpl.class, ComentarioResenaRepository.class })//aqui llamar clases
@ContextConfiguration

public class ComentarioResenaTest {
	@InjectMocks
	private ComentarioResenaService rolService = new ComentarioResenaServiceImpl();// aqui

	@MockBean
	private ComentarioResenaRepository repository;//aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		ComentarioResena rol = new ComentarioResena(1L,1,1,"Megusro mi celular", 10,"2023-11-01");
		List<ComentarioResena> roles = new ArrayList<ComentarioResena>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<ComentarioResena> roles2 = rolService.llamartodos();

		assertEquals(1, roles2.size());
		
		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		ComentarioResena rol = new ComentarioResena(1L,1,1,"Megusro mi celular", 10,"2023-11-01");

		when(repository.save(rol)).thenReturn(rol);
		ComentarioResena rolesGet = rolService.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
		ComentarioResena rol = new ComentarioResena(1L,1,1,"Megusro mi celular", 10,"2023-11-01");

		when(repository.findByComentarioid(1L)).thenReturn(rol);
		ComentarioResena rolesGet = rolService.llamaruno(1L);

		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		ComentarioResena rol = new ComentarioResena(1L,1,1,"Megusro mi celular", 10,"2023-11-01");

		when(repository.save(rol)).thenReturn(rol);
		ComentarioResena rolesGet = rolService.modificar(rol);

		assertNotNull(rolesGet);

	}

	
	  @Test public void eliminarTest() throws Exception {
	  when(repository.deleteByComentarioid(1L)).thenReturn("Eliminado"); 
	String   rolServiceE =rolService.eliminar(1L); assertEquals("Eliminado", rolServiceE);
	  }
	 

}
