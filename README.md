# 🚀 Sistema de Gestão de Vagas

Um projeto para gerenciar vagas, permitindo que empresas publiquem oportunidades e candidatos se inscrevam nelas. O sistema foi desenvolvido com **Java Spring Boot**, utilizando **Maven** para gerenciamento de dependências e **Docker** para facilitar o ambiente de desenvolvimento e implantação.

-----

# 💻 Tecnologias Utilizadas

## Backend

  * **Java 17:** Linguagem de programação.
  * **Spring Boot 3.2.5:** Framework para construção de aplicações Java.
  * **Spring Data JPA:** Para acesso e manipulação de dados.
  * **Maven:** Ferramenta de build e gerenciamento de dependências.
  * **H2 Database:** Banco de dados em memória para desenvolvimento.
  * **Swagger/OpenAPI:** Para documentação e teste da API.

## Containers

  * **Docker:** Para conteinerização da aplicação e do banco de dados, garantindo um ambiente consistente.

## Versionamento

  * **Git**

-----

# 🚀 Como Rodar o Projeto

Este projeto foi configurado para ser executado facilmente utilizando **Docker Compose**, o que elimina a necessidade de instalar manualmente o Java, o banco de dados e outras dependências.

## Pré-requisitos

Certifique-se de que o **Docker** e o **Docker Compose** estão instalados na sua máquina.

## 1\. Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

## 2\. Executar com Docker Compose

Com o Docker Compose, você pode iniciar o banco de dados e a aplicação com um único comando.

```bash
docker-compose up --build
```

  * O comando `up` cria e inicia os serviços definidos no arquivo `docker-compose.yml`.
  * O flag `--build` garante que a imagem Docker da sua aplicação seja reconstruída, incorporando quaisquer mudanças recentes no código.

Após a execução, o sistema estará disponível em: `http://localhost:8080`.

-----

# 📚 Documentação da API

A documentação da API, gerada com o **Swagger**, está disponível em:

  * **URL:** `http://localhost:8080/swagger-ui.html`

Nesta página, você pode visualizar todos os endpoints disponíveis, seus métodos HTTP, parâmetros de requisição e modelos de resposta.

-----

# 🤝 Contribuições

Contribuições são bem-vindas\! Se você encontrar um bug ou tiver uma sugestão de melhoria, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

1.  Faça um fork do projeto.
2.  Crie uma branch para sua feature (`git checkout -b feature/sua-feature`).
3.  Faça o commit das suas mudanças (`git commit -m 'feat: Adiciona nova feature'`).
4.  Envie para a branch (`git push origin feature/sua-feature`).
5.  Abra um Pull Request.

-----

Se tiver alguma dúvida sobre o projeto ou precisar de ajuda para rodá-lo, pode me procurar.