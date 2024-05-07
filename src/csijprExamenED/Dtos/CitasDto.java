package csijprExamenED.Dtos;

import java.time.LocalDateTime;

public class CitasDto {
	long idCitas;
	String dniClienteEnCitas = "aaaaa";
	String nombreYApellidosCliente= "aaaaa";
	String especialidad = "aaaaa";
	LocalDateTime fechaCita = LocalDateTime.now();

	public long getIdCitas() {
		return idCitas;
	}

	public void setIdCitas(long idCitas) {
		this.idCitas = idCitas;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getDniClienteEnCitas() {
		return dniClienteEnCitas;
	}

	public void setDniClienteEnCitas(String dniClienteEnCitas) {
		this.dniClienteEnCitas = dniClienteEnCitas;
	}
	

	public String getNombreYApellidosCliente() {
		return nombreYApellidosCliente;
	}

	public void setNombreYApellidosCliente(String nombreYApellidosCliente) {
		this.nombreYApellidosCliente = nombreYApellidosCliente;
	}

	public CitasDto() {
		super();
	}

}
