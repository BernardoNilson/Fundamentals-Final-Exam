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
    2. Zica
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

Detalhe: indique em que posição do vetor eles estão!

--
Faça uma nova classe aplicação que execute todos os métodos criados na classe
CadastroPacientes e imprima o relatório do estoque dos medicamentos da classe
Medicamentos.

--
Tudo isto com acesso por um menu de opções que permite o usuário escolher a opções mais
de uma vez sem a necessidade de executar o programa novamente!