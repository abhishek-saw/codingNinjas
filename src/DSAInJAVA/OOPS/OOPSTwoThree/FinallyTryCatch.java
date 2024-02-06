package DSAInJAVA.OOPS.OOPSTwoThree;

public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            divide(10, 1);
//                File f = new File();
            System.out.println("Divide method is executed");
        } catch (DivideByZeroException e) {
            System.out.println("Divide by Zero Exception raised");
        } finally {
//                f.close();
            System.out.println("Finally. Always prints");
        }
        System.out.println("Main");
    }

    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
//            throw new ArithmeticException();
            throw new DivideByZeroException();
        }
        return a / b;
    }

}
