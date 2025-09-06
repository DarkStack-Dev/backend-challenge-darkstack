from fastapi import FastAPI, HTTPException, Request
from typing import List
from data.livros import LIVROS
from pydantic import BaseModel, Field
import time 
# uvicorn main:app --reload
app = FastAPI()

# TODO: Implementar um middleware de log
@app.middleware("http")
async def log_requisicoes(request: Request, call_next):
    start_time = time.time()
    response = await call_next(request)
    end_time = time.time()
    process_time = (end_time - start_time) * 1000
    status_code = response.status_code
    print(f"Método: {request.method} | Caminho: {request.url} | Status: {response.status_code} | Duração : {process_time:.2f}")
    return response

class Livro(BaseModel): 
    titulo: str = Field(..., min_length=1)
    autor: str = Field(..., min_length=1) 
    ano: int = Field(..., ge=1000, le=time.localtime().tm_year)
    genero: str = Field(..., min_length=1)
    disponivel: bool = Field(default=True)

@app.get("/livros", status_code=200)
def listar_livros():
    if not LIVROS:
        raise HTTPException(status_code=404, detail="Not Found")
    return {"livros": LIVROS}

@app.get("/livros/{livro_id}", status_code=200)
def buscar_livro_por_id(livro_id: int):
    # TODO: Implementar a lógica de busca por ID
    if LIVROS:
        for livro in LIVROS:
            if livro["id"] == livro_id:
                return livro
    raise HTTPException(status_code=404, detail="Not Found")

@app.post("/livros", status_code=201)
def adicionar_livro(livro: Livro):
    # TODO: Implementar a lógica de adição e validação
    try:
        id = (int(LIVROS[-1]["id"]) + 1) if LIVROS else 1
        novoLivro = {"id": id, **livro.model_dump()}
        LIVROS.append(novoLivro)
        return {"Mensagem": "Livro adicionado!", "livro": novoLivro}
    except Exception:
        raise HTTPException(status_code=500, detail="Internal Server Error")

@app.put("/livros/{livro_id}", status_code=200)
def atualizar_livro(livro_id: int, livro: Livro):
    # TODO: Implementar a lógica de atualização
    if LIVROS:
        for l in LIVROS:
            if l["id"] == livro_id:
                livroAtualizado = {"id": livro_id, **livro.model_dump()}
                l.update(livroAtualizado)
                return {"Mensagem": "Livro atualizado!", "livro": livroAtualizado}
    raise HTTPException(status_code=404, detail="Not Found")

@app.delete("/livros/{livro_id}", status_code=204)
def remover_livro(livro_id: int):
    # TODO: Implementar a lógica de remoção
    if LIVROS:
        for livro in LIVROS:
            if livro["id"] == livro_id:
                LIVROS.remove(livro)
                return 
    raise HTTPException(status_code=404, detail="Not Found")

@app.get("/livros/autor/{autor}", status_code=200)
def buscar_livros_por_autor(autor: str):
    # TODO: Implementar a lógica de busca por autor
    livros_do_autor = [l for l in LIVROS if l["autor"].lower() == autor.lower()]
    if not livros_do_autor:
        raise HTTPException(status_code=404, detail=f"Not Found")
    return {f"Livros da(o) {autor}": livros_do_autor}