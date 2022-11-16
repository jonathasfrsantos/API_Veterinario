package jonathas.Vet_API.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_veterinario")
public class Veterinario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String CRMV;
	private String celular;
	private String email;
	private String especialidade;
	
	@Transient
	@JsonIgnore
	@OneToMany(mappedBy = "atendimentos")
	private Set<Atendimento> atendimentos = new HashSet<>();

	public Veterinario(Long id, String nome, String CRMV, String celular, String email, String especialidade) {
		this.id = id;
		this.nome = nome;
		this.CRMV = CRMV;
		this.celular = celular;
		this.email = email;
		this.especialidade = especialidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCRMV() {
		return CRMV;
	}

	public void setCRMV(String cRMV) {
		CRMV = cRMV;
	}
	

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public Set<Atendimento> getAtendimentos(){
		return atendimentos;
	}
	
	
	
	
	
	
	

}
