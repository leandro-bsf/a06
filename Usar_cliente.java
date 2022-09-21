import java.util.ArrayList;
import java.util.List;

public class Usar_cliente {
    
    List <Cliente> cliente = new ArrayList<>();
    public void Adicionar_Cliente(Cliente c){
        cliente.add(c);
    }
   
    public void  print (){
        for(Cliente c: cliente){
            c.print();
        }
    }
}
