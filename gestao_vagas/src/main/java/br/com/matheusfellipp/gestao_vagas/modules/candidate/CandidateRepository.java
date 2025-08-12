package br.com.matheusfellipp.gestao_vagas.modules.candidate;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


//@Repository nao é necessario pois como ja ha a ideia de interface extendendo o jparepositorio ela ja entende que esa sera a camada de comunicação com o banco de dados
public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID>{
    //Usando o findBy... ele ja entende a necessidade de fazer um select dentro de um banco de dadso
    //Exeplo extra findByUsernameAndemail 
    Optional<CandidateEntity> findByUsernameOremail(String username, String Email);
}
