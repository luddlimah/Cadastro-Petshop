// AnimalRepository.java
package com.seuapp.petshop.repository;

import com.seuapp.petshop.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}

// RacaRepository.java
package com.seuapp.petshop.repository;

        import com.seuapp.petshop.model.Raca;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Long> {
}

// FormaPagamentoRepository.java
package com.seuapp.petshop.repository;

        import com.seuapp.petshop.model.FormaPagamento;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {
}

