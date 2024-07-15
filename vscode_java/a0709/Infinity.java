package a0709;

public class Infinity {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        //잘못된코드
        //System.out.println(z + 2);

        //알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z + 2);
        }

    }
}
