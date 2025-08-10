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
        int age = readPositiveInt(scanner, "Введите свой возраст");
        System.out.println(checkAge(age));
        scanner.close();
    }
    public static String checkAge(int age){
        if (age < 18) {
            return "Вы несовершеннолетний";
        } else if (age >= 18 && age <= 59) {
            return "Вы взрослый";
        } else {
            return "Вы пожилой";
        }
       // return "Некорректный возраст"; //Этот ретурн нужен, если вместо последнего else написать else if
    }

    //Метод для проверки вводимого значения возраста
    public static int readPositiveInt(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > 0) return value; //Проверка что вводится возраст больше 0
                System.out.println("Возраст должен быть больше нуля"); //Почему тут else не нужен — потому что после return value; выполнение метода полностью заканчивается.
            } else {
                System.out.println("Вы ввели неверное значение");
                scanner.next();
            }
        }
    }
}
