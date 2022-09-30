public class VendaItem{

    Produto Produto;
    Venda Venda;
    public static float TotalVenda ;
    int quantidade;

public VendaItem (Produto produto ,int quantidade ,Venda venda){
    if( produto.quantidade < quantidade){
        throw new IllegalArgumentException("Estoque insuficiente");


    }

    Produto  = produto;
    Venda = venda;
    this.quantidade = quantidade;
    TotalVenda += quantidade * produto.Preco;

}
public Produto getProduto() {
    return Produto;
}
public void setProduto(Produto produto) {
    Produto = produto;
}
public Venda getVenda() {
    return Venda;
}
public void setVenda(Venda venda) {
    Venda = venda;
}

public float getTotalVenda() {
    return TotalVenda;
}
public void setTotalVenda(float totalVenda) {
    TotalVenda = totalVenda;
}
public int getQuantidade() {
    return quantidade;
}
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
public void printVenda (){
   
    System.out.println("|" + getProduto().Codigo+" |"+ getProduto().Nome +"| "+getProduto().Preco+"|  " + getQuantidade()+"|   " +getProduto().Preco*getQuantidade());
                 
}
public void  totalPedido(){
    System.out.printf("total venda: %.2f ",getTotalVenda());
    
}

}