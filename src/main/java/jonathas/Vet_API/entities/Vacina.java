package jonathas.Vet_API.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_vacina")
public class Vacina implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String fabricante;
	private String lote;
	private LocalDate dataFabricacao;
	private Double valorAquisicao;
	private Double valorVenda;
	private Integer qtdEstoque;
	
	@OneToMany(mappedBy = "id.vacina")
	private List<Vacinacao> cadernetasVacinacao = new ArrayList<>();
	
	public Vacina(Long id, String nome, String fabricante, String lote, LocalDate dataFabricacao, Double valorAquisicao,
			Double valorVenda, Integer qtdEstoque) {
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
		this.lote = lote;
		this.dataFabricacao = dataFabricacao;
		this.valorAquisicao = valorAquisicao;
		this.valorVenda = valorVenda;
		this.qtdEstoque = qtdEstoque;
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Double getValorAquisicao() {
		return valorAquisicao;
	}

	public void setValorAquisicao(Double valorAquisicao) {
		this.valorAquisicao = valorAquisicao;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	@JsonIgnore
	public  List<Vacinacao> getVacinasAplicadas(){
		return cadernetasVacinacao;
	}


	

}
