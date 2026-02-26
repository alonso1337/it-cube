import java.util.Random;

public class Person {
    boolean move(int x, int y){
        this.x = x;
        this.y = y;
        return false;
    }
    public boolean MoveCorrect(int x, int y) {
        if(this.x == x && Math.abs(this.y - y) == 1 || this.y == y && Math.abs(this.x - x) == 1){
            return true;

        }else return false;


        // x == personX && Math.abs(y - personY) == 1) || (y == personY && Math.abs(x - personX) == 1) && (x < 6 && x > 0) && (y < 6 && y > 0)
    }
    void live(int personLive){
        personLive--;
    }
    Person(int size) {
        Random r = new Random();
        y = size;
        int n = r.nextInt(size);
        x = n == 0 ? 1 : n;
    }
    Person(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Person() {
        x = 1;
        y = 1;
    }
    int x, y; // координаты персонажа
    String image = "\\uD83E\\uDDD9\\u200D"; // вид персонажа на поле
    int live = 3; // количество жизней
}