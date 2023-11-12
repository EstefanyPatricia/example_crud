package ejercicioCRUD.core.estudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin({"*"})
public class EstudianteController {

    @Autowired
    EstudianteService service;

    //Metodo Leer
    @GetMapping("/{id}/")
    public Estudiante findById( @PathVariable long id ){
        return service.findById(id);
    }

    //Metodo Select All
    @GetMapping("/")
    public List<Estudiante> findAll() {
        return service.findAll();
    }

    //Metodo Crear
    @PostMapping("/")
    public Estudiante save( @RequestBody Estudiante entitiy ){
        return service.save(entitiy);
    }
    
    //Metodo Actualizar
    @PutMapping("/")
    public Estudiante update ( @RequestBody Estudiante entity){
        return service.save(entity);
    }

    //Metodo Eliminar
    @DeleteMapping("/{id}/")
    public void deleteById( @PathVariable long id ){
        service.deleteById(id);
    }

     

}