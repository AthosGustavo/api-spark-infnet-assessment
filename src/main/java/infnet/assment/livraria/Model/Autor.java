package infnet.assment.livraria.Model;

import java.util.ArrayList;
import java.util.List;

public class Autor {
  private String nome;
  private int qtdLivros;
  private List<Livro> livros = new ArrayList<>();

  public Autor(String nome) {
    this.nome = nome;
  }

  public void adicionaLivro(Livro livro) {
    livros.add(livro);
  }
  public int qtdLivros() {
    return this.qtdLivros = livros.size();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQtdLivros() {
    return qtdLivros;
  }

  public void setQtdLivros(int qtdLivros) {
    this.qtdLivros = qtdLivros;
  }

  public List<Livro> getLivros() {
    return livros;
  }

  public void setLivros(List<Livro> livros) {
    this.livros = livros;
  }
}