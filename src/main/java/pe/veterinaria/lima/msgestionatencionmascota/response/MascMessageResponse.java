package pe.veterinaria.lima.msgestionatencionmascota.response;

import pe.veterinaria.lima.msgestionatencionmascota.dto.MascotaDto;

public class MascMessageResponse {

	private MascCabeceraResponse cabResponse;
	private MascotaDto mascotaDto;
	private String mensaje;
	
	public MascCabeceraResponse getCabResponse() {
		return cabResponse;
	}
	public void setCabResponse(MascCabeceraResponse cabResponse) {
		this.cabResponse = cabResponse;
	}
	public MascotaDto getMascotaDto() {
		return mascotaDto;
	}
	public void setMascotaDto(MascotaDto mascotaDto) {
		this.mascotaDto = mascotaDto;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

	
	
	
}
