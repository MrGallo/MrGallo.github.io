public class ModulusAnimation {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 10 == 0)
                System.out.print(" Mr. Gallo is cool. \n");

            Thread.sleep(200);
        }
    }
}
