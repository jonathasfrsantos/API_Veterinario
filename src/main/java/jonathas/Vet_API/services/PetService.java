package jonathas.Vet_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jonathas.Vet_API.entities.Pet;
import jonathas.Vet_API.repositories.PetRepository;

@Service
public class PetService {
	
	@Autowired
	private PetRepository repository;
	
	public List<Pet> findAll(){
		return repository.findAll();
	}
	
	
	

}
