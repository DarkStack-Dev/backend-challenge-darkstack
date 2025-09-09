using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using UebesterDesafio_B.Context;
using UebesterDesafio_B.Entities;


namespace UebesterDesafio_B.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class LivroController : ControllerBase
    {
        private readonly BibliotecaContext _context;

        public LivroController(BibliotecaContext context)
        {
            _context = context;
        }

       

       // Adiciona um novo livro ao banco de dados.
       /// <returns>Retorna o livro criado com status 201</returns>
        [HttpPost]
        public IActionResult AdicionarLivro([FromBody] Livro livro)
        {
            _context.Add(livro);
            _context.SaveChanges();

            return CreatedAtAction(nameof(ObterPorId), new { id = livro.Id }, livro);


        }


    


        // Busca o livro por autor    
        /// Retorna uma lista de livros que contém o autor informado
        [HttpGet("ObterLivrosPorAutor")]
        public IActionResult BuscarLivrosPorAutor(string autor)
        {
            var livros = _context.Livros.Where(x => x.Autor.Contains(autor));

            return Ok(livros);
        }

        [HttpGet("{id}")]
        public IActionResult ObterPorId(int id)
        {
            var livro = _context.Livros.Find(id);
            if (livro == null)
            {
                return NotFound();
            }

            return Ok(livro);
        }

        

         // Lista todos os livros Salvo no banco de dados
        [HttpGet("ListarTodosOsLivros")]
        public IActionResult ListarTodosOsLivros()
        {
            var livros = _context.Livros.ToList();

            if (livros == null)
            {
                return NotFound();
            }

            return Ok(livros);
        }


        // atulizar os dados de um livro exitente
        //  Retorna uma lista de livro que contem o autor informado
       
        [HttpPut("Atualizar/{id}")]
        public IActionResult AtualizarLivro(int id, Livro livro)
        {
            var livroBanco = _context.Livros.Find(id);

            if (livroBanco == null)
            {
                return NotFound();
            }

            livroBanco.Titulo = livro.Titulo;
            livroBanco.Autor = livro.Autor;
            livroBanco.Ano = livro.Ano;
            livroBanco.Genero = livro.Genero;
            livroBanco.Disponivel = livro.Disponivel;

            _context.Livros.Update(livroBanco);
            _context.SaveChanges();

            return Ok(livroBanco);
        }
   
        // Deleta o livro informado pelo id do livro
        [HttpDelete("Deletar/{id}")]
        public IActionResult RemoverLivro(int id)
        {
            var livroBanco = _context.Livros.Find(id);

            if (livroBanco == null)

                return NotFound();

            _context.Livros.Remove(livroBanco);
            _context.SaveChanges();

            return Ok($"Livro Reomovido");

        }
    }
}