package curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operadores {

    @RequestMapping("/api/operadores/suma")
    public int suma(@RequestParam("a") int a,@RequestParam("b") int b) {
        return a+b;
    }
}
