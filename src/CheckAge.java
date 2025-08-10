import java.util.Scanner;

/**
 * Напиши программу:
 *
 * Спрашивает у пользователя возраст.
 *
 * Если возраст < 18 → выводит "Вы несовершеннолетний".
 *
 * Если 18–59 → "Вы взрослый".
 *
 * Если 60 и больше → "Вы пожилой".
 *
 * Всё сделать с проверкой корректности ввода (без падения программы при неправильном типе данных).
 */
public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        while (true){
            System.out.println("Введите свой возраст");
            if(scanner.hasNextInt()){
                age = scanner.nextInt();
                break;
            } else{
                System.out.println("Вы ввели неверное значение");
                scanner.next(); //Без этого программа в цикле выдает надпись "Вы ввели неверное значение"
            }
        }
        System.out.println(checkAge(age));
    }
    public static String checkAge(int age){
        if (true == age < 18) {
            return "Вы несовершеннолетний";
        } else if (true == age > 18 && age < 59) {
            return "Вы взрослый";
        } else if (true == age > 60) {
            return "Вы пожилой";
        }
        return "Дефолтный возраст";
    }
}
