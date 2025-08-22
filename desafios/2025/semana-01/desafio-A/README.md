# 🔧 Desafio A - Backend
## ⭐ Validador de CPF

**Dificuldade:** Fácil

### 📝 Descrição
Implemente uma função que valide se um CPF é válido ou não. O CPF deve seguir as regras de validação dos dígitos verificadores.

### 📋 Requisitos
- Aceitar CPF com ou sem formatação (pontos e traços)
- Retornar `true` se válido, `false` se inválido
- Rejeitar CPFs com todos os dígitos iguais (ex: 111.111.111-11)

### 💡 Exemplo de entrada/saída
```javascript
validarCPF("123.456.789-09") → true
validarCPF("12345678909") → true  
validarCPF("111.111.111-11") → false
validarCPF("123.456.789-10") → false
```

### 🔍 Dicas
- Remova caracteres não numéricos
- Implemente o algoritmo dos dígitos verificadores
- CPF tem 11 dígitos
- O algoritmo funciona calculando dois dígitos verificadores baseados nos 9 primeiros dígitos

### 🧮 Algoritmo dos Dígitos Verificadores

**Primeiro dígito:**
1. Multiplique cada um dos 9 primeiros dígitos pela sequência decrescente de 10 a 2
2. Some todos os resultados
3. Divida por 11 e pegue o resto
4. Se resto < 2, primeiro dígito = 0, senão primeiro dígito = 11 - resto

**Segundo dígito:**
1. Multiplique os 9 primeiros dígitos + primeiro dígito verificador pela sequência decrescente de 11 a 2
2. Some todos os resultados
3. Divida por 11 e pegue o resto
4. Se resto < 2, segundo dígito = 0, senão segundo dígito = 11 - resto

### ✅ Critérios de Avaliação

- **Funcionalidade:** A função valida CPFs corretamente?
- **Tratamento de entrada:** Aceita diferentes formatos de entrada?
- **Casos especiais:** Rejeita CPFs inválidos (todos iguais, formato incorreto)?
- **Qualidade do código:** Código limpo e legível?
- **Eficiência:** Implementação otimizada?

**Linguagens sugeridas:** JavaScript, Python, Java, C#, PHP, ou qualquer linguagem de sua preferência!