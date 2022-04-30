package vendas;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private double valorTotal;
    private int idVenda;
    private int quantidade;
    private String produto;

    public Venda(){

    }

    public Venda(Date dataVenda, double valorTotal, int idVenda, int quantidade, String produto) {
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.idVenda = idVenda;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public void listarProduto(){

    }
    public void adicionarAoCarrinho(){

    }
    public void removerProduto(){

    }
    public void pesquisarProduto(){

    }
    public void finalizarVenda() {

    }
    public void gerarNotaFiscal (){

    }


    public Date getDataVenda() {
        return dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
