package anthony.omikujiform;
// Add this file in to be the controller of the app
// Add @Controller to designate the file as a controller.

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    // V This tells the website to call the function below when a user visits the website
    @GetMapping("/")
    // V this is the function invoked when the index is called
    public String index(){
        return"index.jsp";
    }
    @PostMapping("/handleformdata")
    // V always public string this line stores the number from the form and then set up session
    public String formdata(
        @RequestParam("number")String number, //duplicate this line and the session.setattribute line to make more stored data
        @RequestParam("personname")String personname,
        @RequestParam("hobby")String hobby,
        @RequestParam("livingthing")String livingthing,
        @RequestParam("somethingnice")String somethingnice,
        HttpSession session){
        // V Says put in session, a variable called number set to number ^
        session.setAttribute("number", number);
        session.setAttribute("personname", personname);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingthing", livingthing);
        session.setAttribute("somethingnice", somethingnice);
        // in session.setattribute the first variable is NAMING CONVENTION while the second sets it to a value
        // V This says to use the tellfortune mapping below
        return "redirect:/tellfortune";
    }
    @GetMapping("/tellfortune")
    public String tellfortune(){
        return"formreturn.jsp";
    }
}

