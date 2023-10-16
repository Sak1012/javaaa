class Adder{  
    static double add(int a, int b){ return (double)(a+b); }  
    static int add(double a, double b){ return (int)(a+b); }
    static double sub(int a, int b){ return (double)(a-b); }
    static int sub(double a, double b){ return (int)(a-b); }
    static double multiply(int a, int b){ return (double)(a*b); }
    static int multiply(double a, double b){ return (int)(a*b); }
    static double div(int a, int b){ 
        if (b>0) {
            return (double)(a/b);
        }else{
            System.out.println("Value must not be zero");
            return 0;
        }
    }
    static int div(double a, double b){
        if (b>0) {
            return (int)(a+b); 
        }else{
            System.out.println("Value must not be zero");
            return 0;
        }
    }    
}  
class ArithmeticOperations{  
    public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(12.3,12.6));  
        System.out.println(Adder.sub(12.3,14.6));  
        System.out.println(Adder.sub(12,13));  
        System.out.println(Adder.multiply(12.3,12.6));  
        System.out.println(Adder.multiply(12,12));  
        System.out.println(Adder.div(12.3,2.6));  
        System.out.println(Adder.div(12,2));  
    }
}
