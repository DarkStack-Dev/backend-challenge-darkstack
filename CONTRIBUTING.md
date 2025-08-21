# Guia de Contribuição

Olá! Ficamos felizes com seu interesse em contribuir com os Desafios de Código da **Comunidade Dark Stack**. Seguir estas diretrizes ajuda a manter a organização e a qualidade do nosso repositório.

## 📜 Código de Conduta

Antes de contribuir, por favor, leia nossos **[Termos de Participação e Código de Conduta](https://drive.google.com/file/d/1OKUiAjwn0XRe4h6kJannBm1j4uejQb-O/view?usp=sharing)**. Esperamos que todos os participantes sigam estas regras para garantir que nossa comunidade seja um ambiente acolhedor e respeitoso para todos.

##  submitting_solutions Submetendo Soluções (Desafios Semanais)

Todas as soluções para os desafios semanais devem ser submetidas através de **Pull Requests**. O acesso direto à branch `main` não é permitido.

### Fluxo de Trabalho Detalhado

1.  **Fork o Repositório:** Crie uma cópia deste repositório na sua própria conta do GitHub clicando no botão "Fork".

2.  **Clone o seu Fork:** Baixe a sua cópia para sua máquina local.
    ```bash
    git clone [https://github.com/](https://github.com/)[SEU-USUARIO]/backend-challenge-darkstack.git
    ```

3.  **Crie uma Branch:** Crie uma branch específica para a sua solução. Isso isola seu trabalho e facilita a revisão.
    ```bash
    # Padrão da branch: solucao/semana-XX/desafio-X/seu-usuario
    git checkout -b solucao/semana-01/desafio-A/fulano-silva
    ```

4.  **Desenvolva sua Solução:**

    * **Padrão de Estrutura de Pastas (Obrigatório):** Crie a estrutura de pastas para sua solução dentro do diretório `/solucoes`.
        ```
        /solucoes/[ano]/[semana-XX]/[desafio-X]/[seu-usuario]/
        ```
        **Exemplo:** `/solucoes/2025/semana-01/desafio-A/fulano-silva/`

    * **Padrão de Nomenclatura de Arquivos:** Dentro da sua pasta, nomeie seus arquivos de forma clara e simples.
        * Para soluções de arquivo único: `solucao.js`, `main.py`, `App.java`, etc.
        * Para soluções com múltiplos arquivos: Mantenha todos os arquivos relacionados dentro da sua pasta `/[seu-usuario]/`.
        * Adicione um `README.md` (opcional, mas recomendado) dentro da sua pasta para explicar sua lógica ou como rodar sua solução.

5.  **Faça o Commit das suas Alterações:**
    * Siga o padrão de **Commits Convencionais**. Isso nos ajuda a manter um histórico de commits limpo e compreensível.
    * **Exemplos:**
        ```bash
        # Para novas soluções
        git commit -m "feat: Adiciona solução para o desafio A da semana 01"

        # Para correções em uma solução já enviada
        git commit -m "fix: Corrige lógica de recursão na solução do desafio B"

        # Para melhorias na documentação da sua solução
        git commit -m "docs: Adiciona README explicando a abordagem utilizada"
        ```

6.  **Push para o seu Fork:** Envie sua branch com os commits para o seu repositório remoto.
    ```bash
    git push origin solucao/semana-01/desafio-A/fulano-silva
    ```

7.  **Abra um Pull Request:**
    * Vá até a aba "Pull Requests" do repositório original e clique em "New pull request".
    * Selecione seu fork e sua branch para comparar com a branch `main` do repositório original.
    * **Título do Pull Request:** Use um título claro e padronizado.
        * **Padrão:** `Solução Desafio [X] (Semana XX) - [Seu Usuário]`
        * **Exemplo:** `Solução Desafio A (Semana 01) - Fulano Silva`
    * Na descrição, sinta-se à vontade para adicionar qualquer comentário sobre sua solução.

## 🏗️ Submetendo o Protocolo Dark (Projetos Mensais)

O processo para os projetos mensais (Protocolo Dark) é **diferente**.
* Você deve criar um **repositório público novo e separado** na sua própria conta do GitHub para o projeto.
* A "entrega" do seu **Protocolo Dark** consiste em abrir um Pull Request neste repositório para adicionar o link do seu projeto ao nosso **"Codex dos Projetos"** (arquivo `O_CODEX_DOS_PROJETOS.md`).

