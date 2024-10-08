public class Exercise5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        int[] total = { 0, 0, 0, 0 };
        float[] average = { 0, 0, 0, 0 };

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                temp += arr[i][j];
            }
            total[i] = temp;
            average[i] = temp / arr[1].length;
            temp = 0;
            System.out.printf("total = %3d  ", total[i]);
            System.out.printf("average = %2.0f\n", average[i]);
        }
    }
}
