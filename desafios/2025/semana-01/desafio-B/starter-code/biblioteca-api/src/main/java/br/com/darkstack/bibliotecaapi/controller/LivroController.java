package br.com.darkstack.bibliotecaapi.controller;

import br.com.darkstack.bibliotecaapi.model.Livro;
import br.com.darkstack.bibliotecaapi.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros") // Define o prefixo da rota para "/livros"
public class LivroController {

    @Autowired // Injeta o nosso serviço de livros
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarLivroPorId(@PathVariable int id) {
        Livro livro = livroService.buscarPorId(id);
        // Se o livro for encontrado, retorna 200 OK, senão retorna 404 Not Found.
        return livro != null ? ResponseEntity.ok(livro) : ResponseEntity.notFound().build();
    }
    
    @GetMapping("/autor/{autor}")
    public List<Livro> buscarLivrosPorAutor(@PathVariable String autor) {
        return livroService.buscarPorAutor(autor);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Retorna o status 201 Created
    public Livro adicionarLivro(@RequestBody Livro livro) {
        // TODO: Implementar a validação dos dados do livro recebido (@RequestBody).
        return livroService.adicionar(livro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable int id, @RequestBody Livro livro) {
        // TODO: Implementar a validação aqui também.
        Livro livroAtualizado = livroService.atualizar(id, livro);
        return livroAtualizado != null ? ResponseEntity.ok(livroAtualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Retorna o status 204 No Content
    public void removerLivro(@PathVariable int id) {
        livroService.remover(id);
    }
}