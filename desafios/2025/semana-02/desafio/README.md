# 🔧 Desafio Fácil Plus - Backend
## ⭐⭐ API de Blog Simples

**Dificuldade:** Fácil Plus (Iniciante Avançado)

### 📝 Descrição
Crie uma API REST simples para um blog onde é possível gerenciar posts e comentários. Este desafio foca em CRUD básico, relacionamentos simples entre dados e boas práticas de API.

### 🛠 Endpoints Obrigatórios

**Posts:**
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/posts` | Listar todos os posts |
| GET | `/posts/:id` | Buscar post específico |
| POST | `/posts` | Criar novo post |
| PUT | `/posts/:id` | Atualizar post existente |
| DELETE | `/posts/:id` | Deletar post |

**Comentários:**
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/posts/:id/comentarios` | Comentários de um post |
| POST | `/posts/:id/comentarios` | Adicionar comentário |
| DELETE | `/comentarios/:id` | Deletar comentário |

### 📊 Estrutura dos Dados

**Post:**
```json
{
  "id": 1,
  "titulo": "Meu primeiro post",
  "conteudo": "Este é o conteudo do meu post...",
  "autor": "João Silva",
  "categoria": "Tecnologia",
  "criadoEm": "2024-12-20T10:00:00Z",
  "publicado": true
}
```

**Comentário:**
```json
{
  "id": 1,
  "postId": 1,
  "autor": "Maria Santos",
  "comentario": "Muito bom este post!",
  "criadoEm": "2024-12-20T11:00:00Z"
}
```

### 📋 Requisitos Técnicos

**Obrigatórios:**
- Validação básica dos dados de entrada
- Tratamento de erros com mensagens claras
- Persistência em memória (array) ou arquivo JSON
- Resposta JSON em todos os endpoints
- Códigos de status HTTP corretos

**Validações dos Posts:**
- `titulo`: obrigatório, entre 5 e 100 caracteres
- `conteudo`: obrigatório, mínimo 10 caracteres
- `autor`: obrigatório, entre 2 e 50 caracteres
- `categoria`: opcional, padrão "Geral"
- `publicado`: opcional, padrão true

**Validações dos Comentários:**
- `autor`: obrigatório, entre 2 e 50 caracteres
- `comentario`: obrigatório, entre 1 e 500 caracteres
- `postId`: deve ser um post existente

### 💡 Funcionalidades Extras (Opcional)

**Filtros Simples:**
- `GET /posts?categoria=Tecnologia` - Filtrar por categoria
- `GET /posts?autor=João` - Filtrar por autor
- `GET /posts?publicado=true` - Só posts publicados

**Ordenação:**
- `GET /posts?ordenar=data` - Mais recentes primeiro
- `GET /posts?ordenar=titulo` - Ordem alfabética

**Estatísticas:**
- `GET /stats` - Total de posts e comentários
- Incluir contagem de comentários em cada post

**Busca:**
- `GET /posts/busca?q=tecnologia` - Buscar no título e conteúdo

### 📝 Exemplos de Uso

**Criar Post:**
```bash
POST /posts
{
  "titulo": "Aprendendo APIs REST",
  "conteudo": "Hoje vou falar sobre como criar APIs REST...",
  "autor": "Ana Costa",
  "categoria": "Tutorial"
}

# Resposta (201 Created)
{
  "id": 3,
  "titulo": "Aprendendo APIs REST",
  "conteudo": "Hoje vou falar sobre como criar APIs REST...",
  "autor": "Ana Costa",
  "categoria": "Tutorial",
  "criadoEm": "2024-12-20T15:30:00Z",
  "publicado": true
}
```

**Listar Posts:**
```bash
GET /posts

# Resposta (200 OK)
[
  {
    "id": 1,
    "titulo": "Meu primeiro post",
    "autor": "João Silva",
    "categoria": "Tecnologia",
    "criadoEm": "2024-12-20T10:00:00Z",
    "totalComentarios": 2
  },
  {
    "id": 3,
    "titulo": "Aprendendo APIs REST", 
    "autor": "Ana Costa",
    "categoria": "Tutorial",
    "criadoEm": "2024-12-20T15:30:00Z",
    "totalComentarios": 0
  }
]
```

**Adicionar Comentário:**
```bash
POST /posts/1/comentarios
{
  "autor": "Carlos Pereira",
  "comentario": "Excelente explicação!"
}

# Resposta (201 Created)
{
  "id": 5,
  "postId": 1,
  "autor": "Carlos Pereira", 
  "comentario": "Excelente explicação!",
  "criadoEm": "2024-12-20T16:00:00Z"
}
```

### 🚦 Códigos de Status HTTP

- `200` - OK (GET, PUT bem-sucedido)
- `201` - Created (POST bem-sucedido)
- `204` - No Content (DELETE bem-sucedido)
- `400` - Bad Request (dados inválidos)
- `404` - Not Found (post/comentário não encontrado)
- `500` - Internal Server Error (erro do servidor)

### 🎯 Casos de Teste Importantes

**Posts:**
- Criar post com dados válidos ✅
- Rejeitar post sem título ❌
- Buscar post que não existe ❌
- Atualizar post existente ✅
- Deletar post e seus comentários ✅

**Comentários:**
- Adicionar comentário a post existente ✅
- Rejeitar comentário em post inexistente ❌
- Listar comentários de um post ✅
- Deletar comentário específico ✅

### 🏗 Estrutura de Projeto Sugerida

```
projeto/
├── src/
│   ├── routes/
│   │   ├── posts.js
│   │   └── comentarios.js
│   ├── data/
│   │   └── database.json
│   ├── utils/
│   │   └── validation.js
│   └── app.js
├── package.json
└── README.md
```

### ✅ Critérios de Avaliação

- **Funcionalidade:** Todos os endpoints funcionam corretamente?
- **Validação:** Dados são validados antes de salvar?
- **Tratamento de Erros:** Erros retornam mensagens claras?
- **Estrutura:** Código bem organizado em arquivos/pastas?
- **Relacionamentos:** Comentários estão ligados aos posts corretos?
- **HTTP Status:** Usa códigos de status apropriados?
- **Documentação:** README explica como usar a API?

### 🚀 Como Submeter

1. Implemente todos os endpoints obrigatórios
2. Teste manualmente com Postman/Insomnia
3. Adicione pelo menos 1 funcionalidade extra
4. Escreva um README com exemplos de uso
5. Documente como executar o projeto
6. Faça commit no repositório

### 💡 Dicas para Iniciantes

**Comece simples:**
1. Primeiro, crie apenas o CRUD de posts
2. Depois adicione os comentários
3. Por último, implemente os filtros

**Ferramentas úteis:**
- **Postman/Insomnia** para testar endpoints
- **JSON Server** como referência
- **Express.js** se usar Node.js
- **Nodemon** para auto-reload durante desenvolvimento

**Frameworks sugeridos:** Express.js (Node.js), Flask (Python), Spring Boot (Java), Laravel (PHP), ou qualquer framework que você já conhece!

### 🌟 O que você vai aprender
- Como criar uma API REST do zero
- Relacionamento entre entidades (posts → comentários)
- Validação de dados de entrada
- Códigos de status HTTP
- Estrutura de projeto backend
- Tratamento de erros em APIs