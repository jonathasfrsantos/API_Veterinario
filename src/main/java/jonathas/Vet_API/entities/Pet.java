package jonathas.Vet_API.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_pet")
public class Pet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String especie;
	private String raca;
	private String cor;
	private String sexo;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_tutor")
	private Tutor tutor;
	
	@Transient
	private List<Vacina> cadernetaVacinacao = new ArrayList<>();
	
	@Transient
	private Set<Atendimento> atendimentos = new HashSet<>();

	public Pet(Long id, String especie, String raca, String cor, String sexo, String nome, Tutor tutor) {
		this.id = id;
		this.especie = especie;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
		this.nome = nome;
		this.tutor = tutor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
	public List<Vacina> getVacinas(){
		return cadernetaVacinacao;
		
	}
	
	public Set<Atendimento> getAtendimentos(){
		return atendimentos;
	}
	
	
	
	
	
	
	
	

}
