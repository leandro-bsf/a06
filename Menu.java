

public class Menu {
        public static void main(String[] args) {
           
            Cliente vitor = new Cliente ("vitor Mendes", "090255255");
            Produto carnemoida = new Produto("Carne moida",  (float)27.50);
            vitor.print();
            carnemoida.print();

            Venda v1 = new Venda (carnemoida , 1 ,vitor);
            v1.print();



        }




}