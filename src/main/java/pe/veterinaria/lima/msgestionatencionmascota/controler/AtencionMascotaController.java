package pe.veterinaria.lima.msgestionatencionmascota.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDto;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDtoEsp;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDto;
import pe.veterinaria.lima.msgestionatencionmascota.response.MascMessageResponse;
import pe.veterinaria.lima.msgestionatencionmascota.service.AtencionMascotaService;

import org.springframework.web.bind.annotation.RequestBody;



import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.validation.Valid;

@RestController
@RequestMapping("/atencion")
public class AtencionMascotaController {

	@Autowired
	private AtencionMascotaService atencionMascotaService;

	@PostMapping("/registromascota")
	public Response insertNoved(@Valid  @RequestBody  MascotaDto mascotaDto) {

		try {

			atencionMascotaService.insertMascota(mascotaDto);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro datos de mascota"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarmascot/{id}")
	public ResponseEntity<MascMessageResponse>   findNoved(@PathVariable long id){
		return new ResponseEntity<>(
				atencionMascotaService.consultMascota(id), 
		          HttpStatus.OK);
	}
	
	@GetMapping("consumoapi/{id}")
	public ResponseEntity<PlanetDtoEsp>   consulApi(@PathVariable long id){
		return new ResponseEntity<>(
				atencionMascotaService.consultApi(id), 
		          HttpStatus.OK);
	}
	
}
