using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using UebesterDesafio_B.Entities;


namespace UebesterDesafio_B.Context
{
    public class BibliotecaContext : DbContext
    {
        public BibliotecaContext(DbContextOptions<BibliotecaContext> options) : base(options)
        {

        }
        
        public DbSet<Livro> Livros{ get; set; }
    }
}