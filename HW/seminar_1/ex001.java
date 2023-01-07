/**
 * ex001
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
import java.io.*;

public class ex001 {

// ArithmeticException
    public static void ex01(){
        try{
            System.out.println(1/0);
                     
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:\t Деление на 0 невозможно\n");
        }
    }

// ArrayIndexOutOfBoundsException
    public static void ex02(){
        int[] array = new int[]{1,2,3,4,5,};

        for (int i = 0; i < array.length+1; i++) {
            try{
                System.out.println(array[i]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException:\t такого элемента не существет\n");
            }            
        }
    }

    public static void ex03() {
        try(FileReader reader = new FileReader("notes3.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println("IOException:\tЧтение невозможно: указанный фаил отсутствует");
        }   
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
    }
}