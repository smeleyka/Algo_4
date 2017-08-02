import java.util.Arrays;

/**
 * Created by admin on 02.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        excersize1();

    }
    public static void excersize1(){
         int SIZE = 3;
         int arr[][] =
                {{1, 1, 1,},
                        {1, 1, 0},
                        {0, 1, 0}};
         int res[][] = new int[SIZE][SIZE];


        for (int i = 0; i < SIZE; i++) {
            if (arr[0][i]==0)res[0][i] = 0;
            else res[0][i] = 1;
        }
        for (int i = 1; i < SIZE; i++) {
            if (arr[i][0]==0) res[i][0]=0;
            else res[i][0] = 1;
            for (int j = 1; j < SIZE; j++) {
                if (arr[i][j]==0)res[i][j]=0;
                else res[i][j] = res[i - 1][j] + res[i][j - 1];
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}

