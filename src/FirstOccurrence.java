import java.util.Scanner;
public class FirstOccurrence {
        
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int K = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                        arr[i] = sc.nextInt();
                }
                int pos = -1;
                for (int i = 0; i < N; i++) {
                        if (arr[i] == K) {
                                pos = i + 1; // 1-based index
                                break;
                        }
                }
                System.out.println(pos);
        }
    
}
