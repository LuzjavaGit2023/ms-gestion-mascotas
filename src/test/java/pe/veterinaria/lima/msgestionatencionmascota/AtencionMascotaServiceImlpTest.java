package pe.veterinaria.lima.msgestionatencionmascota;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;
import pe.veterinaria.lima.msgestionatencionmascota.entity.MascotaEntity;
import pe.veterinaria.lima.msgestionatencionmascota.repository.MascotaRepository;
import pe.veterinaria.lima.msgestionatencionmascota.response.MascMessageResponse;
import pe.veterinaria.lima.msgestionatencionmascota.service.AtencionMascotaService;


import static org.mockito.Mockito.*;

public class AtencionMascotaServiceImlpTest {

	@Autowired
	MascotaRepository mascotaRep;
	
//	@Mock
	private AtencionMascotaService atenMascotaService;
	
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
		
//		mascotaRep = mock(MascotaRepository.class);
//		atenMascotaService.= (mascotaRep);
		
		
	}
	
}
