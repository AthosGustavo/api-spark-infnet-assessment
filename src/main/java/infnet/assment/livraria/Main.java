package infnet.assment.livraria;

import infnet.assment.livraria.Controller.AutorController;
import spark.Spark;

public class Main {
  public static void main(String[] args) {

    AutorController autorController = new AutorController();

    Spark.port(8080);
    Spark.post("/autor", autorController.cadastraAutorController);
  }
}