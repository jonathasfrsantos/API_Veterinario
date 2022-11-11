package jonathas.Vet_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jonathas.Vet_API.entities.Veterinario;
import jonathas.Vet_API.repositories.VeterinarioRepository;

@Service
public class VeterinarioService {
	
	@Autowired
	private VeterinarioRepository repository;
	
	public List<Veterinario> findAll(){
		return repository.findAll();
	}
	
	
	

}
