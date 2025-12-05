package com.br.projeto_techPoint_informatica.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(("PJ"))
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ClientePessoaJuridica  extends Cliente{

    private String cpf;

    private String razaoSocial;

}
