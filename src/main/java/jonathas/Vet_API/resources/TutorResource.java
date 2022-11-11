package jonathas.Vet_API.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jonathas.Vet_API.entities.Tutor;
import jonathas.Vet_API.services.TutorService;

@RestController
@RequestMapping(value = "/tutores")
public class TutorResource {
	
	@Autowired
	private TutorService service;
	
	@GetMapping
	public ResponseEntity<List<Tutor>> findAll(){
		List<Tutor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
