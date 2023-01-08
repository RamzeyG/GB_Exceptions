/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */ 


import java.util.Scanner;

public class ex001 {

   
    public static void main(String[] args) {
        
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Пожалуйста введите число с точкой:");

      
      while(sc.hasNextFloat() == false || sc.hasNextInt() == true){
        System.out.println("Неверный ввод, пожалуйста введите число с точкой");
        sc = new Scanner(System.in);
          
        }
        System.out.println("Верный ввод. Ваше число: " + sc.nextFloat());
        sc.close();
        
      }
    }

