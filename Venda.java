


public class Venda  {
     public static int cont ;
        int Codi_venda;
     
        FormaPgt formapgt;
   
        Cliente cliente;
      
       
        public Venda(  Cliente cliente ,FormaPgt fpgt ) {
            ++cont;
        
           
             this.cliente = cliente;  
             this.Codi_venda =  cont;   
            formapgt = fpgt;
           
        }
      
        public int getCodi_venda() {
            return Codi_venda;
        }
        public void setCodi_venda(int codi_venda) {
            Codi_venda = codi_venda;
        }
       
       
         public void setCliente(Cliente cliente) {
                 this.cliente = cliente;
        }
       
        public void setFormapgt(FormaPgt formapgt) {
            this.formapgt = formapgt;
        }
        public FormaPgt getFormapgt() {
            return formapgt;
        }
      
       
        
        public void  print (){
         System.out.println("|"+this.getCodi_venda()+"|"+cliente.Nome+"|"+getFormapgt());
           
            System.out.println("-----------------\n");
           
      
        }

      
   
        

        



  
      
    
       

    
      



}