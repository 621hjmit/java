package a0708;

public class Var_02 {
    
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:"+ y);
        int temp = x; //temp = 3
        x = y; //x = 5
        y = temp;// y =3;
        System.out.println("x:" + x + ", y:"+ y);
        //x, y의 값을 교환    
    }

}
