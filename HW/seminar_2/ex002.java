/**
 * ex002
 * Если необходимо, исправьте данный код 
 * try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
 */
public class ex002 {
    public static void func(int[] intArray) {
        
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
    }
     public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,0};
        func(intArray);
     }
}