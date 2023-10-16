package pe.veterinaria.lima.msgestionatencionmascota.service.impl;


import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDto;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDtoEsp;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDto;
import pe.veterinaria.lima.msgestionatencionmascota.entity.MascotaEntity;
import pe.veterinaria.lima.msgestionatencionmascota.exception.UnprocessableEntityException;
import pe.veterinaria.lima.msgestionatencionmascota.repository.MascotaRepository;
import pe.veterinaria.lima.msgestionatencionmascota.response.MascCabeceraResponse;
import pe.veterinaria.lima.msgestionatencionmascota.response.MascMessageResponse;
import pe.veterinaria.lima.msgestionatencionmascota.service.AtencionMascotaService;
import pe.veterinaria.lima.msgestionatencionmascota.utilitarios.Validacion;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AtencionMascotaServiceImpl implements AtencionMascotaService{

	@Autowired
	private MascotaRepository mascotaRepository;
	

	
	@Override
	public void insertMascota(MascotaDto mascotaDto) throws UnprocessableEntityException{
		
		try {
			LocalDateTime localDateTime = LocalDateTime.now();

			Validacion.validacionMascota(mascotaDto);
			MascotaEntity MascotEntity =new MascotaEntity();
			MascotEntity= this.getEntityMascotaDto(mascotaDto);
			MascotEntity.setFecRegistroMascota(localDateTime);
			
			mascotaRepository.save(MascotEntity);
		}
		catch(Exception e) {
			System.out.println("Error al insertar datos de Mascota => " + e.getMessage());
		}
		
	}

	@Override
	public MascMessageResponse consultMascota(long id) {
		MascCabeceraResponse cabResponse = new MascCabeceraResponse();
		MascMessageResponse msgResponse = new MascMessageResponse();
		MascotaEntity mascotaEntity = new MascotaEntity();
		
		mascotaEntity = mascotaRepository.getReferenceById(id);
		
			cabResponse.setCodigo(200);
			cabResponse.setIdRastreo("Exito en consulta datos de Mascota :"+id);
			
			msgResponse.setCabResponse(cabResponse);
			msgResponse.setMensaje("Registro consultado existe");

			msgResponse.setMascotaDto(this.getNovedadesVO(mascotaEntity));
			
			return msgResponse;

	}
	

	private MascotaEntity getEntityMascotaDto(MascotaDto mascotaDto) {
		MascotaEntity mascotEntity = new MascotaEntity();
		BeanUtils.copyProperties(mascotaDto, mascotEntity);
		return mascotEntity;
	}

	private MascotaDto getNovedadesVO(MascotaEntity mascotaEntity)  {
		
		MascotaDto mascotaDto=new MascotaDto();
		BeanUtils.copyProperties(mascotaEntity,mascotaDto);
			
		return mascotaDto;
	}

	@Override
	public PlanetDtoEsp consultApi(long id) {
		String sUrl= "https://swapi.py4e.com/api/planets/"+id+"/";
		RestTemplate restTemplate = new RestTemplate();
		PlanetDto response   = restTemplate.getForObject(sUrl, PlanetDto.class);
		PlanetDtoEsp planetDtoEsp= new PlanetDtoEsp();
		planetDtoEsp.setClima(response.getClimate());
		planetDtoEsp.setCreado(response.getCreated());
		planetDtoEsp.setDiametro(response.getDiameter());
		planetDtoEsp.setGravedad(response.getGravity());
		planetDtoEsp.setModificado(response.getEdited());
		planetDtoEsp.setNombre(response.getName());
		planetDtoEsp.setPelicula(response.getFilms());
		planetDtoEsp.setPeriodo_orbital(response.getOrbital_period());
		planetDtoEsp.setPeriodo_rotacion(response.getRotation_period());
		planetDtoEsp.setPoblacion(response.getPopulation());
		planetDtoEsp.setResidentes(response.getResidents());
		planetDtoEsp.setSuperficie_agua(response.getSurface_water());
		planetDtoEsp.setTerreno(response.getTerrain());
		planetDtoEsp.setUrl(response.getUrl());
		
		return planetDtoEsp;
	}


	

	
}
