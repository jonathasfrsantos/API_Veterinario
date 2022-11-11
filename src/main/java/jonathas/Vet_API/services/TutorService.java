package jonathas.Vet_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jonathas.Vet_API.entities.Tutor;
import jonathas.Vet_API.repositories.TutorRepository;

@Service
public class TutorService {
	
	@Autowired
	private TutorRepository repository;
	
	public List<Tutor> findAll(){
		return repository.findAll();
	}
	
	
	

}
