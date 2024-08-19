package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Banco {

    private String nome;
    private List<Cliente> clientes;
}
