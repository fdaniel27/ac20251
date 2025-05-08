package br.edu.cs.poo.ac.seguro.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SeguradoPessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
}