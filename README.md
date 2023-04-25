Sejam Bem vindos ao GetNet Job Interview Project
==================
<p align="center">
 <img src="https://site.getnet.com.br/wp-content/uploads/2021/08/logo-getnet.png" alt=""  width="400" height="90" /> 
</p>
O que será necessário ter:

* IDE  - Utilizado | [Intellij][0]
* Java | [8+][1]




A seguir, teremos informações importantes para como a configuração do JAVA_HONE no seu computador, o neessário para rodar o projeto e os testes em seu computador.  

Documentação: Java (Configuração JAVA_HOME)
==================
| <img src="https://logodownload.org/wp-content/uploads/2016/03/Windows-10-logo-11.png" alt="Windows"  width="230" height="230" /> | <img src="https://archive.org/download/apple-mac-logo-icon-300x300/apple-mac-logo-icon-300x300.png" alt="Windows"  width="230" height="230" /> |
|------------------------------|------------------------------|
| [Windows][2]          	   | [Mac][3]                  |


Abrindo o projeto na IDE (Intellij)
==================

Com sua IDE já instalada e seu projeto clonado em seu computador:

	$ clique em File > Open
	$ Navegue até o repositório clonado e clica em Open

Após isso o projeto será carregado com todas as dependências necessárias. Os testes poderam ser executados de duas maneiras... São elas:

- Clique com o botão direito sobre o arquivo APITest e, no menu exibido, clique em Run APITest
- Linha de comando (Terminal IDE)


Para executar os testes através do command line de sua IDE, digite o comando abaixo:

 	$ mvn test
  
Será informado um Report no console de sua IDE, com o total de testes realizados | Tests run: , Failures: , Errors:, Skipped: . 

 
  
  

Testes realizados
==================
<p align="center">
 <img src="https://i.postimg.cc/43sgfdxS/Captura-de-Tela-2023-04-25-a-s-11-52-35.png" alt=""  width="1024" height="800" /> 
</p>

```
1 - Realizado cobertura de Testes em Rest-Assured da API
```

```
2 - Realizado cobertura de Status code, campos obrigatórios e Contrato
```
```
3 - Projeto Realizado com POJO (Plain Old Java Object) 
```

Testes realizados
==================

[0]: https://www.jetbrains.com/pt-br/idea/
[1]: https://oracle.com/java/technologies/javase-downloads.html
[2]: https://www.youtube.com/watch?v=bR95QtL24zc&ab_channel=JepApps
[3]: https://www.youtube.com/watch?v=Mi8YpP9TQSs&t=223s&ab_channel=JagadeeshJayachandran
