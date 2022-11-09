package jonathas.Vet_API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jonathas.Vet_API.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
