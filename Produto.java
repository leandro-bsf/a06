public class Produto{
    String Nome;
    float Preco;
    int Codigo;
    
    public Produto(String nome, float preco, int quantidade, int codigo) {
        Nome = nome;
        Preco = preco;
       
        extracted(codigo);
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
    public void  print (){
        System.out.printf("Codigo: %d - nome: %s - Preco: %f",
        this.getCodigo(), this.getNome(),  this.getPreco() );
    }
       
        
}
