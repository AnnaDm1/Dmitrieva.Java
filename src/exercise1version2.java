/*Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
"a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
*/
import java.util.Scanner;
public class exercise1version2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Ввод целых чисел
        System.out.print("Введите первое число (a): ");
        int a = scan.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scan.nextInt();

        int res;

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        // Выполнение операций
        System.out.print("Введите действие (+, -, * или /): ");
        String action = scan.nextLine();
        action = scan.nextLine();

        switch (action) {
            case "+":
                res = a + b;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = a - b;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = a * b;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if(b == 0)
                    System.out.println("На 0 делить нельзя");
                else {
                    res = a / b;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Неверный ввод");
        }
        scan.close();
    }
    }

