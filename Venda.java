import java.util.ArrayList;
import java.util.List;



public class Venda  {
     public static int cont ;
        int Codi_venda, Cod_prod, Quantidade;
        Float valor_total;
        FormaPgt formapgt;
       Produto produto ;
       List <Produto> listp = new ArrayList<>();
        Cliente cliente;
      
       
        public Venda(Produto produto , int quantidade , Cliente cliente ,FormaPgt fpgt ) {
            ++cont;
        if( produto.quantidade < quantidade){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
         
            
             this.cliente = cliente;
             this.Quantidade =  quantidade;
             this.Codi_venda =  cont;
            this.produto = produto;
            formapgt = fpgt;
             listp.add(produto);
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
        public void setFormapgt(FormaPgt formapgt) {
            this.formapgt = formapgt;
        }
        public FormaPgt getFormapgt() {
            return formapgt;
        }
       public void setProduto( Produto produto) {
           this.produto = produto;
       }
       public Float getValor_total() {
           return valor_total;
       }
       public void setValor_total(Float valor_total) {
           this.valor_total = getQuantidade()*getProduto().Preco;
       }

       
        
        public void  print (){
         System.out.printf("Cod_venda: %d  - cliente: %s -forma pgt: %s\n ",
            this.getCodi_venda()  , this.getCliente().Nome, getFormapgt());
            System.out.println("-----------------\n");
           for(Produto p: listp ){
             System.out.printf(" %d   -  %s -%d - %f\n",p.Codigo , p.Nome, getQuantidade(),p.Preco );

           }
            System.out.printf("Total Pedido: %f\n", getQuantidade()*getProduto().Preco)      ;
        }

        public void venda(Produto acucar, int i) {
        }
 
   
        

        



  
      
    
       

    
      



}