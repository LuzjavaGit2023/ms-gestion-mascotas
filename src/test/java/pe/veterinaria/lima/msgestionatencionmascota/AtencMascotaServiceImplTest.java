package pe.veterinaria.lima.msgestionatencionmascota;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;
import pe.veterinaria.lima.msgestionatencionmascota.repository.MascotaRepository;
import pe.veterinaria.lima.msgestionatencionmascota.response.MascMessageResponse;
import pe.veterinaria.lima.msgestionatencionmascota.service.AtencionMascotaService;

class AtencMascotaServiceImplTest {

	@Autowired
	MascotaRepository mascotaRep;
	
//	@Mock
	private AtencionMascotaService atenMascotaService;
	
	ObjectMapper mapper = new ObjectMapper();
	
	@BeforeEach
	public void setUp() throws Exception{
		this.atenMascotaService = mock(AtencionMascotaService.class);
	}
	
	@Test
	void consultaMascota() {
		
		MascotaDto mascotaDto = new MascotaDto();
		MascMessageResponse mascMessResponse = new MascMessageResponse();
		mascMessResponse = atenMascotaService.consultMascota(2);
		mascotaDto = mascMessResponse.getMascotaDto();
		assertNotNull(mascotaDto);
		assertEquals("Ted",mascotaDto.getNombreMascota());
		
	
		
	}
	

	
	@Test
	void test() {

	}

}
