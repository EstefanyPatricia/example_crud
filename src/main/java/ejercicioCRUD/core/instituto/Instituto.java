package ejercicioCRUD.core.instituto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Instituto {
    
    //atrivtos de la clase intituto

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //secuencias de la id de la tabla instituto
    private Long id;
    private String name;
    private String address; 
}
