package br.com.darkstack.bibliotecaapi.model;

// Usamos um 'record' para uma classe de dados imutável e concisa.
public record Livro(
    int id,
    String titulo,
    String autor,
    int ano,
    String genero,
    boolean disponivel
) {}