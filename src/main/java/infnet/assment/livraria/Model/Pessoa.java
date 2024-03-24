package infnet.assment.livraria.Model;

public abstract class Pessoa {
  private String nome;
  private String rg;
  private String cpf;
  private String endereco;

  public Pessoa(String nome, String rg, String cpf, String endereco) {
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.endereco = endereco;
  }
}
