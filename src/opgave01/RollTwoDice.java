package opgave01;

public class RollTwoDice {

    public static int rollCount = 0;
    public static int addedValue = 0;
    public static int countSame = 0;

    public static void main(String[] args) {

        printRules();
        for (int rolls = 0; rolls < 6; rolls++) {
            int[] rollDiceResult = rollDice();
            System.out.println(rolls + 1 + " kast " + rollDiceResult[0] + ", " + rollDiceResult[1]);
        }
        System.out.println("Du har slået " + rollCount + " gange ");
        System.out.println(" Den samlede værdi af dine kast er " + addedValue);
        System.out.println("Du har slået " + countSame + " ens ");
    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Kast to terning 6 gange");
        System.out.println("Spilleren ruller to terning, så længde man lyster.");
        System.out.println("=====================================================");

    }

    public static int[] rollDice() {
        int[] rollArray = new int[2];

        rollArray[0] = (int) (Math.random() * 6 + 1); //6 sider
        rollArray[1] = (int) (Math.random() * 6 + 1);
        adddValue(rollArray);
        updateRollCount();
        return rollArray;
    }


    public static void adddValue(int[] addFaces) {
        addedValue += addFaces[0] + addFaces[1];
    }


    public static void updateRollCount() {
        rollCount++;
    }

    public static boolean sameValue(int[] sameFaces) {

        if (sameFaces[0] == sameFaces[1]) {
            countSame = 0;
        }
        return false;
    }


    private static void printStatistics() {
        System.out.println("\nResults:");
        System.out.println("-------");
        System.out.printf("%17s %4d\n", "Antal rul:", rollCount);
    }
}
