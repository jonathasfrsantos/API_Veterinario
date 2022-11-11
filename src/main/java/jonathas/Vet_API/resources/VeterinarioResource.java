package jonathas.Vet_API.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jonathas.Vet_API.entities.Veterinario;
import jonathas.Vet_API.services.VeterinarioService;

@RestController
@RequestMapping(value = "/veterinarios")
public class VeterinarioResource {
	
	@Autowired
	private VeterinarioService service;
	
	@GetMapping
	public ResponseEntity<List<Veterinario>> findAll(){
		List<Veterinario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
