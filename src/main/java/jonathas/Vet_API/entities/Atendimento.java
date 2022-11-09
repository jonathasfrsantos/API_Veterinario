package jonathas.Vet_API.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jonathas.Vet_API.entities.enums.StatusAtendimento;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_atendimento")
public class Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dataAgendada;
	private LocalDateTime dataRealizacao;
	private StatusAtendimento status;
	
	@Transient
	private Pet pet;
	
	@Transient
	private Veterinario veterinario;
	
	@Transient
	private List<Servico> servicos = new ArrayList<>();

	public Atendimento(Long id, LocalDateTime dataAgendada, LocalDateTime dataRealizacao, StatusAtendimento status,
			Pet pet, Veterinario veterinario) {
		this.id = id;
		this.dataAgendada = dataAgendada;
		this.dataRealizacao = dataRealizacao;
		this.status = status;
		this.pet = pet;
		this.veterinario = veterinario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(LocalDateTime dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public LocalDateTime getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(LocalDateTime dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public StatusAtendimento getStatus() {
		return status;
	}

	public void setStatus(StatusAtendimento status) {
		this.status = status;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	public List<Servico> getServicos(){
		return servicos;
	}
	
	
	
	
	
	
	
	
	

}
