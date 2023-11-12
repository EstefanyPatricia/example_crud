package ejercicioCRUD.core.instituto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class InstitutoService {
    @Autowired
    InstitutoRepository repository;
    
    public Instituto save( Instituto entity ){
        return repository.save(entity);
    }
    
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    public Instituto findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    //Metodo select All
    public List<Instituto> findAll(){
        return repository.findAll();
    }
    
}