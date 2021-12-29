package com.AppRICCI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.AppRICCI.models.Candidato;
import com.AppRICCI.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {

	Iterable<Candidato> findByVaga(Vaga vaga);

	Candidato findByRg(String rg);

	Candidato findById(long id);

	// List<Candidato>findByNomeCandidato(String nomeCandidato);

	// para a busca
	@Query(value = "select u from Candidato u where u.nomeCandidato like %?1%")
	List<Candidato> findByNomesCandidatos(String nomeCandidato);
}
