package br.com.rh.rh.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rh.rh.models.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, String> {

  Vaga findByCodigo(long codigo);

  List<Vaga> findByNome(String nome);

}
