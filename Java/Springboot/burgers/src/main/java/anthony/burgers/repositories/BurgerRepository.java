package anthony.burgers.repositories;
// alt shift o
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import anthony.burgers.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger,Long>{

List<Burger> findAll();
    
}