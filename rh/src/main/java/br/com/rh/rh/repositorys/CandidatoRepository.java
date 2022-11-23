package br.com.rh.rh.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rh.rh.models.Candidato;
import br.com.rh.rh.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {

  // Listar Vagas
  Iterable<Candidato> findByVaga(Vaga vaga);

  Candidato findByRg(String rg);

  Candidato findById(Long id);

  List<Candidato> findByNomeCandidato(String nomeCandidato);
}
