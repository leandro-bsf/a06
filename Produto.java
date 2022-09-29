public class Produto{
    public static int cont ;
    String Nome;
    float Preco;
    int Codigo;
    int quantidade;
    
    public Produto(String nome, float preco, int quantidade) {
        ++cont;
        Nome = nome;
        Preco = preco;
        Codigo = cont;
       this.quantidade = quantidade;

    }
    private int extracted(int codigo) {
        return Codigo = codigo;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public float getPreco() {
        return Preco;
    }
    public void setPreco(float preco) {
        Preco = preco;
    }
    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        extracted(codigo);
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void  print (){
        //float total = 0;
       // total += quantidade * getPreco();
        System.out.printf("Codigo: %d - nome: %s - Preco: %f  - Quantidade: %d \n",
        this.getCodigo(), this.getNome(),  this.getPreco(), getQuantidade() );
       // System.out.printf("total: %f", total);
    }
       
        
}
