public class Cliente {
    int Codigo;
    String Nome , Cpf;
     public Cliente(int codigo, String nome , String cpf){
         this.Codigo = codigo;
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
        System.out.printf("Codigo: %d - nome: %s - CPF: %s",
         this.getCodigo() , this.getNome() , this.getCpf());
    }

}
