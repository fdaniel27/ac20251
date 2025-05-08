package br.edu.cs.poo.ac.seguro.daos;

import br.edu.cs.poo.ac.seguro.entidades.Veiculo;

import java.io.*;

public class VeiculoDAO {

    private static final String CAMINHO_ARQUIVO = "dados/veiculo.dat";

    public void salvar(Veiculo veiculo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO_ARQUIVO))) {
            oos.writeObject(veiculo);
        }
    }

    public Veiculo carregar() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CAMINHO_ARQUIVO))) {
            return (Veiculo) ois.readObject();
        }
    }
}