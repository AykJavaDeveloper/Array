public class Main {
    public static void main(String[] args) {
        int certCount = 1000;
        int winnerRate = 100;
        int[] certNumbers = new int[certCount];
        int[] winnerTickets = new int[certCount / 100];
        int iteratorForWinnersTeckets = 0;


        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            if (i % winnerRate == 0) {
                winnerTickets[iteratorForWinnersTeckets] = certNumbers[i];
                System.out.println("Value winner ticket: " + winnerTickets[iteratorForWinnersTeckets] +
                        " with number: " + (iteratorForWinnersTeckets + 1));

                iteratorForWinnersTeckets++;
            }
        }
    }
}