package Revision.OOPS;

public class ExceptionUse {
    public static void main(String[] args) {
        String s = null;
//        System.out.println(s.length()); NullPointerException
//        System.out.println(4/0); ArithmeticException
        try {
            divide(10,0);
//            divide(10,10);
            System.out.println(fact(-1));
            System.out.println("Within try");
        }
        catch (DivideByZeroException e) {
            System.out.println("Error Occurred due to DivideByZeroException");;
        }
        catch (NegativeNumberException e) {
            System.out.println("Error Occurred to NegativeNumberException");;
        }
        catch (Exception e){
            System.out.println("Generic Exception");
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("Main");
    }
    public static int divide(int a, int b) throws DivideByZeroException {
        if (b==0) throw new DivideByZeroException();
        System.out.println(a/b);
        return a/b;
    }
    public static int fact(int n) throws NegativeNumberException {
        if(n<0){
            throw new NegativeNumberException();
        }
        int facts =1;
        for(int i =1;i<n;i++){
            facts*=i;
        }
        return facts;
    }
}
