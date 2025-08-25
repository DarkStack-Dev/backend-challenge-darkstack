⚠️ **Atenção:** Este repositório é público, mas apenas Pull Requests de participantes inscritos no desafio serão revisados e aceitos.

# Guia de Contribuição (Back-End)

Olá! Ficamos felizes com seu interesse em contribuir com os Desafios de Back-End da **Comunidade Dark Stack**. Seguir estas diretrizes ajuda a manter a organização e a qualidade do nosso repositório.

## 📜 Código de Conduta

Antes de contribuir, por favor, leia nosso arquivo **CODE_OF_CONDUCT.md**. Esperamos que todos os participantes sigam estas regras para garantir que nossa comunidade seja um ambiente acolhedor e respeitoso para todos.

## 🏆 Submetendo Soluções (Desafios Semanais)

Todas as soluções para os desafios semanais devem ser submetidas através de **Pull Requests**.

### Fluxo de Trabalho Detalhado

**1. Fork o Repositório:**
Crie uma cópia deste repositório na sua própria conta do GitHub clicando no botão "Fork" no canto superior direito.

**2. Clone o seu Fork:**
Baixe a sua cópia para sua máquina local.

git clone [https://github.com/SEU-USUARIO/backend-challenge-darkstack.git](https://github.com/SEU-USUARIO/backend-challenge-darkstack.git).

**3. Crie uma Branch:**
Crie uma branch específica para a sua solução. Isso isola seu trabalho e facilita a revisão.

# Padrão da branch: solucao/semana-XX/desafio-X/seu-usuario
git checkout -b solucao/semana-01/desafio-A/fulano-silva

**4. Desenvolva sua Solução:**

* **Padrão de Estrutura de Pastas (Obrigatório):** Crie a estrutura de pastas para sua solução dentro do diretório `/solucoes`.
    
    /solucoes/[ano]/[semana-XX]/[desafio-X]/[seu-usuario]/

    **Exemplo:** `/solucoes/2025/semana-01/desafio-A/fulano-silva/`

* **Padrão de Nomenclatura de Arquivos:** Para desafios de back-end, é comum ter múltiplos arquivos. Mantenha todos (ex: server.js, main.py, App.java, etc.) dentro da sua pasta `/[seu-usuario]/`. Adicione um `README.md` se quiser explicar sua abordagem.

**5. Faça o Commit das suas Alterações:**
Siga o padrão de **Commits Convencionais**.
* **Exemplo:** `git commit -m "feat: Adiciona solução para o desafio A da semana 01"`

**6. Push para o seu Fork:**
Envie sua branch com os commits para o seu repositório remoto.

`git push origin solucao/semana-01/desafio-A/fulano-silva`

**7. Abra um Pull Request:**
Use um título claro e padronizado.
* **Padrão:** `Solução Desafio [X] (Semana XX) - [Seu Usuário]`

---
### 🏗️ Submetendo o Protocolo Dark (Projetos Mensais)

O processo para os projetos mensais (Protocolo Dark) é **diferente** do desafio semanal. O objetivo é que você crie um **repositório público e completo** no seu próprio perfil, que servirá como um projeto de portfólio.

A "entrega" consiste em adicionar o link do seu projeto ao nosso **"Codex dos Projetos"**.

**Para fazer isso, você seguirá um fluxo parecido com o dos desafios semanais:**

1.  **Crie seu projeto** em um repositório novo e público na sua conta.
2.  **Faça o Fork e Clone do nosso repositório principal** (caso ainda não tenha feito).
3.  **Crie uma nova branch** com um nome descritivo, como `feat/adiciona-projeto-dark-seu-nome`.
4.  **Edite o arquivo `CODEX.md` que está dentro da pasta `projetos/`**, adicionando uma nova linha com seu nome de usuário e o link para o seu projeto.
5.  **Faça o commit e push** dessa alteração para o seu fork.
6.  **Abra um Pull Request** para o nosso repositório principal, com um título como: `feat: Adiciona projeto do Protocolo Dark de [Seu Nome]`.

---

🔒 **Observação:** Pull Requests fora do padrão ou enviados por não-inscritos serão fechados sem revisão.