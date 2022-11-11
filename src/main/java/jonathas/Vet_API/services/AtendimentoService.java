package jonathas.Vet_API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jonathas.Vet_API.entities.Atendimento;
import jonathas.Vet_API.repositories.AtendimentoRepository;

@Service
public class AtendimentoService {
	
	@Autowired
	private AtendimentoRepository repository;
	
	public List<Atendimento> findAll(){
		return repository.findAll();
	}
	
	
	

}
