package DSAInJAVA.OOPS.OOPSTwoThree.Generics;

import DSAInJAVA.OOPS.OOPSTwoThree.PrintInterface;
import DSAInJAVA.OOPS.OOPSTwoThree.Students;
import DSAInJAVA.OOPS.OOPSTwoThree.Vehicle;
import DSAInJAVA.OOPS.OOPSTwoThree.Vehicle4;

public class GenericMethod {
    public static void main(String[] args) {
        Integer arr[] =new Integer[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        printArray(arr);

        String arrS[] =new String[5];
        for(int i=0;i<arrS.length;i++){
            arrS[i] = "aaaa";
        }
        printArray(arrS);

        Vehicle v[] = new Vehicle[5];
        for(int i=0;i<v.length;i++){
            v[i] = new Vehicle() {
                @Override
                public boolean isMotorized() {
                    return false;
                }

                @Override
                public String getCompany() {
                    return null;
                }
            };
        }
        printArray(v);

        Vehicle4 v2[] = new Vehicle4[5];
        for(int i=0;i<v.length;i++){
            v2[i] = new Vehicle4(10*i, "BMW") ;
        }
        printArray2(v2);

        Students s1[] = new Students[5];
        for(int i=0;i<v.length;i++){
            s1[i] = new Students(i+1);
        }
        printArray2(s1);
    }

    private static <T extends PrintInterface> void printArray2(T arr[]) {
        for(int i=0;i<arr.length;i++) {
            arr[i].print();
        }
    }

    public static <T> void printArray(T arr[]){
            for(int i=0;i<arr.length;i++) {
                System.out.println(arr[i]);
            }
    }
}
