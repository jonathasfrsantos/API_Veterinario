package jonathas.Vet_API.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jonathas.Vet_API.entities.Atendimento;
import jonathas.Vet_API.services.AtendimentoService;

@RestController
@RequestMapping(value = "/atendimentos")
public class AtendimentoResource {
	
	@Autowired
	private AtendimentoService service;
	
	@GetMapping
	public ResponseEntity<List<Atendimento>> findAll(){
		List<Atendimento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
