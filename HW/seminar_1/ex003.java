/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */


public class ex003 {

    public static void division(int[] a, int[] b){
        double[] result = new double[a.length];
        if(a.length == b.length){
            for (int i = 0; i < result.length; i++) {
                double value = Double.valueOf(a[i]) / Double.valueOf(b[i]);
                result[i] = value;
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+", ");
            }
            System.out.println();
        } else{
            System.out.println("RuntimeException: Длины входящих массивов не равны!");
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{3,2,2,4,5};
        int[] c = new int[]{1,2,3,4,5,6};
        int[] d = new int[]{1,2,3,4,5};
        int[] f = new int[]{};

        division(a, b);
        division(c, d);
        division(f, d);
    }
}
