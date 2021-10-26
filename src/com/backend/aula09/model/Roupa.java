package com.backend.aula09.model;

public class Roupa {
    private Tamanho tamanho;
    private Tipo tipo;
    private boolean eNovo;
    private boolean importada;


    public Roupa(Tamanho tamanho, Tipo tipo, boolean eNovo, boolean importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNovo = eNovo;
        this.importada = importada;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Boolean geteNovo() {
        return eNovo;
    }

    public void seteNovo(boolean eNovo) {
        this.eNovo = eNovo;
    }

    public Boolean getImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }

    @Override
    public String toString(){
        return "Roupa{" +
                "Tamanho=" + tamanho +
                ", Tipo=" + tipo +
                ", Estado" + eNovo +
                ", Importada" + importada +
                '}';
    }
}
