package B1_10789_세로읽기;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temp1 {
   
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String a = br.readLine();
      String b = br.readLine();
      String c = br.readLine();
      String d = br.readLine();
      String e = br.readLine();
      
      for (int i = 0; i < 15; i++) {
         if (i < a.length())
            System.out.print(a.charAt(i));
         if (i < b.length())
            System.out.print(b.charAt(i));
         if (i < c.length())
            System.out.print(c.charAt(i));
         if (i < d.length())
            System.out.print(d.charAt(i));
         if (i < e.length())
            System.out.print(e.charAt(i));
      }
      
      br.close();
   }
}