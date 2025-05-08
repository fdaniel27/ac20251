package br.edu.cs.poo.ac.seguro.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SeguradoEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
}