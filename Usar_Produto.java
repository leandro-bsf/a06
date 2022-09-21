import java.util.ArrayList;
import java.util.List;

public class Usar_Produto {
    List <Produto> produto = new ArrayList <>();

    public void Adicionar_Produto(Produto p){
        produto.add(p);
    }
    public  void print (){
        for(Produto p: produto){
            p.print();
        }
    }
}
