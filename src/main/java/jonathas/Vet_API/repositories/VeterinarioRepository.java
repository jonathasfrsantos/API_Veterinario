package jonathas.Vet_API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jonathas.Vet_API.entities.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long>{

}
