// AnimalController.java
package com.seuapp.petshop.controller;

import com.seuapp.petshop.model.Animal;
import com.seuapp.petshop.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;

    // Implementar métodos CRUD para Animal
}

// RacaController.java
package com.seuapp.petshop.controller;

        import com.seuapp.petshop.model.Raca;
        import com.seuapp.petshop.repository.RacaRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/racas")
public class RacaController {
    @Autowired
    private RacaRepository racaRepository;

    // Implementar métodos CRUD para Raça
}

// FormaPagamentoController.java
package com.seuapp.petshop.controller;

        import com.seuapp.petshop.model.FormaPagamento;
        import com.seuapp.petshop.repository.FormaPagamentoRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/formas-pagamento")
public class FormaPagamentoController {
    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    // Implementar métodos CRUD para Forma de Pagamento
}

