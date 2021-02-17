package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
      Tabla tabla = new Tabla('#');
      System.out.println("4. feladat: Az üres tábla");
      tabla.megjelenit();
      
        System.out.println("6.feladat: A feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
