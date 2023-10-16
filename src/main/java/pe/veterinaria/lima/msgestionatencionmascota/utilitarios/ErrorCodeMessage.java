package pe.veterinaria.lima.msgestionatencionmascota.utilitarios;

public interface ErrorCodeMessage {

	int getCodigo();
	String getMensaje();

	default String getMensaje(Object[] args) {
		return String.format(getMensaje(), (Object[]) args);
	}

}
