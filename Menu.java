
public class Menu {
        public static void main(String[] args) {
           
            Cliente vitor = new Cliente ("vitor Mendes", "090255255");
            Produto carnemoida = new Produto("Carne moida--",  (float)27.50,5);
            Produto farinha = new Produto("farinha de trigo",  (float)27.50,3);
            Produto  acucar = new Produto("acuca-----------", (float)15.60, 10);
        
         
         Venda v2 = new Venda (vitor, FormaPgt.CHEQUE);

         VendaItem  VI1 =new  VendaItem(farinha,3 , v2); 
         VendaItem  VI2 = new VendaItem(carnemoida, 1, v2);
         VendaItem VI3  = new VendaItem(acucar, 2, v2);
         System.out.println("Impressao VEnda\n");
         System.out.println("id| Cliente | Forma PGT | ");
         v2.print();
         System.out.println("id |  Descicao      |Preco|Qtd|valor Total|");
          VI1.printVenda();
          VI2.printVenda();
          VI3.printVenda();
          VI2.totalPedido();
           


        }




}