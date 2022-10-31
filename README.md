# axia
AXIA
Projeto SPTECH 2º Semestre SIS Grupo 07

Luigi Perissinotto Ceolin 03221013 <br />
Renato de Lima Tierno 03221059 <br />
Pedro Elias Cordeiro Neto 03221037 <br />
Victor Roque Lage 03221062 <br />
Gabriela Romanini Silva 03221041 <br />
Emerson Jose dos Santos 03221021 <br />

================== arquivos ================== 

apiPy/apiPyCMD.py -

    Script em python para captura de dados, automatizado para captura de dados tanto da torre quando dos hardwares, utilizando da biblioteca subprocess para executar comandos em CMD e capturar dados como Serial ID, nome da máquina, modelo do processador, modelo do disco rígido, velocidade da memória RAM, e sistema operacional. Inserindo então esses dados no banco na tabela torre automaticamente caso a torre ainda não esteja cadastrada. Após o SELECT do Serial ID e verificado que a torre está cadastrada, será utilizada a biblioteca psutil na tabela torre, serão inseridos dados capturados do psutil na tabela leitura.
    // O script de python não possui simulação de outras máquinas.

    ================== Por favor verificar script python comentado ==================


Banco - 

    Modelagem comentada do banco de dados e script de execução comentado com inserts necessários para fazer teste mockados.

    ================== Por favor verificar script banco comentado ==================


Documentação-Axia - 

    Artefatos, PPT de apresentação, Documentação, User Story.


KotlinCadastroLoginNÃOFuncional -

    Projeto Kotlin passado pelo professor Alex para cadastro e login, porém o nosso login esta mockado e fora da estrutura de repetição, ou seja, errado.

Site - Axia - 

    O diretório do site contém 7 arquivos .html onde temos as páginas:

    Cadastro.html - onde qualquer pessoa que acesse o nosso site pode cria conta..
    Contato.html - onde temos informações de como e onde entrar em contato conosco e um botão onde o usuário é direcionado para .o pipefy para abertura de chamado.
    Dev.html - onde um usuário com perfil de desenvolvedor acessa ao fazer login e por onde ele cadastra a empresa e atrela a fkEmpresa a determinado usuário também alterando seu perfil para Adm.
    index.html - nossa página inicial onde fazemos uma breve introdução sobre o que é axia qual e o que nós fazemos.
    Login.html - onde um usuário ja dastrado pode fazer login, sendo direcionado a diferentes telas dependendo do seu nível de permissão
    Serviços.html - onde falamos mais sobre o Argos o nosso produto de monitoramento de hardware.
    Sobre.html -  onde falamos sobre a axia e como tudo começou. 


Site - Axia/assets -


/css -

    style.css arquivo css principal único para todo o site, menos a pagina Dev.html que esta inacabada e possui o proprio css dev.css.

/img -

    Todas as imagens utilizadas pelo site, diretorio team possui as imagens dos integrantes do grupo utilizadas na tela Sobre.html.

/js -

    mainB.js arquivo javascript nativo do bootstrap com funções para animações do site e menu de navegação mobile.
    mainD.js arquivo javascript para Dashboard.html com funções para criação de modal, menu de navegação mobile e encerramento de alerta (sumir clicando no Xzinho).

/vendor - 

    Configuração do framework do bootstrap, animações, ícones, forms e layouts.
    

Site - Axia/Dashboards -

    Ao fazer login o usuário com fkEmpresa definida é direcionado a tela de dashboard geral de CPU. No menu a esquerda o usuário pode navegar entre as páginas de CPU, RAM, Disco Rígido, Network onde mostramos respectivamente a porcentagem de uso da CPU, da RAM, do Disco Rígido e a porcentagem de perda de pacotes de todas as torres, tendo a opção também de adicionar um usuário preenchendo um formulario com e-mail e senha onde esse usuário seria adicionado a tabela Pessoa tendo a mesma fkEmpresa de quem o cadastrou, permitindo o usuário acessar essa dashboard, um botão para abertura de chamado, e um botão para logout.
    // A ideia era que quando um usuário fizesse login ele não tivesse acesso ao botão de adicionar usuário.

    No menu a direita temos uma área para emissão de alertas, onde a ideia é sempre que nenhuma leitura de nenhuma torre fugir das métricas seria emitido um alerta verde de estabilidade, caso alguma leitura fuja das métricas será emitido um alerta para cada torre e componente, por exemplo caso a torre 1 pare de funcionar, seriam emitidos 4 alertas, um para cada um de seus componentes, e caso várias torres parem de funcionar, seriam emitidos vários alertas, um pra cada componente de cada torre, a direita também existe uma opção de modo noturno e uma área com o nome do usuário e seu nível de permisão.  

    No menu central nas dashboards gerais temos os gráficos de cada torre. Caso o usuário clique em um gráfico ele será direcionado a uma dashboard específica para aquela torre (no caso do nosso site estático temos somente a torre 1), a dashboard da torre possui os menus a esquerda e a direita igualmente, onde o menu da esquerda funciona para navegação entre os componentes daquela torre, no menu central abaixo do gráfico principal temos um histórico de registro, onde o usuário tem acesso as últimas leituras e outros dados sobre o componente que não estão presentes no gráfico, também clicando no botão "métricas" tem acesso as nossas métricas para cada componente.



// Eu acho que eu não esqueci de nada, lembrando que tudo que está aqui são ideias, afinal essa é a primeira sprint. Sintam-se livre para realizar as alterações que acharem necessárias. <br />
// Qualquer dúvida entrem em contato. Wpp: +5511947155226 <br />
// Atenciosamente, Equipe AXIA. <br />
