package br.com.alura.modelos;

public class compra implements Comparable<compra>{
    private String descricao;
    private double valor;

    public compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "compra: descricao = " + descricao +
                ", valor=" + valor;
    }

    @Override
    public int compareTo(compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
