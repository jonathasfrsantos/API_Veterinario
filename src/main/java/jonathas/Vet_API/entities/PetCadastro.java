package jonathas.Vet_API.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_petCadastro")
public class PetCadastro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean vermifugado;
	private String peso;
	private String observacoes;
	private Boolean castrado;
	
	@Transient
	private Pet pet;

	public PetCadastro(Long id, Boolean vermifugado, String peso, String observacoes, Boolean castrado, Pet pet) {
		this.id = id;
		this.vermifugado = vermifugado;
		this.peso = peso;
		this.observacoes = observacoes;
		this.castrado = castrado;
		this.pet = pet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getVermifugado() {
		return vermifugado;
	}

	public void setVermifugado(Boolean vermifugado) {
		this.vermifugado = vermifugado;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
	
	
	
	

}
