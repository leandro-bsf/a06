

public class Menu {
        public static void main(String[] args) {
           
            Cliente vitor = new Cliente ("vitor Mendes", "090255255");
           // Produto carnemoida = new Produto("Carne moida",  (float)27.50,5);
            Produto farinha = new Produto("farinha de trigo",  (float)27.50,3);
          //  Produto acucar = new Produto("acucar cristal 5k", (float)17.50,5);
          //  vitor.print();
          //  carnemoida.print();
          // ArrayList<Produto> listP = new ArrayList<>();
          // listP.add(carnemoida);
          // listP.add(farinha);
          // listP.add(acucar);
          // farinha.print();
         
         Venda v2 = new Venda (farinha, 2, vitor, FormaPgt.CHEQUE);
          
            //v1.print();
            v2.print();
 


        }




}