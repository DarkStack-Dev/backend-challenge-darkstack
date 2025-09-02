using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace UebesterDesafio_B.Entities
{
    public class Livro
    {

        /// Representa um livro da biblioteca.
        
        public int Id { get; set; }

        [Required(ErrorMessage = "O Titulo não pode ser vazio")]
        public string Titulo { get; set; }

        [Required(ErrorMessage = "O Autor não pode ser vazio")]
        public string Autor { get; set; }

        [Required(ErrorMessage = "O ano é obrigatório.")]
        [Range(1000, 9999, ErrorMessage = "O ano deve estar entre 1000 e o ano atual.")]
        public int Ano { get; set; }

        [Required(ErrorMessage = "O gênero é obrigatório")]
        public string Genero { get; set; }


        public bool Disponivel { get; set; } = true;
    }
}