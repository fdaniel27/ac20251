package br.edu.cs.poo.ac.seguro.daos;

import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public abstract class DAOGenerico<T> {
	protected final CadastroObjetos<T> cadastro;

	protected DAOGenerico(Class<T> classeEntidade) {
		this.cadastro = new CadastroObjetos<>(classeEntidade);
	}

	protected T buscarGenerico(String id) {
		validarId(id);
		return cadastro.buscar(id);
	}

	protected boolean incluirGenerico(T obj, String id) {
		validarObjeto(obj);
		validarId(id);

		if (buscarGenerico(id) != null) {
			return false;
		}
		cadastro.incluir(obj, id);
		return true;
	}

	protected boolean alterarGenerico(T obj, String id) {
		validarObjeto(obj);
		validarId(id);

		if (buscarGenerico(id) == null) {
			return false;
		}
		cadastro.alterar(obj, id);
		return true;
	}

	protected boolean excluirGenerico(String id) {
		validarId(id);

		if (buscarGenerico(id) == null) {
			return false;
		}
		cadastro.excluir(id);
		return true;
	}

	private void validarId(String id) {
		if (id == null || id.trim().isEmpty()) {
			throw new IllegalArgumentException("ID não pode ser nulo ou vazio");
		}
	}

	private void validarObjeto(T obj) {
		if (obj == null) {
			throw new IllegalArgumentException("Objeto não pode ser nulo");
		}
	}
}