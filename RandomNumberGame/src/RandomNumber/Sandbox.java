package RandomNumber;

public class Sandbox {
    public static void main(String[] args) {

        int gameNumber = Randomizer.randomNumber;
        System.out.println(gameNumber);

        int playerNumber = Randomizer.randomNumber;
        System.out.println(playerNumber);

        while (gameNumber != playerNumber) {

            System.out.println(playerNumber + " This is me");
            System.out.println(gameNumber + " This is game");
            System.out.println("fail!!!");

            playerNumber = Randomizer.randomNumber;
            System.out.println(playerNumber);
        }

            if (gameNumber == playerNumber) {
                System.out.println("GOODJOBBBBBBBB");
            }

    }
}
