package jonathas.Vet_API.entities.PK;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jonathas.Vet_API.entities.Pet;
import jonathas.Vet_API.entities.Vacina;
import lombok.EqualsAndHashCode;

@Embeddable                           // Classe auxiliar de chave primária composta
@EqualsAndHashCode
public class VacinacaoPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@ManyToOne
	@JoinColumn(name = "vacina_id")
	private Vacina vacina;
	
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	
	
	
	

}
