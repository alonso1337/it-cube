import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF\u200D";
    private final int x, y;
    Random r = new Random();

    Monster(int sizeBoard){
        this.y = r.nextInt(sizeBoard - 1);
        this.x = r.nextInt(sizeBoard);
    }

    public String getImage() {
        return image;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public boolean conflictPerson(int perX, int perY){
        return perY - 1 == this.y && perX - 1 == this.x;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public boolean taskMonster(int difficultGame) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Random random = new Random();
        int x;
        int y;
        switch (difficultGame) {
            case (1):
                x = random.nextInt(100);
                y = random.nextInt(100);
                System.out.println("Чему равно\t" + x + " + " + y + " = ?");
                if (x + y == scanner.nextInt()) {
                    System.out.println("Поздравляю ответ правильный");
                    return true;
                } else {
                    System.out.println("К сожалению ты проиграл схватку");
                    return false;
                }
            case (2):
                x = random.nextInt(200);
                y = random.nextInt(200);
                System.out.println("Чему равно\t" + x + " + " + y + " = ?");
                if (x + y == scanner.nextInt()) {
                    System.out.println("Поздравляю ответ правильный");
                    return true;
                } else {
                    System.out.println("К сожалению ты проиграл схватку");
                    return false;
                }
            case (3):
                x = random.nextInt(20);
                y = random.nextInt(20);
                System.out.println("Чему равно\t" + x + " * " + y + " = ?");
                if (x * y == scanner.nextInt()) {
                    System.out.println("Поздравляю ответ правильный");
                    return true;
                } else {
                    System.out.println("К сожалению ты проиграл схватку");
                    return false;
                }
            case (4):
                x = random.nextInt(35);
                y = random.nextInt(35);
                System.out.println("Чему равно\t" + x + " * " + y + " = ?");
                if (x * y == scanner.nextInt()) {
                    System.out.println("Поздравляю ответ правильный");
                    return true;
                } else {
                    System.out.println("К сожалению ты проиграл схватку");
                    return false;
                }
            case (5):

                x = random.nextInt(50);
                y = random.nextInt(50);
                System.out.println("Чему равно\t" + x + " * " + y + " = ?");
                if (x * y == scanner.nextInt()) {
                    System.out.println("Поздравляю ответ правильный");
                    return true;
                } else {
                    System.out.println("К сожалению ты проиграл схватку");
                    return false;
                }
        }
        return  false;

    }
}