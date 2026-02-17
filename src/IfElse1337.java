import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse1337 {
        public static void main(String[] args) {
            System.out.println("Введите ответ");
            Scanner scanner = new Scanner(System.in);
            // int x = scanner.nextInt();
            String answer = scanner.nextLine();
           // boolean condition = x < 0 || x > 10;
            boolean condition = answer.equals("Да");
            if (condition) {
                System.out.println("вы меня увидете, если condition = true");
            }  else {
                if (answer.equals("Нет")) {
                    System.out.println("Вы ввели \"Нет\"");
                } else {
                    System.out.println("вы что - то не то ввели");
                }

            }
            System.out.println("меня вы видите всегда");
        }
    }

