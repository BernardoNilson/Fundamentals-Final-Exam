# TRABALHO FINAL DE FUNDAMENTOS DE PROGRAMAÇÃO

#### Nome: Bernardo Nilson 
#### Matrícula: 23111469

Este arquivo 'README' tem como objetivo fornecer uma visão geral do trabalho final realizado na disciplina de Fundamentos de Programação. O trabalho final foi desenvolvido com o intuito de aplicar os conceitos e habilidades adquiridas ao longo do curso, demonstrando a compreensão dos fundamentos essenciais da programação.

Obs. O código-fonte e os comentários estão escritos em *inglês*.

## FUNCIONAMENTO

Foi implementado um **menu interativo** no terminal que permite aos usuários acessar diferentes funcionalidades do sistema de forma conveniente. Ao iniciar o programa, o menu é exibido, apresentando uma lista de opções numeradas. Cada opção corresponde a uma funcionalidade específica do sistema. Os usuários podem selecionar uma opção digitando o número correspondente no terminal e pressionando a tecla Enter.

-- *Exemplo*:

     --------- MENU ---------       
     ( 1 ) - ADD PACIENT
     ( 2 ) - REMOVE PACIENT
     ( 3 ) - MANAGE REGISTRATION    
     ( 4 ) - MANAGE MEDICINE        
     ( 5 ) - SEE PACIENTS    
     ( 6 ) - EXIT PROGRAM!   
     ------------------------
--

## APRENDIZADO E DIFICULDADES

Em resumo, o desenvolvimento deste projeto me proporcionou uma valiosa experiência de aprendizado, explorando e aplicando conceitos fundamentais. O uso de diversos recursos no desenvolvimento do programa foram de extrema importância: **switch** para criaçao do menu interativo, **if e else** para decisões internas do programa, **métodos** para melhora da visibilidade do código, **objetos e atributos** para modular o programa e facilitar a manutenção, e **vetores** para armazenamento de conteúdo.

Durante o desenvolvimento do programa, a dificuldade de maior relevância foi a organização da lista de pacientes de forma crescente, por conta das complexidades do alfabeto e organização dos laços de repetição. Entretanto, o problema foi facilmente solucionado com o auxílio do documento complementar de ordenação e de um fórum de dúvidas da internet (*https://www.geeksforgeeks.org/*).

## FONTES CONSULTADAS

- Fórum de dúvidas: *https://www.geeksforgeeks.org/*
- Documento auxiliar: @**Lucia Giraffa** - Material de Ordenação
- Código repetitivos: @**Open AI** - ChatGPT

## ORIENTAÇÕES DO TRABALHO FINAL

--
Crie uma classe chamada Paciente para representar um paciente que faz parte do cadastro de
na UPA. Considere que este classe deve armazenar os seguintes dados:

    - Nome
    - CPF
    - Telefone
    - Diagnóstico (código numérico)
    - Medicamento indicado (existe uma classe que organiza os medicamentos chamada Medicamento)
    - Quantidade de caixas indicadas pelo médico

Nesta classe devem existir métodos que permitam resgatar e ou modificar as informações do
paciente. Deve ter ainda um método chamado toString que retorne um String com um resumo
das informações do paciente.

Use como critério para cadastrar o diagnostico a seguinte relação:

    1. Covid
    2. Zika
    3. Chikungunya
    4. Dengue

--
Use como critério para organizar a classe Medicamento:

    - Nome do remédio:
        - CovixUltra
        - Zicox
        - ChikTop
        - Denguenit
    - Quantidade de caixas de cada remédio:

--
Crie uma classe chamada CadastroPacientes para representar o cadastro de um setor do
hospital. Considere que este classe deve armazenar objetos do tipo Paciente.

Crie um construtor que cria o cadastro (vetor de objetos) que pode armazenar até 10
pacientes.

Crie os seguintes métodos:

    - Adicionar no vetor
    - Remover do vetor
    - Escrever todo vetor
    - Escrever somente as posições ocupadas do vetor
    - Escrever os nomes dos pacientes em ordem alfabética crescente
    - Percentagem de pacientes com:
        - Covid
        - Zica
        - Chikungunya
        - Dengue

--
Faça uma nova classe aplicação que execute todos os métodos criados na classe
CadastroPacientes e imprima o relatório do estoque dos medicamentos da classe
Medicamentos.

--
Tudo isto com acesso por um menu de opções que permite o usuário escolher a opções mais
de uma vez sem a necessidade de executar o programa novamente!

## CONCLUSÃO

Por fim, fico à disposição para mais esclarecimentos no e-mail **bernardo.nilson@edu.pucrs.br**.

:)
