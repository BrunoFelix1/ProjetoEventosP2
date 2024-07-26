package Persistence;

import java.util.ArrayList;

import Interfaces.iPersistenciaControlador;
import Models.Secao;



public class PersistenceSecao implements iPersistenciaControlador<Secao> {
    //Instanciando manipulador e adicionando o path da tabela de Seções
    private String pathSecao = "C:\\Users\\PC TESTE\\Desktop\\Docs para P2\\Seções.txt";
    private ManipuladorArquivos manipulador = new ManipuladorArquivos(pathSecao);

    //Retorna um objeto Secao em formato de linha String
    private String SecaoToCSV(Secao secao){
        String linha = secao.getId() + "," + secao.getId_evento()+ "," + secao.getId_subEvento() + "," +
        secao.getLocal()+ "," + secao.getHorario();
        return linha;
    }

    //Retorna uma lista de todas as secoes no momento
    public ArrayList<Secao> getTodos() {
        Secao secaoDaVez = new Secao();
        String linha;
        ArrayList<Secao> secoes = new ArrayList<>();
        manipulador.abrirArquivoParaLeitura();
        while ((linha = manipulador.lerLinhaArquivo()) != null){
            //Desconsiderando cabeçalho
            if (linha.contains("id")){
                continue;
            }
            String dados [] = linha.split(",");
            secaoDaVez.setId(Integer.parseInt(dados[0]));
            secaoDaVez.setId_evento(Integer.parseInt(dados[1]));
            secaoDaVez.setId_subEvento(Integer.parseInt(dados[2]));
            secaoDaVez.setLocal(dados[3]);
            secaoDaVez.setHorario(dados[4]);
            secoes.add(secaoDaVez);
        }
        manipulador.fecharArquivoParaLeitura();
        return secoes;
    }

    //Adiciona uma Secao na tabela
    public void add(Secao secao) {
        String linha = SecaoToCSV(secao);
        manipulador.abrirArquivoParaEscrita();
        manipulador.escreverNoArquivoPorUltimo(linha);
        manipulador.fecharArquivoEscrita();
    }

    public void delete (Secao secao) {
        ArrayList<Secao> secoes = new ArrayList<>();
        secoes = getTodos();
        for (int i = 0; i < secoes.size(); i++){
            if (secao.getId() == secoes.get(i).getId()){
                secoes.remove(i);
                break;
            }
        }
        manipulador.abrirArquivoParaEscrita();
        manipulador.escreverNoArquivo("id,evento_id,titulo,local,horario,descricao");
        for (Secao u : secoes){
            manipulador.escreverNoArquivo(SecaoToCSV(u));
        }
        manipulador.fecharArquivoEscrita();
    }

    public void update (Secao secaoAntiga, Secao secaoNova) {
        ArrayList<Secao> secoes = new ArrayList<>();
        secoes = getTodos();
        for (int i = 0; i < secoes.size(); i++){
            if (secaoAntiga.getId() == secoes.get(i).getId()) {
                secoes.get(i).setId_evento(secaoNova.getId_evento());
                secoes.get(i).setId_subEvento(secaoNova.getId_subEvento());
                secoes.get(i).setLocal(secaoNova.getLocal());
                secoes.get(i).setHorario(secaoNova.getHorario());
                break;
            }
        }
        manipulador.abrirArquivoParaEscrita();
        manipulador.escreverNoArquivo("id,evento_id,titulo,local,horario,descricao");
        for (Secao u : secoes) {
            manipulador.escreverNoArquivo(SecaoToCSV(u));
        }
        manipulador.fecharArquivoEscrita();
    }

    public Secao getPorId(int id) {
        ArrayList<Secao> secoes = getTodos();
        for (Secao s : secoes) {
            if (id == s.getId()) {
                return s;
            }
        }
        return null; // Caso não encontre o ID da Seção
    }

    //Usar apenas na persistência da inscrição
    public Secao getPorIdInscricao(int id, int id2, int id3, int id4, int id5){
        Secao Secao = new Secao();
        return Secao;
    }
}
