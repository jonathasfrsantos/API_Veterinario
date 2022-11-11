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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_tutorCadastro")
public class TutorCadastro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	private String email;
	private String celular;
	private String cep;
	private String Logradouro;
	private String num_logradouro;
	private String cidade;
	
	@Transient
	private Tutor tutor;

	public TutorCadastro(Long id, String email, String celular, String cep, String logradouro, String num_logradouro,
			String cidade, Tutor tutor) {
		
		
		this.id = id;
		this.email = email;
		this.celular = celular;
		this.cep = cep;
		Logradouro = logradouro;
		this.num_logradouro = num_logradouro;
		this.cidade = cidade;
		this.tutor = tutor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public String getNum_logradouro() {
		return num_logradouro;
	}

	public void setNum_logradouro(String num_logradouro) {
		this.num_logradouro = num_logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
	
	
	
	
	
	
	
	

}
