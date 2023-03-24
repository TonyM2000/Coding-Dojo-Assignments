package anthony.burgers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anthony.burgers.models.Burger;
import anthony.burgers.repositories.BurgerRepository;


@Service
public class BurgerService {
    @Autowired BurgerRepository burgerRepository;

    public void createburger(Burger burger) {
        burgerRepository.save(burger);
    }

    public List<Burger> getall() {
        return burgerRepository.findAll();
    }

    public Burger getOneBurger(Long id) {
        Optional<Burger> burger = burgerRepository.findById(id);
        return burger.orElse(null);
    }

    public void updateburger(Burger burger) {
        burgerRepository.save(burger);
    }

    public void deleteburger(Long id) {
        burgerRepository.deleteById(id);
    }
}
