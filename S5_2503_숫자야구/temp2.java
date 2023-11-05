package S5_2503_숫자야구;

import java.util.*;

/*
 * 백준 2503 : 숫자야구
 * 조건 : 서로 다른 숫자 세개, 0은 미포함
 */
public class Temp2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[1000];  //정답이 될만한 숫자들을 담는 배열
      
      for(int i=123; i<=987; i++) {  //조건
         String s=Integer.toString(i);
         if(s.charAt(0)==s.charAt(1) || s.charAt(0)==s.charAt(2) || s.charAt(1)==s.charAt(2)
               || s.charAt(0)=='0' || s.charAt(1)=='0' || s.charAt(2)=='0') {
            arr[i]=-1;
         }
      }
      
      int questionNum=sc.nextInt();  //질문횟수
      for(int i=0; i<questionNum; i++) {
         String guess=sc.next();
         int strike=sc.nextInt();
         int ball=sc.nextInt();
         
         
         for(int j=123; j<=987; j++) {
            if(arr[j]==-1) {
               continue;
            }
            int strikeCnt=0;
            int ballCnt=0;
            String input=Integer.toString(j);
            for(int k=0; k<3; k++) {
               if(guess.charAt(k)==input.charAt(k)) {
                  strikeCnt++;
               }
               for(int b=0; b<3; b++) {
                  if((guess.charAt(k)==input.charAt(b)) && (k!=b)) {
                     ballCnt++;
                  }
               }
            }
            if((strike==strikeCnt) && (ball==ballCnt)) arr[j]++;
         }
      }
      int answer=0;
      for(int i=123; i<=987; i++) {
         if(arr[i] != -1 && arr[i]==questionNum) {
            answer++;
         }
      }
      System.out.println(answer);
   }
}