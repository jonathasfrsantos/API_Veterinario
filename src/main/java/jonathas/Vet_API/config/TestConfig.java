package jonathas.Vet_API.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jonathas.Vet_API.entities.Atendimento;
import jonathas.Vet_API.entities.Pet;
import jonathas.Vet_API.entities.PetCadastro;
import jonathas.Vet_API.entities.Servico;
import jonathas.Vet_API.entities.Tutor;
import jonathas.Vet_API.entities.TutorCadastro;
import jonathas.Vet_API.entities.Vacina;
import jonathas.Vet_API.entities.Vacinacao;
import jonathas.Vet_API.entities.Veterinario;
import jonathas.Vet_API.entities.enums.StatusAtendimento;
import jonathas.Vet_API.repositories.AtendimentoRepository;
import jonathas.Vet_API.repositories.PetRepository;
import jonathas.Vet_API.repositories.ServicoRepository;
import jonathas.Vet_API.repositories.TutorRepository;
import jonathas.Vet_API.repositories.VacinaRepository;
import jonathas.Vet_API.repositories.VacinacaoRepository;
import jonathas.Vet_API.repositories.VeterinarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Autowired
	private TutorRepository tutorRepository;
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private VacinaRepository vacinaRepository;
	
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@Autowired
	private VacinacaoRepository vacinacaoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Servico sv1 = new Servico(null, "Consulta simples", "Consulta", 100.00);
		Servico sv2 = new Servico(null, "Hemograma completo", "Exame laboratorial", 70.00);
		Servico sv3 = new Servico(null, "Raio X", "Exame", 55.00);
		Servico sv4 = new Servico(null, "Curativos", "Serviço de enfermaria", 40.00);
		Servico sv5 = new Servico(null, "Exame FIV/FELV", "Exame clínico", 120.00);
		Servico sv6 = new Servico(null, "Castração", "Cirurgias", 100.00);
		Servico sv7 = new Servico(null, "Administração de medicamentos", "Serviço de enfermaria", 40.00);
	
		servicoRepository.saveAll(Arrays.asList(sv1, sv2, sv3, sv4, sv5, sv6, sv7));
		
		
		Tutor t1 = new Tutor(null, "999999", "Joaquim Red");
		Tutor t2 = new Tutor(null, "888888", "Nadia Green");
		Tutor t3 = new Tutor(null, "989898", "Jose Black");
		Tutor t4 = new Tutor(null, "777777", "Jonathas");
		Tutor t5 = new Tutor(null, "11111111111", "Tatiana");
		
		tutorRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));
		
		Pet p1 = new Pet(null, "Canina", "dachshund", "preto com manchas caramelo",  "macho", "Bidu", t2);
		Pet p2 = new Pet(null, "Canina", "SRD", "marrom",  "macho", "Sheik", t2);
		Pet p3 = new Pet(null, "Canina", "SRD", "preto com branco",  "fêmea", "Amora", t3);
		Pet p4 = new Pet(null, "Canina", "SRD", "Branca",  "fêmea", "Maia", t2);
		Pet p5 = new Pet(null, "Canina", "SRD", "malhado",  "macho", "Garrincha", t5);
		Pet p6 = new Pet(null, "Canina", "SRD", "preto com caramelo", "fêmea", "Duda", t5);
		Pet p7 = new Pet(null, "Felina", "SRD", "branca",  "macho", "Mimoso", t4);
		Pet p8 = new Pet(null, "Felina", "SRD", "branca com manchas de outras cores",  "fêmea", "Ninfeta", t4);
		Pet p9 = new Pet(null, "Felina", "SRD", "tigrada tricolor",  "fêmea", "Prostita", t4);
		
		petRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9));
		
		Vacina vac1 = new Vacina(null, "Anti Rabica", "Lab A", "100555A", LocalDate.parse("03/03/2019", formatter2), 80.00, 150.00, 20);
		Vacina vac2 = new Vacina(null, "V10", "PZIFER", "222555A", LocalDate.parse("01/08/2019", formatter2), 45.00, 100.00, 100);
		Vacina vac3 = new Vacina(null, "LEISHMANIOSE", "Lab Shangai Corp", "652555ZW", LocalDate.parse("02/06/2020", formatter2), 52.30, 98.00, 50);
			
		vacinaRepository.saveAll(Arrays.asList(vac1, vac2, vac3));
		
		Veterinario v1 = new Veterinario(null, "Hans Chucrute", "88888-8");
		Veterinario v2 = new Veterinario(null, "Dazle Anne", "77777-7");

		veterinarioRepository.saveAll(Arrays.asList(v1, v2));
		
		
		Vacinacao vacinacao1 = new Vacinacao(p1, vac1, LocalDate.parse("12/02/2022", formatter2), 120.00, "1ª dose");
		Vacinacao vacinacao2 = new Vacinacao(p2, vac1, LocalDate.parse("25/03/2022", formatter2), 120.00, "1ª dose");
		Vacinacao vacinacao3 = new Vacinacao(p3, vac1, LocalDate.parse("15/07/2021", formatter2), 100.00, "dose única");
		Vacinacao vacinacao4 = new Vacinacao(p4, vac1, LocalDate.parse("31/03/2022", formatter2), 120.00, "1ª dose");
		Vacinacao vacinacao5 = new Vacinacao(p5, vac1, LocalDate.parse("07/10/2021", formatter2), 100.00, "1ª dose");
		Vacinacao vacinacao6 = new Vacinacao(p6, vac1, LocalDate.parse("09/03/2019", formatter2), 99.50, "1ª dose");
		
		vacinacaoRepository.saveAll(Arrays.asList(vacinacao1, vacinacao2, vacinacao3, vacinacao4, vacinacao5, vacinacao6));
		
		Atendimento at1 = new Atendimento(null, LocalDateTime.parse("01/02/2022 11:00:00", formatter), LocalDateTime.parse("01/02/2022 11:00:00", formatter), StatusAtendimento.REALIZADO, p9, v2);
		
		atendimentoRepository.save(at1);
		
		TutorCadastro tcad1 = new TutorCadastro(null, "jonathas@gmail.com", "9999999", "55555555", "rua tal", "1000", "Rio de Janeiro", t4);
		
		t4.setCadastro(tcad1);
		
		tutorRepository.save(t4);
		
		PetCadastro pcad1 = new PetCadastro(null, true, "3 kg", "alergia a amoxicilina", true, p9);
		
		p9.setFichaMedica(pcad1);
		
		petRepository.save(p9);


	}
}
