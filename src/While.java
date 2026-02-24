public class While {
    public static void main(String[] args)
            throws InterruptedException {
        int x = 0;
        while (x <= 10) {
            System.out.println(x++ + " > -1");
            // Thread.sleep(50);
        }//возвращаемся к while
        //после break мы будем тут

        for(int i = 0;i <= 15; i += 2){
            System.out.println("i = " + i);
        }
        for (int variable = 0; variable < 10; variable++) {

        }
        String[] array = new String[10];
        array[9] = "Mm";
        array[8] = "Mm";
        array[7] = "Uu";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
