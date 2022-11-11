package jonathas.Vet_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jonathas.Vet_API.entities.Vacina;
import jonathas.Vet_API.repositories.VacinaRepository;

@Service
public class VacinaService {
	
	@Autowired
	private VacinaRepository repository;
	
	public List<Vacina> findAll(){
		return repository.findAll();
	}
	
	
	

}
