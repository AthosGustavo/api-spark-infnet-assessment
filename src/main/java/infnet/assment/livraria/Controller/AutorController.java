package infnet.assment.livraria.Controller;

import infnet.assment.livraria.Service.AutorService;
import spark.Request;
import spark.Response;
import spark.Route;
public class AutorController{

  private AutorService autorService;
  public AutorController(){
    this.autorService = new AutorService();
  }
  public Route cadastraAutorController = (req, res) -> this.autorService.cadastraAutorService(req);


}
