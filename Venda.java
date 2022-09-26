

public class Venda  {
     public static int cont ;
        int Codi_venda, Cod_prod, Quantidade;
        Float valor_total;
        Produto produto;
        Cliente cliente;
      
        public Venda( Produto produto, int quantidade , Cliente cliente ) {
            ++cont;
             this.produto = produto;
             this.cliente = cliente;
             this.Quantidade =  quantidade;
             this.Codi_venda =  cont;
            
        }
        public int getCodi_venda() {
            return Codi_venda;
        }
        public void setCodi_venda(int codi_venda) {
            Codi_venda = codi_venda;
        }
       
        public int getQuantidade() {
            return Quantidade;
        }
        public Cliente getCliente() {
            return cliente;
        }
         public void setCliente(Cliente cliente) {
                 this.cliente = cliente;
        }

        public Produto getProduto() {
            return produto;
        }
        public void setProduto(Produto produto) {
            this.produto = produto;
        }
        
        public void setProdutoe(Produto produto) {
            this.produto = produto;
   }
        public void  print (){
         System.out.printf("Cod_venda: %d - Cod_Prod: %d- nome Produto: %s - Quantidade: %d - nome_cli: %s  - valor: %f",
            this.getCodi_venda() ,getProduto().Codigo, getProduto().Nome , this.getQuantidade() , this.getCliente().Nome, getProduto().Preco);
           
        }
 
   
        

        



  
      
    
       

    
      



}