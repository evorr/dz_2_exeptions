import java.util.InputMismatchException;
import java.util.Scanner;

public class dz_1_alg {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
    // приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args){
        float result = getFloat();
        System.out.println(result);
    }

    public static float getFloat(){
        float number = 0;
        boolean result = true;
        try{
            while(result){
                try{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите дробное число: ");
                    if(scanner.hasNextFloat()){
                        number = scanner.nextFloat(); // если вводить с запятой
                    } else {
                        number = Float.parseFloat(scanner.nextLine()); // если вводить с точкой
                    }
                    scanner.close();
                    result = false;
                } catch (InputMismatchException | NumberFormatException | NullPointerException e){
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("непредвиденное исключение" + e.getMessage());
        }
        return number;
    }
}
