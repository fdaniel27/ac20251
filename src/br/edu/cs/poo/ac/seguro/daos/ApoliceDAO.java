package br.edu.cs.poo.ac.seguro.daos;

import br.edu.cs.poo.ac.seguro.entidades.Apolice;

public class ApoliceDAO extends DAOGenerico {
	public ApoliceDAO() {
		cadastro = new CadastroObjetos(Apolice.class);
	}

	public Apolice buscar(String numero) {
		if (numero == null || numero.trim().isEmpty()) {
			throw new IllegalArgumentException("Número da apólice não pode ser nulo ou vazio");
		}
		return (Apolice) cadastro.buscar(numero);
	}

	public boolean incluir(Apolice apolice) {
		if (apolice == null) {
			throw new IllegalArgumentException("Apólice não pode ser nula");
		}
		if (apolice.getNumero() == null || apolice.getNumero().trim().isEmpty()) {
			throw new IllegalArgumentException("Número da apólice não pode ser nulo ou vazio");
		}

		if (buscar(apolice.getNumero()) != null) {
			return false;
		}
		cadastro.incluir(apolice, apolice.getNumero());
		return true;
	}
}