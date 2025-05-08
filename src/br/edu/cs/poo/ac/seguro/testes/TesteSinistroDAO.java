package br.edu.cs.poo.ac.seguro.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import br.edu.cs.poo.ac.seguro.daos.SinistroDAO;
import br.edu.cs.poo.ac.seguro.entidades.Sinistro;

public class TesteSinistroDAO extends TesteDAO {
    private SinistroDAO dao = new SinistroDAO();

    protected Class getClasse() {
        return Sinistro.class;
    }

    @Test
    public void teste01() {
        Sinistro s = new Sinistro();
        s.setNumero("S001");
        cadastro.incluir(s, s.getNumero());
        Assertions.assertNotNull(dao.buscar("S001"));
    }

    @Test
    public void teste02() {
        Sinistro s = new Sinistro();
        s.setNumero("S002");
        dao.incluir(s);
        Assertions.assertFalse(dao.incluir(s));
    }

    @Test
    public void teste03() {
        Sinistro s = new Sinistro();
        s.setNumero("S003");
        dao.incluir(s);
        s.setNumero("S003");
        Assertions.assertTrue(dao.alterar(s));
    }

    @Test
    public void teste04() {
        Sinistro s = new Sinistro();
        s.setNumero("S004");
        dao.incluir(s);
        Assertions.assertTrue(dao.excluir("S004"));
    }
}