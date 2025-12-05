package com.br.projeto_techPoint_informatica.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue("PF")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ClientePessoaFisica extends Cliente{

    private String cpf;

    private String dataNascimento;



}
