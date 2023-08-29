package Exemplo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Exemplo {

    @GetMapping("/")
    public String helloWorld() {
        return "index";
    }

    @PostMapping("/")
    public String postExemplo(@RequestParam("numero") int numero, Model model){
        int numPot = (int) Math.pow(numero, 2);

        model.addAttribute("numero", numero);
        model.addAttribute("numPot", numPot);

        return "index";
    }
}
