package infnet.assment.livraria.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import infnet.assment.livraria.LivrariaDB;
import infnet.assment.livraria.Model.Autor;
import spark.Request;
import spark.Route;

public class AutorService {
  private LivrariaDB livrariaDB;
  private Gson gson;

  public AutorService(){
    this.livrariaDB = new LivrariaDB();
    this.gson = new Gson();
  }
  public String cadastraAutorService(Request req){
    JsonObject jsonObject = gson.fromJson(req.body(), JsonObject.class);
    String nome = jsonObject.get("nome").getAsString();
    Autor autor = new Autor(nome);
    return livrariaDB.saveAutor(autor);
  }
}
