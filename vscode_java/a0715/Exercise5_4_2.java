public class Exercise5_4_2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        int total = 0;
        float average = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                total += arr[i][j];
            }
        }
        average = total / (arr.length * arr[1].length);
        System.out.printf("total = %3d  ", total);
        System.out.printf("average = %4.2f\n", average);
    }
}
