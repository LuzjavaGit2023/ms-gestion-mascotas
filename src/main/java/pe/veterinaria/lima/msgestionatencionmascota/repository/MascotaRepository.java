package pe.veterinaria.lima.msgestionatencionmascota.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.veterinaria.lima.msgestionatencionmascota.entity.MascotaEntity;


@Repository
public interface MascotaRepository extends JpaRepository<MascotaEntity,Long>{
		
	
	
	
}
