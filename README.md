<div align="center"> <br> 
  <img align="center" alt="guru-java" height="200" width="300" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" />
</div> <br>  <br> 


<div align="center"> 
 Esta API estabelece comunicação com a OmdbAPI, uma plataforma que fornece informações detalhadas sobre filmes. Ela realiza a conexão, busca os dados dos filmes disponíveis e os 
 armazena no Banco de Dados para posterior consulta e utilização.
</div>


 <br> 


## 🚀 Ferramentas Utilizadas

* Intellij

* Java 21

* Postgres 16

* Spring Boot 3.4.1


<br>


## 🔑 API Key

Para que a API envie requisições com sucesso, é necessário que o arquivo  `screenmatch.properties` contenha o campo `SECRET` com a sua API Key. Primeiro, [acesse o site do OMDB para cadastro de uma chave](https://www.omdbapi.com/apikey.aspx).

No formulário que será exibido, marque a opção FREE! (1,000 daily limit) no campo `Account Type` e preencha os campos `Email` e `Name` com seu email e nome. No campo `Use`, coloque o seguinte texto: `Personal application for test purpose` e clique no botão Submit.

![image](https://github.com/user-attachments/assets/0a6a250a-2582-4f12-9870-e0e0c93d536d)


## 🐘 Banco de Dados

Para que a API consiga se conectar ao Banco de Dados, é necessário que o arquivo `screenmatch.properties` esteja localizado no diretório `home` do seu computador, dentro da pasta `screenmatch`.


 <br>


🌐 Windows
```bash
# Caminho para Windows
$ C:\Users\<nome-do-usuario>\screenmatch\screenmatch.properties
```

🐧 Linux
```bash
# Caminho para Linux
$ /home/<nome-do-usuario>/screenmatch/screenmatch.properties
```


 <br>


**Baixe o arquivo `screenmatch.properties` e coloque-o no diretório apropriado.**

🔹 [screenmatch.properties](dist/screenmatch.properties)


<br>


## 🔷 Métodos Disponíveis

 <br> 

🔹 GET
```bash
# Busca um Filme pelo seu nome
$ http://localhost:8080/movie/v1?movieName={💲}
```

🔹 POST
```bash
# Salva um Filme no Banco de Dados
$ http://localhost:8080/movie/v1?movieName={💲}
```


## 🖥️ Desenvolvido por:

### 📝 Linkedin: [Gustavo Correa](https://www.linkedin.com/in/gustavo-chauar-correa-946168269/)
