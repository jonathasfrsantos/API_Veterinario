package jonathas.Vet_API.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jonathas.Vet_API.entities.Pet;
import jonathas.Vet_API.entities.Tutor;
import jonathas.Vet_API.services.PetService;

@RestController
@RequestMapping(value = "/pets")
public class PetResource {
	
	@Autowired
	private PetService service;
	
	@GetMapping
	public ResponseEntity<List<Pet>> findAll(){
		List<Pet> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
