package jonathas.Vet_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jonathas.Vet_API.entities.Servico;
import jonathas.Vet_API.repositories.ServicoRepository;

@Service
public class ServicoService {
	
	@Autowired
	private ServicoRepository repository;
	
	public List<Servico> findAll(){
		return repository.findAll();
	}
	
	
	

}
