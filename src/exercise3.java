/*Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
Необходимо написать программу, которая выведет в консоль все чётные числа.
*/


public class exercise3 {
    public static void main(String[] args) {
        // Заданный массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вывод четных чисел
        System.out.println("Четные числа в массиве:");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
