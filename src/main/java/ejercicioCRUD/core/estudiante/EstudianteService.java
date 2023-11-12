package ejercicioCRUD.core.estudiante;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository repository;
    
    //Metodo Guardar
    public Estudiante save( Estudiante entity ){
        return repository.save(entity);
    }
    
    //Metodo Eliminar
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    //Metodo Leer
    public Estudiante findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    //Metodo Select All
    public List<Estudiante> findAll(){
        return repository.findAll();
    }
    
}