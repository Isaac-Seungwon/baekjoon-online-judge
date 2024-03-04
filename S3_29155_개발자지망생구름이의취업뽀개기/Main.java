package S3_29155_개발자지망생구름이의취업뽀개기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] arr;
	static List<Integer>[] lists;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[6];
		lists = new List[6];
		int answer = 0;
		
		for (int i = 1; i <= 5; i++) {
			lists[i] = new ArrayList();
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            lists[n].add(t);
        }

        for (int i = 1; i <= 5; i++) {
            Collections.sort(lists[i]);
        }

        for (int i = 1; i <= 5; i++) {
            int n = arr[i];
            int pre = lists[i].get(0);

            for (int j = 0; j < n; j++) {
                int t = lists[i].get(j);
                answer += t;
                answer += t - pre;
                pre = t;
            }
        }

        answer += 240;
        System.out.println(answer);
	}
	
}
