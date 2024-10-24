1. Criar duas classes controladoras para o Usuário("/usuario") e outra para o Produto("/produto"). 
2. Criar dois métodos em cada classe controlada, sendo:

`Classe controladora Usuário:`
[2.1] - Um método com o verbo GET, que quando acessado pela url /listar, deverá apresentar a informação "Aqui irá ficar a lista dos usuários".
[2.2] - Um método com o verbo POST, que quando acessado pela url /cadastrar, deverá ser inserido informações através do insomnia para o cadastro de um novo usuário. Essas informações deverão ser salvas no H2, dentro de uma tabela chamada usuarios. Para isso, deverá ser criado uma classe de dados de cadastro do usuário utilizando o padrão [DTO], bem com a extensão do JPArepository e uma classe modelo do usuário para a persistência e criação da tabela no H2.

`Classe controladora Produto:`
[3.1] - Um método com o verbo GET, que quando acessado pela url /listar, deverá apresentar a informação "Aqui irá ficar a lista dos produtos."
[3.2] - Um método com o verbo POST, que quando acessado pela url /cadastrar, deverá ser inserido informações através do insomnia para o cadastro de um novo produto. Essas informações deverão ser salvas no H2, dentro de uma tabela chamada produtos.Para isso, deverá ser criado uma classe de dados de cadastro do produto utilizando o padrão [DTO], bem com a extensão do JPArepository e uma classe modelo do produto para a persistência e criação da tabela no H2.



`@Embeddable`
-> A anotação `@Embeddable`é usada para marcar uma classe como um tipo embutido. Isso significa que a classe não representa uma entidade com uma tabela separada com uma tabela própria no banco de dados, mas sim um conjunto de atributos que será incorporado em outra entidade.

`@Embedded`
-> A anotação `@Embedded` é usada na entidade para indicar que um campo é de um tipo embutido. Ela instrui a JPA a incorporar os atributos do tipo embutido na tabela da entidade. Os campos com essa anotação se tornarão colunas na tabela entidade.

`@NotNull` -> O campo não poderá ser nulo.
`@NotBlank` -> O campo não podeserá ficar em branco.
`@Email` -> O campo precisa possuir o @
`@Pattern` -> 8 caracteres
`@Valid` -> Informa que determinado DTO vai ser validado.
https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html