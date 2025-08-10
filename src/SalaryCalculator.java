import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя сотрудника: ");
        String name = scanner.nextLine();// считывает строку - надо для ввода имени
        double hourlyRate;
        while (true) {
            System.out.print("Введите часовую ставку в $: ");
            if (scanner.hasNextDouble()) {
                hourlyRate = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ошибка: введите число.");
                scanner.next(); // сбрасываем неверный ввод
            }
        }
        int hoursPerWeek;
        while(true){
            System.out.println("Введите количество рабочих часов в неделю: ");
            if(scanner.hasNextInt()){
                hoursPerWeek = scanner.nextInt();// считывает введеное целое число
                if (hoursPerWeek > 20 && hoursPerWeek<50)
                break;
                else System.out.println("Недопустимое количество часов");
            }
            else {
                System.out.println("Ошибка: введите число.");
                scanner.next(); // сбрасываем неверный ввод
            }
        }
        int taxRate;
        while(true){
            System.out.println("Введите ставку налога: ");
            if(scanner.hasNextInt()){
                taxRate = scanner.nextInt();// считывает введеное целое число
                if (taxRate > 0 && taxRate < 100)
                    break;//break здесь нужен, чтобы выйти из цикла while (true), когда пользователь ввёл корректное значение.
                    else System.out.println("Ставка налога должна быть от 0 до 100");
            }
            else {
                System.out.println("Ошибка: введите число.");
                scanner.next(); // сбрасываем неверный ввод
            }
        }

        double weekSalary = weekSalary(hourlyRate,hoursPerWeek);
        double monthSalary = monthSalary(weekSalary);
        double yearSalary = yearSalary(monthSalary);
        double pureSalary = yearSalary - taxes(yearSalary,taxRate);
        System.out.println("Сотрудник " + name + " зарабатывает " + weekSalary + "$ в неделю " + monthSalary + "$ в месяц " + yearSalary + "$ в год и при ставке налога " + taxRate + "% имеет чистый доход " + pureSalary+"$ в год" );
        scanner.close(); //После считывания данных лучше вызвать scanner.close(); в конце main. Это хорошая привычка, чтобы не держать открытые ресурсы.
    }

    //Расчет недельной ЗП
    private static  double weekSalary(double rate, int hours){
        return rate*hours;
    }

    //Расчет месячной ЗП
    private  static  double monthSalary(double weekSalary){
        return weekSalary * 4;
    }

    //Расчет годовой ЗП
    private  static  double yearSalary(double monthSalary){
        return monthSalary * 12;
    }

    //Расчет налогов
    private  static  double taxes(double yearSalary, int taxRate){
        return (yearSalary * taxRate)/100;
    }

}
