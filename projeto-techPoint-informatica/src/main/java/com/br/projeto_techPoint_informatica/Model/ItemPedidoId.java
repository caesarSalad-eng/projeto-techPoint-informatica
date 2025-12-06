package com.br.projeto_techPoint_informatica.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoId implements Serializable {

    private Long pedidoId;

    private Long produtoId;

}
