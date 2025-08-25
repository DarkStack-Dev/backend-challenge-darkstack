from fastapi import FastAPI, HTTPException
from typing import List
from data.livros import LIVROS

app = FastAPI()

# Dica: O participante pode criar um modelo Pydantic aqui para validação

# TODO: Implementar um middleware de log
# @app.middleware("http")
# async def log_requisicoes(request: Request, call_next):
#     # Lógica do log aqui
#     response = await call_next(request)
#     return response

@app.get("/livros")
def listar_livros():
    # TODO: Retornar a lista de livros
    return {"livros": LIVROS}

@app.get("/livros/{livro_id}")
def buscar_livro_por_id(livro_id: int):
    # TODO: Implementar a lógica de busca por ID
    pass

@app.post("/livros")
def adicionar_livro(livro: dict):
    # TODO: Implementar a lógica de adição e validação
    pass

@app.put("/livros/{livro_id}")
def atualizar_livro(livro_id: int, livro: dict):
    # TODO: Implementar a lógica de atualização
    pass

@app.delete("/livros/{livro_id}")
def remover_livro(livro_id: int):
    # TODO: Implementar a lógica de remoção
    pass

@app.get("/livros/autor/{autor}")
def buscar_livros_por_autor(autor: str):
    # TODO: Implementar a lógica de busca por autor
    pass