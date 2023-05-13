package homework;

import java.util.Scanner;

public class stadt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество населения от 0 до 4 млн. : ");
        int population = scanner.nextInt();

        System.out.print("Выберите страну DE (Германия) или  FR (Франция): ");
        String countryId = scanner.next();

        if (countryId.equals("DE")) {
            if (population > 0 && population < 100_000) {
                System.out.println("Это маленький город в Германии");
            } else if (population >= 100_000 && population < 400_000) {
                System.out.println("Это средний город в Германии");
            } else if (population >= 400_000 && population < 1_000_000) {
                System.out.println("Неопределённый параметр");
            } else if (population >= 1_000_000 && population < 4_000_000) {
                System.out.println("Это крупный город в Германии");
            } else {
                System.out.println("Что-то пошло не так. Попробуйте ввести значения ещё раз");
            }

        } else if (countryId.equals("FR")) {
            if (population > 0 && population < 200_000) {
                System.out.println("Это маленький город во Франции");
            } else if (population >= 200_000 && population < 500_000) {
                System.out.println("Это средний город во Франции");
            } else if (population >= 400_000 && population < 1_000_000) {
                System.out.println("Неопределённый параметр");
            } else if (population >= 1_500_000 && population < 4_000_000) {
                System.out.println("Это крупный город во Франции");
            } else {
                System.out.println("Что-то пошло не так. Попробуйте ввести значения ещё раз");
            }
        }
         else{
                System.out.println("Ошибка");
            }

            scanner.close();

        }
    }







