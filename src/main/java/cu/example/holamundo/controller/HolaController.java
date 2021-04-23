package cu.example.holamundo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/inicio")
public class HolaController {

    @GetMapping(value = {"/bienvenidos"})
   public String getHolaProyecto(){
   String result ="Mi primer programa con Spring Boot";
     return result;

    }
       @GetMapping(value = "/bienvenidos/{nombre}")
    public String getHolaParametros(@PathVariable() String nombre){
       String result ="Mi primer Programa con Spring Boot, bienvenido" + " :  " + nombre;
        return result;



    }


}
