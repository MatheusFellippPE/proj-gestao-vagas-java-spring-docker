package br.com.matheusfellipp.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data //Com lombok como dependencia eu consigo usar o @Data para gerar os getters e setters automaticamente
public class CandidateEntity {
    
    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "Not a vilid username. IT must follow the creation rules")
    private String username;

    @Email(message = "Not a valid Email. It must contain a valid E-mail")
    private String email;

    @Length(min = 8, max = 25, message = "Password must have 8 to 25 characters")
    private String password;
    private String decription;
    private String curriculum;



}
