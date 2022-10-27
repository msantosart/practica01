package practica01_examen.practica01.repository;
import practica01_examen.practica01.entity.estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
        


@Repository
public interface estadoRepository  extends CrudRepository<estado,Long>{
    
}
