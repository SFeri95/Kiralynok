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
        feladat4();
        feladat6();
        feladat9();
        }
        private void feladat4(){
         Tabla tabla = new Tabla('#');
      System.out.println("4. feladat: Az üres tábla");
      tabla.megjelenit();
        }
     
      private void feladat6(){
       System.out.println("6.feladat: A feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
      }
      
      private void feladat9(){
          System.out.println("9.feladat: Üres sorok és oszlopok száma:");
          System.out.println("Oszlopok: " + tabla.uresOszlopokSzama());
          System.out.println("Oszlopok: " + tabla.uresSorokSzama());
      }
       
    }
    

