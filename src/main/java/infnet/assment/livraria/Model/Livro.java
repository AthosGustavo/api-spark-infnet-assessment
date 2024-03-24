package infnet.assment.livraria.Model;

public class Livro {
  private Autor autor;
  private Cliente cliente;
  private boolean estaEmprestado;

  public Livro(Autor autor) {
    this.autor = autor;
  }

  public Livro(){}

  public boolean estarDisponivel() {
    return !estaEmprestado;
  }

  public void emprestarLivro(Cliente cliente) {
    if (estarDisponivel()) {
      this.cliente = cliente;
      estaEmprestado = true;
    }
  }

  public void devolverLivro(Cliente cliente) {
    if (this.cliente.equals(cliente)) {
      this.cliente = null;
      estaEmprestado = false;
    }
  }
}
