===================================

Instru��es para compila��o e execu��o, dentro do diret�rio do projeto:

mvn clean install

java -jar target/hotel-hotmart-0.0.1.jar [arquivo]*

*Nesse projeto em quest�o, um arquivo de exemplo chamado 1.txt est� na pasta do projeto.

====================================

Explica��es sobre a solu��o:

Os casos de teste fornecidos na descri��o do problema foram separados em tr�s arquivos de entrada diferentes. Dessa forma, a sa�da se tornaria mais limpa para a poss�vel corre��o por um rob�. Ou seja, cada uma das seguintes entradas, deve ser inserida como um parametro novo na execu��o:

<arquivo1> 
Regular: 16Mar2015(seg), 17Mar2015(ter), 18Mar2015(qua)
</arquivo1>
<arquivo2> 
Regular: 20Mar2015(sex), 21Mar2015(sab), 22Mar2015(dom)
</arquivo2>
<arquivo3> 
Vip: 26Mar2015(qui), 27Mar2015(sex), 28Mar2015(sab
</arquivo3> 

A estrutura do projeto � bem simples, tendo dois pacotes principais: leitor e core. 
O pacote "leitor" tem a classe LeArquivo, que � respons�vel por destrinchar os arquivos passados pelo par�metro na linha de comando e alimentar o programa com os dados recebidos.
O pacote "core" possui as classes Hotel e Pesquisa. A classe Hotel � a modelagem do Hotel, conforme descrito no documento apresentado: nome, pre�o para clientes regulares e vip e quantidade de estrelas do estabelecimento. J� a classe Pesquisa possui a l�gica de busca pelo melhor hotel para o cliente, percorrendo todos os hot�is dispon�veis no sistema e encontrando o que tenha menor pre�o. � importante salientar que essa classe foi pensada para que outros m�todos fossem adicionados, como busca apenas por estrelas, ou, por exemplo quantidade de pessoas maximas em um quarto.  
 


