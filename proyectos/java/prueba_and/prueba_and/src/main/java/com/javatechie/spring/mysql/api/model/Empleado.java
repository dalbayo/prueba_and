package com.javatechie.spring.mysql.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleado")
public class Empleado  implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 110896036618682551L;
	@Id
    @GeneratedValue
	private Long id; 
	@Column(name = "tipo_documento")
	private Integer tipoDocumento;  
	private String documento; 
	private String nombres; 
	private String apellidos;
    @Column(name = "fecha_inicio", nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
	private Date fechaInicio; 
    @Column(name = "fecha_fin", nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
	private Date fechaFin; 
    @Column(name = "fecha_auditoria", nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
	private Date fechaAuditoria; 
    @Column(name = "usr_auditoria")
	private String usrAuditoria;

	public Empleado() {

	}

	public Empleado(Long id, Integer tipoDocumento, String documento, String nombres, String apellidos,
			Date fechaInicio, Date fechaFin, Date fechaAuditoria, String usrAuditoria) {
		super();
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaAuditoria = fechaAuditoria;
		this.usrAuditoria = usrAuditoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaAuditoria() {
		return fechaAuditoria;
	}

	public void setFechaAuditoria(Date fechaAuditoria) {
		this.fechaAuditoria = fechaAuditoria;
	}

	public String getUsrAuditoria() {
		return usrAuditoria;
	}

	public void setUsrAuditoria(String usrAuditoria) {
		this.usrAuditoria = usrAuditoria;
	}

	@Override
	public String toString() {
		/*return "Empleado [id=" + id + ", tipoDocumento=" + tipoDocumento + ", documento=" + documento + ", nombres="
				+ nombres + ", apellidos=" + apellidos + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", fechaAuditoria=" + fechaAuditoria + ", usrAuditoria=" + usrAuditoria + "]";*/
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [id=");
		builder.append(id);
		builder.append(", tipoDocumento=");
		builder.append(tipoDocumento);
		builder.append(", documento=");
		builder.append(documento);
		builder.append(", nombres=");
		builder.append(nombres);
		builder.append(", apellidos=");
		builder.append(apellidos);

		builder.append(", fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", fechaAuditoria=");
		builder.append(fechaAuditoria);
		builder.append(", usrAuditoria=");
		builder.append(usrAuditoria);
		builder.append("]");
		return builder.toString();
	}
	
	

}
