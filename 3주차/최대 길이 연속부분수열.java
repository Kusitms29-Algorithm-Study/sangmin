import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();


        int lt = 0, rt = 0, answer = 0, cnt = 0;

        while( rt < n ){
            if(arr[rt] == 1){ // 한 칸 이동 후, 1일때,,
                if(rt - lt +1 > answer)
                    answer = rt - lt + 1;
            } else {  // 한 칸 이동 후, 0일때,,
                cnt++;
                if(cnt > k){  // 0 > 1의 갯수가 k번 보다 많은 경우,,
                    while ( arr[lt] != 0 )
                        lt++;
                    lt++;
                    cnt--;
                    if(rt - lt + 1 > answer)
                        answer = rt - lt + 1;
                } else {  // 0 > 1의 갯수가 k번 보다 적은 경우,,
                    if(rt - lt + 1 > answer)
                        answer = rt - lt + 1;
                }
            }
            rt++; // 오른쪽 포인터 + 1
        }
        System.out.println(answer);
    }
}