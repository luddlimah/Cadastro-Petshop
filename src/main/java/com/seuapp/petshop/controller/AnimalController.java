
package com.seuapp.petshop.controller;

import com.seuapp.petshop.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    public AnimalController(AnimalRepository ignoredAnimalRepository) {
    }


}


package com.seuapp.petshop.controller;

import com.seuapp.petshop.model.Raca;
import com.seuapp.petshop.repository.RacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/racas")
class RacaController {
    @Autowired
    private final racaRepository racaRepository;


    public <RacaRepository> RacaController(RacaRepository racaRepository) {
        this.racaRepository = (com.seuapp.petshop.controller.racaRepository) racaRepository;
    }
}


package com.seuapp.petshop.controller;

        import com.seuapp.petshop.model.FormaPagamento;
        import com.seuapp.petshop.repository.FormaPagamentoRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/formas-pagamento")
class FormaPagamentoController {

    FormaPagamentoController() {
    }

}

