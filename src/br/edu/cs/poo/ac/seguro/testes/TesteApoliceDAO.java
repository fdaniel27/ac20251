package br.edu.cs.poo.ac.seguro.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import br.edu.cs.poo.ac.seguro.daos.ApoliceDAO;
import br.edu.cs.poo.ac.seguro.entidades.Apolice;

public class TesteApoliceDAO extends TesteDAO {
    private ApoliceDAO dao = new ApoliceDAO();

    protected Class getClasse() {
        return Apolice.class;
    }

    @Test
    public void teste01() {
        Apolice a = new Apolice();
        a.setNumero("A001");
        cadastro.incluir(a, a.getNumero());
        Assertions.assertNotNull(dao.buscar("A001"));
    }

    @Test
    public void teste02() {
        Apolice a = new Apolice();
        a.setNumero("A002");
        dao.incluir(a);
        Assertions.assertFalse(dao.incluir(a));
    }

    @Test
    public void teste03() {
        Apolice a = new Apolice();
        a.setNumero("A003");
        dao.incluir(a);
        a.setNumero("A003");
        Assertions.assertTrue(dao.alterar(a));
    }

    @Test
    public void teste04() {
        Apolice a = new Apolice();
        a.setNumero("A004");
        dao.incluir(a);
        Assertions.assertTrue(dao.excluir("A004"));
    }
}