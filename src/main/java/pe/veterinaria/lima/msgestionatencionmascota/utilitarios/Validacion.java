package pe.veterinaria.lima.msgestionatencionmascota.utilitarios;

import java.util.ArrayList;
import java.util.List;

import pe.veterinaria.lima.msgestionatencionmascota.constantes.EnumCatalogo;
import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;
import pe.veterinaria.lima.msgestionatencionmascota.exception.UnprocessableEntityException;


public class Validacion {

    private Validacion(){}

    public static void validacionMascota(MascotaDto mascotaDto) throws UnprocessableEntityException {
        List<ErrorMessageVO> lstErrores = new ArrayList<>();


        if(mascotaDto.getDescripMascota().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42201));
        }
        
        if(mascotaDto.getEstadoMascota().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42204));
        }
        
        if(mascotaDto.getGeneroMascota().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42205));
        }
        
        if(mascotaDto.getNombreMascota().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42206));
        }
        
        if(mascotaDto.getPesoMascota().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42207));
        }
        
        if(mascotaDto.getSaludMascota().trim().isEmpty()){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42208));
        }
        
        if(mascotaDto.getEdadMascota()==0){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42202));
        }
        
        if( mascotaDto.getIdDueno() == 0  ){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42203));
        }
        
        if( mascotaDto.getIdRaza() == 0  ){
            lstErrores.add(new ErrorMessageVO(EnumCatalogo.CATALOGO_ERROR_42209));
        }
        
        if(!lstErrores.isEmpty()){
            throw new UnprocessableEntityException(lstErrores);
        }
    }


}
