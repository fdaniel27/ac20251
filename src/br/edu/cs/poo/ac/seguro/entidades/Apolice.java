package br.edu.cs.poo.ac.seguro.entidades;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class Apolice implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numero;
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    

}
