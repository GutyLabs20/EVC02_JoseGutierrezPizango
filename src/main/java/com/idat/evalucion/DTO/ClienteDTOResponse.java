package com.idat.evalucion.DTO;

public class ClienteDTOResponse {
	private Integer idClienteDTO;
	private String nombreDTO;
	private String direccionDTO;
	private String dniDTO;
	public Integer getIdClienteDTO() {
		return idClienteDTO;
	}
	public void setIdClienteDTO(Integer idClienteDTO) {
		this.idClienteDTO = idClienteDTO;
	}
	public String getNormbreDTO() {
		return nombreDTO;
	}
	public void setNormbreDTO(String normbreDTO) {
		this.nombreDTO = normbreDTO;
	}
	public String getDireccionDTO() {
		return direccionDTO;
	}
	public void setDireccionDTO(String direccionDTO) {
		this.direccionDTO = direccionDTO;
	}
	public String getDniDTO() {
		return dniDTO;
	}
	public void setDniDTO(String dniDTO) {
		this.dniDTO = dniDTO;
	}
}
