# Formação Desenvolvedor Moderno: Desafio - Modelo de Domínio e ORM

Bem-vindo ao projeto do desafio de **Modelo de Domínio e ORM** do módulo de Back-end da Formação Desenvolvedor Moderno, oferecida pela DevSuperior.

---

## Módulo: Back-end
### Capítulo: Modelo de Domínio e ORM

### Objetivo do Desafio

O objetivo deste desafio é criar um projeto **Spring Boot** com **Java** e **banco de dados H2**, e implementar o modelo conceitual de domínio conforme a especificação. Além disso, é necessário realizar o *seeding* da base de dados, seguindo o diagrama de objetos fornecido.

---

### Como o Trabalho Será Corrigido?

O professor irá clonar o repositório do Github e executará o projeto localmente. O projeto deve **executar sem erros**, e a base de dados deverá ser **criada corretamente**. O **H2 Console** será executado no navegador, e todas as tabelas esperadas deverão ser criadas, com todos os relacionamentos, e os dados do *seeding* deverão estar presentes em cada tabela.

---

## ESPECIFICAÇÃO - Sistema EVENTO

Deseja-se construir um sistema para gerenciar as informações dos participantes das atividades de um evento acadêmico. As atividades deste evento podem ser, por exemplo, palestras, cursos, oficinas práticas, etc. Cada atividade que ocorre possui nome, descrição, preço, e pode ser dividida em vários blocos de horários (por exemplo: um curso de HTML pode ocorrer em dois blocos, sendo necessário armazenar o dia e os horários de início e fim do bloco daquele dia). Para cada participante, deseja-se cadastrar seu nome e email.

---

## Esquema do Banco de Dados

Abaixo está o diagrama do esquema do banco de dados, representando as principais entidades e seus relacionamentos, conforme a especificação:

```mermaid
classDiagram
    direction LR

    class Participante {
        <<oid>> id: Integer
        nome: String
        email: String
    }

    class Atividade {
        <<oid>> id: Integer
        nome: String
        descricao: String
        preco: Double
    }

    class Categoria {
        <<oid>> id: Integer
        descricao: String
    }

    class Bloco {
        <<oid>> id: Integer
        inicio: Instant
        fim: Instant
    }

    Participante "*" -- "1..*" Atividade : - atividades
    Atividade "*" -- "1" Categoria : - categoria
    Atividade "1" -- "1..*" Bloco : - blocos
    Bloco "1" -- "1" Atividade : - atividade

    link Participante "[https://mermaid.js.org/syntax/classDiagram.html](https://mermaid.js.org/syntax/classDiagram.html)" "Documentação Participante"
    link Atividade "[https://mermaid.js.org/syntax/classDiagram.html](https://mermaid.js.org/syntax/classDiagram.html)" "Documentação Atividade"
    link Categoria "[https://mermaid.js.org/syntax/classDiagram.html](https://mermaid.js.org/syntax/classDiagram.html)" "Documentação Categoria"
    link Bloco "[https://mermaid.js.org/syntax/classDiagram.html](https://mermaid.js.org/syntax/classDiagram.html)" "Documentação Bloco"