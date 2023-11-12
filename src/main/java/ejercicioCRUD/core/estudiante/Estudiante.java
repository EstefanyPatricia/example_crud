package ejercicioCRUD.core.estudiante;

import ejercicioCRUD.core.instituto.Instituto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Estudiante {
    
     //atrivtos de la clase intituto

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //secuencias de la id de la tabla instituto
    private Long id;
    private String name;
    private String lastname; 

    @ManyToOne
    private Instituto instituto;

}
