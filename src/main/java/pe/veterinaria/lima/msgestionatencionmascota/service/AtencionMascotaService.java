package pe.veterinaria.lima.msgestionatencionmascota.service;

import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDto;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDtoEsp;
import pe.veterinaria.lima.msgestionatencionmascota.dto.PlanetDto;
import pe.veterinaria.lima.msgestionatencionmascota.exception.UnprocessableEntityException;
import pe.veterinaria.lima.msgestionatencionmascota.response.MascMessageResponse;

public interface AtencionMascotaService {
		
	void insertMascota ( MascotaDto mascotaDto) throws UnprocessableEntityException;
	MascMessageResponse consultMascota(long id);
	PlanetDtoEsp consultApi(long id);
	
}
