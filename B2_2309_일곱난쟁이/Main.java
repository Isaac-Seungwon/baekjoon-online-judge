package B2_2309_일곱난쟁이;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrDwarf = new int[9]; // 난쟁이의 키
        int sum = 0; // 난쟁이의 키 총합
        
        // 난쟁이 키 입력 및 키의 합 계산
        for (int i = 0; i < 9; i++) {
            arrDwarf[i] = Integer.parseInt(br.readLine());
            sum += arrDwarf[i];
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
            	// 총합에서 난쟁이 두명을 제외했을 때 100이 되는 경우
                if (sum - arrDwarf[i] - arrDwarf[j] == 100) {
                    arrDwarf[i] = 0; // 임포스터 i 제외
                    arrDwarf[j] = 0; // 임포스터 j 제외
                    
                    Arrays.sort(arrDwarf); // 키를 오름차순으로 정렬
                    
                    // 일곱 난쟁이의 키를 오름차순으로 출력
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arrDwarf[k]);
                    }
                    
                    return;
                }
            }
		}
	}
}