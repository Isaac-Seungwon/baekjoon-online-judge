package S5_9655_돌게임;

import java.util.Scanner;

public class Temp1 {

   //Q9655. 돌게임
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int stone = scan.nextInt();
      
      /*
         - 상근 > 창영 순
         - 각자 돌 1개 or 3개 pick
         
         돌 1개: 상근 1개 > 상근 (승)
         돌 2개: 상근 1개, 창영 1개 > 창영 (승)
         돌 3개: 상근 3개 > 상근 (승)
               상근 1개, 창영 1개, 상근 1개 > 상근 (승)
         돌 4개: 창영 (승)
         돌 5개: 상근 (승)
         .
         .
         .

       */
      
      
      if (stone % 2 == 0) { 
         System.out.println("CY"); //창영이 승
      } else {
         System.out.println("SK"); //상근이 승
      }
      
   }
}