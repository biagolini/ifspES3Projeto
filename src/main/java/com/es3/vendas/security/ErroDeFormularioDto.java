package com.es3.vendas.security;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErroDeFormularioDto {

    private String campo;
    private String erro;

}
