package pe.veterinaria.lima.msgestionatencionmascota.constantes;

import pe.veterinaria.lima.msgestionatencionmascota.utilitarios.ErrorCodeMessage;


public enum EnumCatalogo implements ErrorCodeMessage {

	CATALOGO_ERROR_42201(42201, "El campo descripcion mascota es incorrecto."),
	CATALOGO_ERROR_42202(42202, "El campo edad mascota es incorrecto."),
	CATALOGO_ERROR_42203(42203, "El campo dueño de mascota es incorrecto."),
	
	CATALOGO_ERROR_42204(42204, "El campo estado mascota es incorrecto."),
	CATALOGO_ERROR_42205(42205, "El campo genero mascota es incorrecto."),
	CATALOGO_ERROR_42206(42206, "El campo nombre mascota es incorrecto."),
	
	CATALOGO_ERROR_42207(42207, "El campo peso mascota es incorrecto."),
	CATALOGO_ERROR_42208(42208, "El campo salud mascota es incorrecto."),
	CATALOGO_ERROR_42209(42208, "El campo raza mascota es incorrecto."),
	;


	EnumCatalogo(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private final int code;
	private final String msg;

	@Override
	public int getCodigo() {
		return code;
	}

	@Override
	public String getMensaje() {
		return msg;
	}


}
