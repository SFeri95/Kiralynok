package kiralynok;

import java.io.IOException;

public class Kiralynok {
    private Tabla tabla;
    
    public Kiralynok(){
    tabla = new Tabla('#');
    }
    
    public static void main(String[] args) throws IOException {
        Kiralynok kir = new Kiralynok();
        kir.megoldasok();
    }
        public void megoldasok(){
        
        }
        private void fealadat4(){
         Tabla tabla = new Tabla('#');
      System.out.println("4. feladat: Az üres tábla");
      tabla.megjelenit();
        }
     
      private void fealadat6(){
       System.out.println("6.feladat: A feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
      }
      
      
       
    }
    
}
