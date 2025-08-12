package br.com.matheusfellipp.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data //Com lombok como dependencia eu consigo usar o @Data para gerar os getters e setters automaticamente
@Entity(name = "candidate") //defini todos os campos como coluna entao nao preciso direcionar a nao ser que queira com o @Column
public class CandidateEntity {
    
    @Id //@Id do jakarta que define a coluna como principal
    @GeneratedValue(strategy = GenerationType.UUID) //Faz com que toda vez que um dado for inserido na tabela ele gere o id automaticamente
    private UUID id;
    // @Column(name = "nome") Seria para definir 
    private String name;

    //Não deixar vazio
    @NotBlank()
    //Regex poara nao permitir espaços em branco
    @Pattern(regexp = "\\S+", message = "Not a vilid username. IT must follow the creation rules")
    private String username;

    //Para somente aceitar emails
    @Email(message = "Not a valid Email. It must contain a valid E-mail")
    private String email;

    //Definindo as propriedades do password
    @Length(min = 8, max = 25, message = "Password must have 8 to 25 characters")
    private String password;
    private String decription;
    private String curriculum;

    //Gerar um data de criação do valor
    @CreationTimestamp
    private LocalDateTime createdAt;
}
