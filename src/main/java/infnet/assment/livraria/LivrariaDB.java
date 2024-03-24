package infnet.assment.livraria;

import infnet.assment.livraria.Model.Autor;
import infnet.assment.livraria.Model.Cliente;
import infnet.assment.livraria.Model.Livro;

import java.util.HashMap;
import java.util.Map;

public class LivrariaDB {
  private Map<Integer, Livro> livros = new HashMap<>();
  private Map<Integer, Cliente> clientes = new HashMap<>();
  private Map<Integer, Autor> autores = new HashMap<>();
  private int livroId = 1;
  private int clienteId = 1;
  private int autorId = 1;

  public void saveLivro(Livro livro) {
    livros.put(livroId++, livro);
  }

  public void saveCliente(Cliente cliente) {
    clientes.put(clienteId++, cliente);
  }

  public String saveAutor(Autor autor) {
    autores.put(autorId++, autor);
    if(autores.containsValue(autor)) {
      return "O autor " + autor.getNome() + " adicionado com sucesso";
    } else {
      return "Falha ao adicionar autor";
    }
  }

  public Livro getLivro(int id) {
    return livros.get(id);
  }

  public Cliente getCliente(int id) {
    return clientes.get(id);
  }

  public Autor getAutor(int id) {
    return autores.get(id);
  }
}
