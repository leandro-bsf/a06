public class Cliente {
    public static int cont ;
    int Codigo;
    String Nome , Cpf;
     public Cliente( String nome , String cpf){
        ++cont;
         this.Codigo = cont;
         this.Nome = nome;
         this.Cpf = cpf;
     }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public void print(){
        System.out.printf("Codigo: %d - nome: %s - CPF: %s\n",
         this.getCodigo() , this.getNome() , this.getCpf());
    }

}
