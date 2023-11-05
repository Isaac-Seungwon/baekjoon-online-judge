package B1_2869_달팽이는올라가고싶다;

import java.util.Scanner;

//백준 2869
public class temp1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] math = input.split(" ");
        int a = Integer.parseInt(math[0]);      //올라가는 거리
        int b = Integer.parseInt(math[1]);      //내려오는 거리
        int v = Integer.parseInt(math[2]);      //정상까지의 높이

        //a-b //하루에 올라가는 거리
        int day = (v-a)/(a-b) ;

        if((v-a) % (a-b) != 0){
            day = day + 1;
        }
        System.out.print(day+1);
    }
}
