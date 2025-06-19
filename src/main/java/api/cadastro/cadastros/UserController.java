package api.cadastro.cadastros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Primeira mensagem";
    }

}
