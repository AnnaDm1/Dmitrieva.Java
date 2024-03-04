/*Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
"a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
*/

import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ввод целых чисел
        System.out.print("Введите первое число (a): ");
        int a = scan.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scan.nextInt();
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

// Выполнение операций
        int sum = a + b;
        int sub = a - b;
        int multipiy = a * b;

        // Проверка деления на 0
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + sub);
            System.out.println("Произведение: " + multipiy);
            System.out.println("Частное: " + division);
        } else {
            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + sub);
            System.out.println("Произведение: " + multipiy);
            System.out.println("На 0 делить нельзя");
        }
        scan.close();
    }

}
