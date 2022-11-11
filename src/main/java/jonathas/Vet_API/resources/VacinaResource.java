package jonathas.Vet_API.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jonathas.Vet_API.entities.Tutor;
import jonathas.Vet_API.entities.Vacina;
import jonathas.Vet_API.services.VacinaService;

@RestController
@RequestMapping(value = "/vacinas")
public class VacinaResource {
	
	@Autowired
	private VacinaService service;
	
	@GetMapping
	public ResponseEntity<List<Vacina>> findAll(){
		List<Vacina> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
