

public class Venda  {
        int Codi_venda, Cod_prod, Quantidade;
        String Nome_cliente, Produto;
        Float Valor, valor_total;
      
        public Venda(int codi_venda, int cod_prod, int quantidade, String nome_cliente, String produto, Float valor) {
            Codi_venda = codi_venda;
            Cod_prod = cod_prod;
            Quantidade = quantidade;
            Nome_cliente = nome_cliente;
            Produto = produto;
            Valor = valor;
        
        }
        public int getCodi_venda() {
            return Codi_venda;
        }
        public void setCodi_venda(int codi_venda) {
            Codi_venda = codi_venda;
        }
        public int getCod_prod() {
            return Cod_prod;
        }
        public void setCod_prod(int cod_prod) {
            Cod_prod = cod_prod;
        }
        public int getQuantidade() {
            return Quantidade;
        }
        public void setQuantidade(int quantidade) {
            Quantidade = quantidade;
        }
        public String getNome_cliente() {
            return Nome_cliente;
        }
        public void setNome_cliente(String nome_cliente) {
            Nome_cliente = nome_cliente;
        }
        public String getProduto() {
            return Produto;
        }
        public void setProduto(String produto) {
            Produto = produto;
        }
        public Float getValor() {
            return Valor;
        }
        public void setValor(Float valor) {
            Valor = valor;
        }

        public void  print (){
            System.out.printf("Cod_venda: %d - Cod_Prod: %d - Quantidade: %d - nome_cli: %s - Nome_Prod: %s - valor: %f",
            this.getCodi_venda() , this.getCod_prod() , this.getQuantidade() , this.getNome_cliente() , this.getProduto() , this.getValor());
           
        }
 
   
        

        



  
      
    
       

    
      



}