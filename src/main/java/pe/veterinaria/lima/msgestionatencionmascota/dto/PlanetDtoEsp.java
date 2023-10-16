package pe.veterinaria.lima.msgestionatencionmascota.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PlanetDtoEsp {

	private String nombre;
	private String periodo_rotacion;
	private String periodo_orbital;
	private String diametro;
	private String clima;
	private String gravedad;
	private String terreno;
	private String superficie_agua;
	private String poblacion;
	private List<String> residentes;
	private List<String> pelicula;
	private LocalDateTime  creado ;
	private LocalDateTime  modificado ;
	private String url;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeriodo_rotacion() {
		return periodo_rotacion;
	}
	public void setPeriodo_rotacion(String periodo_rotacion) {
		this.periodo_rotacion = periodo_rotacion;
	}
	public String getPeriodo_orbital() {
		return periodo_orbital;
	}
	public void setPeriodo_orbital(String periodo_orbital) {
		this.periodo_orbital = periodo_orbital;
	}
	public String getDiametro() {
		return diametro;
	}
	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getGravedad() {
		return gravedad;
	}
	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public String getSuperficie_agua() {
		return superficie_agua;
	}
	public void setSuperficie_agua(String superficie_agua) {
		this.superficie_agua = superficie_agua;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public List<String> getResidentes() {
		return residentes;
	}
	public void setResidentes(List<String> residentes) {
		this.residentes = residentes;
	}
	public List<String> getPelicula() {
		return pelicula;
	}
	public void setPelicula(List<String> pelicula) {
		this.pelicula = pelicula;
	}
	public LocalDateTime getCreado() {
		return creado;
	}
	public void setCreado(LocalDateTime creado) {
		this.creado = creado;
	}
	public LocalDateTime getModificado() {
		return modificado;
	}
	public void setModificado(LocalDateTime modificado) {
		this.modificado = modificado;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	
	
}
