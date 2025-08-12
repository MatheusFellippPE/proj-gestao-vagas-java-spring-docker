package br.com.matheusfellipp.gestao_vagas.modules.candidate.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.matheusfellipp.gestao_vagas.exceptions.UserFoundException;
import br.com.matheusfellipp.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.matheusfellipp.gestao_vagas.modules.candidate.CandidateRepository;

@Service
public class CreateCandidateUseCase {
    @Autowired //Tudo que estiver a baixo o Spring sera responsavel por instanciar
    private CandidateRepository candidateRepository;
    
    public CandidateEntity execute(CandidateEntity candidateEntity){
        // var candidateExists = this.candidateRepository
        // .findByUsernameOremail(candidateEntity.getUsername(), candidateEntity.getEmail());
        
        // if(candidateExists != null){

        // }
        //Poderia ser feito da maenira acima pore como estamos usando o Opitional fazemos o seguinte
        this.candidateRepository
        .findByUsernameOremail(candidateEntity.getUsername(), candidateEntity.getEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });
    
        return this.candidateRepository.save(candidateEntity);
    }

}
