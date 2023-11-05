package S4_2839_설탕배달;

import java.util.Scanner;

public class Temp1 {
   
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int N = scan.nextInt();
      int count = 0;
      
      while (N >= 3) {
         if (N % 5 != 0) {
            N -= 3;
            count++;
            
            
            if ( N < 5 && N % 3 != 0) {
               count = -1;
               break;
            }
            
         } else {
            
            //5로 나눈 나머지가 0일 경우 > 5의 배수
            count += N / 5;
            break;
         }
         
      }
      
      System.out.println(count);

      // 값이 5로 나누어 떨어지면 > 몫이 봉지 개수
      // 값이 5로 나누어지지 않으면 > 5로 나눈 몫을 카운트에 넣고, 나머지를 3으로 나누어 떨어지는지 보고 아니면 -3 하고 도 안되면 -1 반환?
      
      
   }
}