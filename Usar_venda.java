import java.util.ArrayList;
import java.util.List;

public class Usar_venda {
    List <Venda> venda = new ArrayList <>();
    

    public  void Lanca_venda(Venda v){
        venda.add(v);
    }
    public void  print (){
        for(Venda c: venda){
            c.print();
        }
}
}