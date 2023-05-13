# Solid Principles

Este repositório contém práticas que englobam os conceitos básicos dos princípios SOLID, sendo eles:

## Single Responsability Principle:

Esse principio diz que uma classe deve ter um e só um motivo para mudar
Essa frase deve ser entendida também em conjunto com o contexto do ramo do negocio
Ex.: deve-se separar o software que é do financeiro, do rh, do marketing
Para que aquela parte do software só mude para atender aquele ramo do negócio
O SRP aplica-se tambem a metodos, modulos e todos os outros artefatos de software
No programa abaixo repare que cada classe tem sua responsabilidade bem definida
 
## Open Closed Principle
 
Esse princípio diz que entidades de sooftware (classes, módulos, funçôes),
devem estar abertas para extensôes mas fechadas para modificaçôes
Uma vez que a classe está fechada, concluída o ideal é que evitemos que haja modificações nela
No programa abaixo repare que tenho uma classe abstrata Conta e a partir dela posso criar varios outros tipos

## Liskov Substitution Principle

Uma classe base deve poder ser substituída pela sua classe derivada
"Se nada como um pato mas precisa de baterias, então você pode ter um problema de abastração"

## Interface Segregation Principle

Classes clientes não devem ser forçadas a depender de métodos que não usam
Muitas interfaces específicas são melhores do que uma única interface
Repare que nas classes do programa so são implementados os métodos necessários para cada classe

## Dependency Inversion Principle

Modulos de alto nível não devem depender de módulos de baixo nível.
Ambos devem depender de abstrações
Abstrações não devem depender de detalhes
Detalhes devem depender de abstrações
Ex.: tenho uma classe de CadastroCliente, essa classe não deve depender de detalhes de um classe de acesso a banco de dados
