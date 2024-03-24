package infnet.assment.livraria.Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
  private List<Livro> livrosEmprestados = new ArrayList<>();

  public Cliente(String nome, String rg, String cpf, String endereco) {
    super(nome, rg, cpf, endereco);
  }

  public void pegarLivroEmprestado(Livro livro) {
    if (livro.estarDisponivel()) {
      livro.emprestarLivro(this);
      livrosEmprestados.add(livro);
    }
  }

  public void devolverLivro(Livro livro) {
    if (livrosEmprestados.contains(livro)) {
      livro.devolverLivro(this);
      livrosEmprestados.remove(livro);
    }
  }
}