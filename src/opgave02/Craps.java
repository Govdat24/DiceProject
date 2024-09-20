package opgave02;

public class Craps {
    public static void main(String[] args) {
        playCraps();
    }

    public static void playCraps() {
//        int firstDice = (int) (Math.random() * 6 + 1); //6 sides
//        int secondDice = (int) (Math.random() * 6 + 1);
//        int firstRoll = firstDice + secondDice;
        int firstRoll = rollDice();

        if (firstRoll == 7 || firstRoll == 11) {
            System.out.println("You rolled " + firstRoll + " and so you win");
        } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
            System.out.println("You rolled " + firstRoll + " and so you lose");
        } else {
            rollforPoint(firstRoll);

//            System.out.println("You rolled " + firstRoll + " and so game continues");
//            int point = firstRoll;
//            if (rollforPoint(point)) {
//                System.out.println("You rolled your point " + point + " and so you win");
//            } else {
//                System.out.println("You rolled 7 and so you lose");
        }
    }

    public static int rollDice() {
        int roll1 = (int) (Math.random() * 6 + 1); //6 sides
        int roll2 = (int) (Math.random() * 6 + 1);
        int roll = roll1 + roll2;

        return roll;
    }

    public static boolean rollforPoint(int point) {
//        boolean gameIsOn = true;
////        boolean result = true;
//        while (gameIsOn == true) {
//            int firstDice = (int) (Math.random() * 6 + 1); //6 sides
//            int secondDice = (int) (Math.random() * 6 + 1);
//            int Roll = firstDice + secondDice;
//            if (Roll == 7) {
////                result = false;
//                gameIsOn = false;
//
//            } else if (Roll == point) {
////                result = true;
//                gameIsOn = false;
//
//            } else {
//                System.out.println("You rolled " + Roll + " and so game continues");
//
//            }
//        }
        int firstRoll = point;
        int latestRoll = point;

        do {
            System.out.println("You have " + latestRoll + " point ");
            latestRoll = rollDice();
        }
        while (latestRoll != 7 && latestRoll != firstRoll);

        System.out.println("You rolled " + latestRoll + " so you lose ");

        return true;

    }
}


