public class Produto{
    public static int cont ;
    String Nome;
    float Preco;
    int Codigo;
    
    public Produto(String nome, float preco) {
        ++cont;
        Nome = nome;
        Preco = preco;
        Codigo = cont;
       

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
        System.out.printf("Codigo: %d - nome: %s - Preco: %f \n",
        this.getCodigo(), this.getNome(),  this.getPreco() );
    }
       
        
}
