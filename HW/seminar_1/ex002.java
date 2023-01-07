/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

/**
 * ex002
 */
public class ex002 {

    public static int[] difference(int[] a, int[] b){
        int[] result = new int[a.length];
        if(a.length == b.length){
            for (int i = 0; i < result.length; i++) {
                result[i] = a[i] - b[i];
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+", ");
            }
            System.out.println();
        } else{
            System.out.println("RuntimeException: Длины входящих массивов не равны!");
        }

        return result;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{3,2,2,4,5};
        int[] c = new int[]{1,2,3,4,5,6};
        int[] d = new int[]{1,2,3,4,5};

        difference(a, b);
        difference(c, d);
    }
}