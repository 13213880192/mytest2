package main.java.com.mqr;

public class exp{
    // POC open calc
    public exp(){
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] argv){
        exp e = new exp();
    }
}
