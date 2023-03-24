package anthony.burgers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import anthony.burgers.models.Burger;
import anthony.burgers.services.BurgerService;

@Controller
public class MainController {
    @Autowired BurgerService burgerService;
    @GetMapping("/")
    // line below makes a Burger instance to be filled named burger
    public String index (@ModelAttribute("burger")Burger burger,Model model){
        List<Burger> burgers=burgerService.getall();
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }
    @PostMapping("/burgers")
    public String createburger (@ModelAttribute("burger")Burger burger){
        burgerService.createburger(burger);
        return "redirect:/";
    }
    @GetMapping("/burgers/edit/{id}")
    // First line declares what editburger is. Then we import the model, then we import the path variable we want 
    // which is id and then we state the type of variable and name it id
    public String editburger (Model model,@PathVariable("id")Long id){
        Burger burger = burgerService.getOneBurger(id);
        model.addAttribute("burger", burger);
        return "edit.jsp";
    }
    @PutMapping("/burgers/{id}")
    public String updateburger (@ModelAttribute("burger")Burger burger){
        burgerService.updateburger(burger);
        // return redirects us to the index which is declared on line 20 
        return "redirect:/";
    }
    @DeleteMapping("/burgers/{id}")
    public String deleteburger (@PathVariable("id")Long id){
        burgerService.deleteburger(id);
        return "redirect:/";
    }
}
