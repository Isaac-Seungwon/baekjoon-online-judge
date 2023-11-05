package B2_2587_대표값2;

import java.util.Arrays;
import java.util.Scanner;

public class Temp1 {
    public static void main(String[] args) {

        //사용자에게 입력 받기
        Scanner scan = new Scanner(System.in);

        //평균값 구하기 위한 합계와 평균 변수 만들어서 초기화시키기
        int sum =0;
        int avg =0;

        //배열 선언
        int[] result = new int[5];

        //숫자 5개 입력 받으니까 반복문 걸기
        for(int i=0; i<5; i++) {
            int num = scan.nextInt();
            //입력받은 숫자가 10으로 나눴을 때 나누어 떨어지지 않으면 return, 나누어 떨어지면 선언했던 배열에 해당 숫자 넣기
            int remainder = num%10;
            if(remainder != 0){
                return;
            } else {
                result[i] = num;
            }
        }

        //중앙값 구하기 위해 배열정렬
        Arrays.sort(result);

        //평균 구하기 위해 반복문 걸고 합계 구하기
        for(int i=0; i<5; i++) {
            sum += result[i];
        }
        avg = sum / 5;

        //평균값, 중앙값 출력
        System.out.println(avg);
        System.out.println(result[2]);
    }
}
