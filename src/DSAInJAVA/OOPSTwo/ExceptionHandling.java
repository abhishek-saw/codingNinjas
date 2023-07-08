package DSAInJAVA.OOPSTwo;

public class ExceptionHandling {
    public static void main(String[] args) {
        String s = null;
//        System.out.println(s.length());
//        System.out.println(4/0);
        try {
            divide(10,1);
            System.out.println(fact(5));
            System.out.println("Divide method is executed");
        } catch (DivideByZeroException e) {
            System.out.println("Divide by Zero Exception raised");
        }
        catch (NegativeNumberException e) {
            System.out.println("Negative Number Exception");
        }
//        catch(Exception e){
//            System.out.println("Generic Exception");
//        }
        System.out.println("Main");
    }
    public static int divide(int a, int b) throws DivideByZeroException {
        if(b==0){
//            throw new ArithmeticException();
            throw new DivideByZeroException();
        }
        return a/b;
    }
    public static int fact(int n) throws NegativeNumberException {
        if(n<0){
            throw new NegativeNumberException();
        }
        int ans =1;
        for(int i=n;i>=1;i--){
            ans*=i;
        }
        return ans;

    }
}
