/* Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
 */
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку (a): ");
        String a = scan.nextLine();

        System.out.print("Введите вторую строку (b): ");
        String b = scan.nextLine();

        if(a.equals(b)) {
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки неидентичны");
        }
        scan.close();
    }
}
