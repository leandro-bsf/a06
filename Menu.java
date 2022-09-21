

public class Menu {
        public static void main(String[] args) {
               Usar_Produto lista =  new Usar_Produto(); 
               Usar_cliente lista_cliente =  new Usar_cliente();
               Usar_venda venda = new Usar_venda();

            lista.Adicionar_Produto(new Produto("Carne Moida", (float) 22.50 , 5, 0));
            lista.Adicionar_Produto(new Produto("File Americano", (float) 22.50 , 5, 0));
            lista_cliente.Adicionar_Cliente(new Cliente(5,"Leandro barbosa", "09052427933"));
           // lista.print();
           // lista_cliente.print();
            venda.Lanca_venda(new Venda (1,1,1, "LEandro", "Sorvete", (float)8.50));
            venda.print();
        }




}