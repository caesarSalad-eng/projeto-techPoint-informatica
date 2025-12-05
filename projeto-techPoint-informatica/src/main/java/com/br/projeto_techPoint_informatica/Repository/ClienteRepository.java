package com.br.projeto_techPoint_informatica.Repository;

import com.br.projeto_techPoint_informatica.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Cliente findByEmail(String email);

}
