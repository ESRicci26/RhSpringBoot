package com.AppRICCI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.AppRICCI.models.Dependentes;
import com.AppRICCI.models.Funcionario;
import com.AppRICCI.models.Vaga;

public interface DependentesRepository extends CrudRepository<Dependentes, String> {

	Iterable<Dependentes> findByFuncionario(Funcionario funcionario);

	// pensando no método delete
	Dependentes findByCpf(String cpf);

	Dependentes findById(long id);

	// criado para implementar
	List<Dependentes> findByNome(String nome);

	// para a busca
	@Query(value = "select u from Dependentes u where u.nome like %?1%")
	List<Dependentes> findByNomesDependentes(String nome);

}
