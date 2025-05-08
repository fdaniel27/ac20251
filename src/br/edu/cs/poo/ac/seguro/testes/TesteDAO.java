package br.edu.cs.poo.ac.seguro.testes;

import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public abstract class TesteDAO {
    protected CadastroObjetos cadastro;

    protected abstract Class getClasse();

    public TesteDAO() {
        cadastro = new CadastroObjetos(getClasse());
    }
}
