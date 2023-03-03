
package InterfaceIteratorAndComparator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
      
       /* ArrayList<String> listaNome = new ArrayList<>(); // foi criada a ArraList
        listaNome.add("Francisca");
        listaNome.add("Igor");
        */
        
        /*for(String nome : listaNome){
        System.out.println(nome);
        }*/
                    //Iterator
                    
       /* Iterator <String> iterator = listaNome.iterator();
        
            while(iterator.hasNext()){
            System.out.println(iterator.next());
            }
        */
                    //Comparator
                  
                ArrayList<String> listaNome = new ArrayList<>(); // foi criada a ArraList
                listaNome.add("Francisca");
                listaNome.add("Igor");
        
                System.out.println("Elementos Antes da ordenacao");
                
                for(int i = 0; i<listaNome.size();i++)
                    System.out.println(listaNome.get(i));
                
                Comparator<String> comparator = Collections.reverseOrder();
                
                Collections.sort(listaNome, comparator);
                       
                
                Iterator <String> iterator = listaNome.iterator(); 
                
                System.out.println("Elementos depois da ordenacao"); 
                 
                while(iterator.hasNext()){
                   System.out.println(iterator.next());
                    }
                
                
                 
             }
    
}
