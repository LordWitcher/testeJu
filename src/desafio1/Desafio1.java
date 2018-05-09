
package desafio1;

import java.util.List;
import java.util.ArrayList;

public class Desafio1 {

    public static void main(String[] args) {
        int[] entrada = {100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150};
        List <String> grupo = new ArrayList();
        Desafio1 d = new Desafio1();
        grupo = d.metodo(entrada);
        System.out.println(grupo.toString());
    }

    public List<String> metodo(int[] entrada) {
        List <String> grupo = new ArrayList();
        List<Integer> sequencia = new ArrayList();
        for (int i = 0; i < entrada.length; i++) {
            if(i +1 == entrada.length){
                sequencia.add(entrada[i]);
                grupo.add("" + sequencia.get(0));               
            }else if(entrada[(i + 1)] == (entrada[i] + 1)) {
               sequencia.add(entrada[i]);
            }else{
               sequencia.add(entrada[i]);
               grupo.add("" + sequencia.get(0) + " - " + sequencia.get(sequencia.size()-1));
               sequencia.clear();
                              
            }
            
        }
        return grupo;
    }
}
