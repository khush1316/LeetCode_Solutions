public class frog {
    public static void main(String[] args) {
        int initialHeight = 30;
        int climb = 3;
        int slip = 2;
        int currentHeight = 0;
        int hours = 0;

        while (currentHeight < initialHeight) {
            currentHeight += climb;
            hours++;

            if (currentHeight < initialHeight) {
                currentHeight -= slip;
            }
        }

        System.out.println("It takes " + hours + " hours for the frog to reach the top and get out of the well.");
    }
}

