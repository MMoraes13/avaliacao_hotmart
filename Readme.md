Avaliação técnica Back-end Hotmart - Mateus Moraes
===================================

Instruções para compilação e execução, dentro do diretório do projeto:

mvn clean install

java -jar target/hotel-hotmart-0.0.1.jar [arquivo]*

*Nesse projeto em questão, um arquivo de exemplo chamado 1.txt está na pasta do projeto.

====================================

Explicações sobre a solução:

Os casos de teste fornecidos na descrição do problema foram separados em três arquivos de entrada diferentes. Dessa forma, a saída se tornaria mais limpa para a possível correção por um robô. Ou seja, cada uma das seguintes entradas, deve ser inserida como um arquivo novo na execução:

<arquivo1> 
Arquivo 1:

Regular: 16Mar2015(seg), 17Mar2015(ter), 18Mar2015(qua)

Exemplo: java -jar target/hotel-hotmart-0.0.1.jar Arquivo1
</arquivo1>

<arquivo2> 
Arquivo 2:

Regular: 20Mar2015(sex), 21Mar2015(sab), 22Mar2015(dom)

Exemplo: java -jar target/hotel-hotmart-0.0.1.jar Arquivo2
</arquivo2>

<arquivo3>
Arquivo 3:
 
Vip: 26Mar2015(qui), 27Mar2015(sex), 28Mar2015(sab)

Exemplo: java -jar target/hotel-hotmart-0.0.1.jar Arquivo3
</arquivo3> 

A estrutura do projeto é bem simples, tendo dois pacotes principais: leitor e core. 
O pacote "leitor" tem a classe LeArquivo, que é responsável por destrinchar os arquivos passados pelo parâmetro na linha de comando e alimentar o programa com os dados recebidos.
O pacote "core" possui as classes Hotel e Pesquisa. A classe Hotel é a modelagem do Hotel, conforme descrito no documento apresentado: nome, preço para clientes regulares e vip e quantidade de estrelas do estabelecimento. Já a classe Pesquisa possui a lógica de busca pelo melhor hotel para o cliente, percorrendo todos os hotéis disponíveis no sistema e encontrando o que tenha menor preço. É importante salientar que essa classe foi pensada para que outros métodos fossem adicionados, como busca apenas por estrelas, ou, por exemplo quantidade de pessoas maximas em um quarto.  
 


