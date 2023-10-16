package pe.veterinaria.lima.msgestionatencionmascota.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;


public class MascotaDto  implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	private long idMascota ;
	private long idDueno;
	 private String   descripMascota ;
	 private String   nombreMascota ;
	private long idRaza;
	private String pesoMascota;
	private long edadMascota;
	 private String   generoMascota ;
	 private String   saludMascota ;
	 private String   estadoMascota ;
	 private LocalDateTime  fecRegistroMascota ;
	 
	public long getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(long idMascota) {
		this.idMascota = idMascota;
	}
	public long getIdDueno() {
		return idDueno;
	}
	public void setIdDueno(long idDueno) {
		this.idDueno = idDueno;
	}
	public String getDescripMascota() {
		return descripMascota;
	}
	public void setDescripMascota(String descripMascota) {
		this.descripMascota = descripMascota;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public long getIdRaza() {
		return idRaza;
	}
	public void setIdRaza(long idRaza) {
		this.idRaza = idRaza;
	}
	public String getPesoMascota() {
		return pesoMascota;
	}
	public void setPesoMascota(String pesoMascota) {
		this.pesoMascota = pesoMascota;
	}
	public long getEdadMascota() {
		return edadMascota;
	}
	public void setEdadMascota(long edadMascota) {
		this.edadMascota = edadMascota;
	}
	public String getGeneroMascota() {
		return generoMascota;
	}
	public void setGeneroMascota(String generoMascota) {
		this.generoMascota = generoMascota;
	}
	public String getSaludMascota() {
		return saludMascota;
	}
	public void setSaludMascota(String saludMascota) {
		this.saludMascota = saludMascota;
	}
	public String getEstadoMascota() {
		return estadoMascota;
	}
	public void setEstadoMascota(String estadoMascota) {
		this.estadoMascota = estadoMascota;
	}
	public LocalDateTime getFecRegistroMascota() {
		return fecRegistroMascota;
	}
	public void setFecRegistroMascota(LocalDateTime fecRegistroMascota) {
		this.fecRegistroMascota = fecRegistroMascota;
	}
	@Override
	public String toString() {
		return "MascotaDto [idMascota=" + idMascota + ", idDueno=" + idDueno + ", descripMascota=" + descripMascota
				+ ", nombreMascota=" + nombreMascota + ", idRaza=" + idRaza + ", pesoMascota=" + pesoMascota
				+ ", edadMascota=" + edadMascota + ", generoMascota=" + generoMascota + ", saludMascota=" + saludMascota
				+ ", estadoMascota=" + estadoMascota + ", fecRegistroMascota=" + fecRegistroMascota + "]";
	}
	

	
	 
	
	
	 
}
