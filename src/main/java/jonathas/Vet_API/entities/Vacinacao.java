package jonathas.Vet_API.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jonathas.Vet_API.entities.PK.VacinacaoPK;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_vacinacao")
public class Vacinacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private VacinacaoPK id = new VacinacaoPK();
	
	private LocalDate dataVacinacao;
	private Double valor;
	private String dose;
	
	public Vacinacao(Pet pet, Vacina vacina, LocalDate dataVacinacao, Double valor, String dose) {
		id.setPet(pet);
		id.setVacina(vacina);
		this.dataVacinacao = dataVacinacao;
		this.valor = valor;
		this.dose = dose;
		
	}
	
	public Pet getPet() {
		return id.getPet();
	}
	
	public void setPet(Pet pet) {
		id.setPet(pet);
	}

	public Vacina getVacina() {
		return id.getVacina();
	}
	
	public void setVacina(Vacina vacina) {
		id.setVacina(vacina);
	}

	public LocalDate getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(LocalDate dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}
	
	
	

}
