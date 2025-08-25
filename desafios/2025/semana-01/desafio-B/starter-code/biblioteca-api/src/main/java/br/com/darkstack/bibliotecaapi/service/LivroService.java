package br.com.darkstack.bibliotecaapi.service;

import br.com.darkstack.bibliotecaapi.model.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class LivroService {

    // Nosso "banco de dados" em memória.
    private final List<Livro> livros = new ArrayList<>();
    // Um contador para gerar IDs únicos.
    private final AtomicInteger contadorId = new AtomicInteger();

    // Inicializando com alguns dados.
    public LivroService() {
        livros.add(new Livro(contadorId.incrementAndGet(), "1984", "George Orwell", 1949, "Ficção Científica", true));
        livros.add(new Livro(contadorId.incrementAndGet(), "O Sol é para todos", "Harper Lee", 1960, "Romance", false));
    }

    // --- O participante implementa a partir daqui ---

    public List<Livro> listarTodos() {
        // TODO: Retornar a lista completa de livros.
        return new ArrayList<>(); // Retorno provisório
    }

    public Livro buscarPorId(int id) {
        // TODO: Implementar a busca de um livro pelo seu ID.
        // Se não encontrar, pode retornar null ou lançar uma exceção.
        return null;
    }

    public Livro adicionar(Livro novoLivro) {
        // TODO: Adicionar um novo livro à lista.
        // Lembre-se de gerar um novo ID.
        // E de fazer as validações necessárias antes de adicionar.
        return null;
    }

    public Livro atualizar(int id, Livro livroAtualizado) {
        // TODO: Atualizar um livro existente na lista.
        // Busque o livro pelo ID e atualize seus dados.
        return null;
    }

    public void remover(int id) {
        // TODO: Remover um livro da lista pelo seu ID.
    }

    public List<Livro> buscarPorAutor(String autor) {
        // TODO: Buscar todos os livros de um determinado autor.
        return new ArrayList<>();
    }
}