# 🎮 Projeto DSList

Este é um projeto backend desenvolvido em Java com Spring Boot como parte de um estudo/prática com base no curso DevSuperior. A aplicação expõe uma API REST para gerenciamento de uma lista de jogos.

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (ou outro, dependendo da configuração do `application.properties`)
- Maven

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.wellington.PrimeiroProjetoDevSuperior/
│   │       ├── controllers/      # Controladores REST
│   │       ├── entities/         # Entidades JPA
│   │       ├── repositories/     # Interfaces JPA
│   │       ├── services/         # Lógica de negócio
│   │       └── config/           # Configurações da aplicação
│   └── resources/
│       ├── application.properties
│       └── static/, templates/   # (caso use Spring MVC com páginas)
```

## 🧪 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/projetoDsList.git
   cd projetoDsList
   ```

2. Execute o projeto com sua IDE (IntelliJ, Eclipse, etc.) ou pelo terminal:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse no navegador:
   ```
   http://localhost:8080
   ```

## 📚 Funcionalidades

- Listagem de jogos
- Organização por listas
- Reordenação de jogos dentro das listas
- Endpoints RESTful

---

## 📌 Endpoints da API

### 🎮 Jogos (`/games`)

- `GET /games`  
  Retorna a lista resumida de todos os jogos.  
  **Resposta exemplo:**
  ```json
  [
    {
      "id": 1,
      "title": "The Witcher 3",
      "platform": "PC"
    }
  ]
  ```

- `GET /games/{id}`  
  Retorna os detalhes completos de um jogo pelo ID.  
  **Resposta exemplo:**
  ```json
  {
    "id": 1,
    "title": "The Witcher 3",
    "year": 2015,
    "genre": "RPG",
    "platform": "PC",
    "score": 9.5,
    "imgUrl": "...",
    "shortDescription": "...",
    "longDescription": "..."
  }
  ```

### 🗂️ Listas de Jogos (`/lists`)

- `GET /lists`  
  Retorna todas as listas de jogos.  
  **Resposta exemplo:**
  ```json
  [
    {
      "id": 1,
      "name": "Favoritos"
    }
  ]
  ```

- `GET /lists/{listId}/games`  
  Retorna os jogos que pertencem a uma lista específica.

- `POST /lists/{listId}/replacement`  
  Reorganiza os jogos de uma lista.  
  Requisição deve conter:
  ```json
  {
    "sourceIndex": 1,
    "destinationIndex": 3
  }
  ```

---

## 📦 Dependências

Confira o arquivo [`pom.xml`](./pom.xml) para ver todas as dependências utilizadas no projeto.

## 👨‍💻 Autor

Desenvolvido por Wellington como parte do aprendizado no curso da [DevSuperior](https://devsuperior.com.br).
