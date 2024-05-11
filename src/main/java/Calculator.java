import java.util.Scanner;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b) throws Exception{
        if (b == 0) throw new Exception("Делить на ноль нельзя!");
        return a/b;

    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        return times(4,2); //8
    }
}
