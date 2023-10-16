package pe.veterinaria.lima.msgestionatencionmascota.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="MASCOTAS_V")
public class MascotaEntity  implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_MASC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_MASCOTA_V")
	private long idMascota ;

	@Column(name="ID_DUENO")
	private long idDueno;
	
	@Column(name="DESC_MASC")
	 private String   descripMascota ;
	
	@Column(name="NOMB_MASC")
	 private String   nombreMascota ;
	
	@Column(name="ID_RAZA")
	private long idRaza;
	
	@Column(name="PESO")
	private String pesoMascota;
	
	@Column(name="EDAD")
	private long edadMascota;
	
	@Column(name="GENERO")
	 private String   generoMascota ;
	
	
	@Column(name="ESTADOSALUD")
	 private String   saludMascota ;
	
	@Column(name="ESTADO")
	 private String   estadoMascota ;
	
	@Column(name="FECREGISTRO")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
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
		return "Mascota [idMascota=" + idMascota + ", idDueno=" + idDueno + ", descripMascota=" + descripMascota
				+ ", nombreMascota=" + nombreMascota + ", idRaza=" + idRaza + ", pesoMascota=" + pesoMascota
				+ ", edadMascota=" + edadMascota + ", generoMascota=" + generoMascota + ", saludMascota=" + saludMascota
				+ ", estadoMascota=" + estadoMascota + ", fecRegistroMascota=" + fecRegistroMascota + "]";
	}
	   
	

	
	 
	
	
	 
}
