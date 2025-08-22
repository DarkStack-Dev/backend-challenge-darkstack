# 🔧 Desafio B - Backend
## ⭐⭐ API de Biblioteca

**Dificuldade:** Mediano

### 📝 Descrição
Crie uma API REST para gerenciar uma biblioteca simples com operações CRUD completas e funcionalidades de busca.

### 🛠 Endpoints Obrigatórios

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/livros` | Listar todos os livros |
| GET | `/livros/:id` | Buscar livro por ID |
| POST | `/livros` | Adicionar novo livro |
| PUT | `/livros/:id` | Atualizar livro existente |
| DELETE | `/livros/:id` | Remover livro |
| GET | `/livros/autor/:autor` | Buscar livros por autor |

### 📊 Estrutura do Livro
```json
{
  "id": 1,
  "titulo": "1984",
  "autor": "George Orwell",
  "ano": 1949,
  "genero": "Ficção Científica",
  "disponivel": true
}
```

### 📋 Requisitos Técnicos

**Obrigatórios:**
- Validação de dados de entrada
- Tratamento de erros com códigos HTTP adequados
- Persistência em memória (array) ou arquivo JSON
- Middleware para logs das requisições
- Documentação dos endpoints

**Extras (Opcional):**
- Paginação na listagem de livros
- Filtros adicionais (gênero, ano, disponibilidade)
- Autenticação básica
- Testes unitários
- Swagger/OpenAPI documentation

### 🔍 Validações Esperadas

**POST/PUT /livros:**
- `titulo`: obrigatório, string não vazia
- `autor`: obrigatório, string não vazia  
- `ano`: obrigatório, número entre 1000 e ano atual
- `genero`: obrigatório, string não vazia
- `disponivel`: opcional, boolean (default: true)

### 📝 Exemplos de Uso

**Criar livro:**
```bash
POST /livros
{
  "titulo": "Dom Casmurro",
  "autor": "Machado de Assis", 
  "ano": 1899,
  "genero": "Romance",
  "disponivel": true
}
```

**Resposta de erro:**
```json
{
  "error": "Validation failed",
  "details": [
    "Título é obrigatório",
    "Ano deve ser um número válido"
  ]
}
```

### 🚦 Códigos de Status HTTP

- `200` - OK (GET, PUT bem-sucedido)
- `201` - Created (POST bem-sucedido)
- `204` - No Content (DELETE bem-sucedido)
- `400` - Bad Request (dados inválidos)
- `404` - Not Found (recurso não encontrado)
- `500` - Internal Server Error (erro do servidor)

### ✅ Critérios de Avaliação

- **Funcionalidade:** Todos os endpoints funcionam corretamente?
- **Estrutura da API:** Segue princípios REST?
- **Validação:** Dados são validados adequadamente?
- **Tratamento de erros:** Erros são tratados com códigos HTTP corretos?
- **Qualidade do código:** Código bem estruturado e legível?
- **Documentação:** Endpoints bem documentados?
- **Logs:** Sistema de logging implementado?

**Frameworks sugeridos:** Express.js, FastAPI, Spring Boot, ASP.NET Core, Laravel, ou qualquer framework de sua preferência!