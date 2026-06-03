package appconversao.model;

import java.time.LocalDate;

public class DadosConversaoMoeda {
    protected double valor;
    protected double cotacao;
    protected String moeda;
    protected String dataCotacao;

    public DadosConversaoMoeda(double valor, double cotacao, String moeda, String dataCotacao) {
        this.valor = valor;
        this.cotacao = cotacao;
        this.moeda = moeda;
        //this.dataCotacao = LocalDate.parse(dataCotacao);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public void getDataCotacao() {
    }

    public void setDataCotacao(String dataCotacao) {
        this.dataCotacao = dataCotacao;
    }



}
