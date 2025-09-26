package in.kgcoding.Practice;

public class Calculator {
    public int add (int a,int b){
     return a + b;
    }
    public int add (int a, int b, int c){
        return a + b + c;
    }
    public double add (double a , double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();//
        System.out.println("2 integer " +cal.add(12,3));//
        System.out.println("3 integer " +cal.add(12,23,23));//
        System.out.println("double values " +cal.add(12.3,13.4));//

    }
}
