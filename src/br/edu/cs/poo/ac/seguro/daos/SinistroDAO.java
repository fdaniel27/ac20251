package br.edu.cs.poo.ac.seguro.daos;

import br.edu.cs.poo.ac.seguro.entidades.Sinistro;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public class SinistroDAO extends DAOGenerico {
    
    public SinistroDAO() {
        cadastro = new CadastroObjetos(Sinistro.class);
    }

    public Sinistro buscar(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Número do sinistro não pode ser nulo ou vazio");
        }
        return (Sinistro) cadastro.buscar(numero);
    }

    public boolean incluir(Sinistro sinistro) {
        if (sinistro == null) {
            throw new IllegalArgumentException("Sinistro não pode ser nulo");
        }
        if (sinistro.getNumero() == null || sinistro.getNumero().trim().isEmpty()) {
            throw new IllegalArgumentException("Número do sinistro não pode ser nulo ou vazio");
        }
        
        if (buscar(sinistro.getNumero()) != null) {
            return false;
        }
        cadastro.incluir(sinistro, sinistro.getNumero());
        return true;
    }

    public boolean alterar(Sinistro sinistro) {
        if (sinistro == null) {
            throw new IllegalArgumentException("Sinistro não pode ser nulo");
        }
        if (sinistro.getNumero() == null || sinistro.getNumero().trim().isEmpty()) {
            throw new IllegalArgumentException("Número do sinistro não pode ser nulo ou vazio");
        }
        
        if (buscar(sinistro.getNumero()) == null) {
            return false;
        }
        cadastro.alterar(sinistro, sinistro.getNumero());
        return true;
    }

    public boolean excluir(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Número do sinistro não pode ser nulo ou vazio");
        }
        
        if (buscar(numero) == null) {
            return false;
        }
        cadastro.excluir(numero);
        return true;
    }
}