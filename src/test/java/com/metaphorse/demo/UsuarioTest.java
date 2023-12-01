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
import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.repository.UsuarioRepository;
import com.methaphorse.demo.repository.UsuarioRepository;
import com.methaphorse.demo.service.UsuarioService;
import com.methaphorse.demo.service.UsuarioService;
import com.methaphorse.demo.serviceImpl.UsuarioServiceImpl;
import com.methaphorse.demo.serviceImpl.UsuarioServiceImpl;

@SpringBootTest(classes = { UsuarioService.class, UsuarioServiceImpl.class, UsuarioRepository.class })//aqui llamar clases
@ContextConfiguration
public class UsuarioTest {
	@InjectMocks
	private UsuarioService Service = new UsuarioServiceImpl();// aqui

	@MockBean
	private UsuarioRepository repository;//aquii

	@BeforeEach
	public void SetUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getallTest() {
		Usuario rol = new Usuario( 1L,"Alisson","aunnose100",  "betuguis@gmail.com",1);
		List<Usuario> roles = new ArrayList<Usuario>();
		roles.add(rol);

		when(repository.findAll()).thenReturn(roles);
		List<Usuario> roles2 = Service.llamartodos();

		assertEquals(1, roles2.size());
		
		System.out.println(roles2.size());
	}

	@Test
	public void guardarTest() {
		Usuario rol = new Usuario(1L,"Alisson","aunnose100",  "betuguis@gmail.com",1);

		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = Service.guardar(rol);

		assertNotNull(rolesGet);

	}

	@Test
	public void llamarolTest() {
		Usuario rol = new Usuario(1L,"Alisson","aunnose100",  "betuguis@gmail.com",1);

		when(repository.findByUserid(1L)).thenReturn(rol);
		Usuario rolesGet = Service.llamaruno(1L);

		assertNotNull(rolesGet);

	}

	@Test
	public void modificarTest() {
		Usuario rol = new Usuario(1L,"Alisson","aunnose100",  "betuguis@gmail.com",1);
		when(repository.save(rol)).thenReturn(rol);
		String rolesGet = (String) Service.modificar(rol);

		assertNotNull(rolesGet);

	}

	
	  @Test public void eliminarTest() throws Exception {
	  when(repository.deleteByUserid(1L)).thenReturn("Eliminado"); String
	  rolServiceE =Service.eliminar(1L); assertEquals("Eliminado", rolServiceE);
	  }
	 
}
