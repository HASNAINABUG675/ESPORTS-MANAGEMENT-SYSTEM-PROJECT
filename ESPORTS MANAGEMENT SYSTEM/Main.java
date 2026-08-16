import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        while (true) {

            System.out.println("\n===== ESPORTS MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Team");
            System.out.println("2. View Teams");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:

                        System.out.print("Enter Team Name: ");
                        String teamName = sc.nextLine();

                        Team team = new Team(teamName);

                        System.out.print("Enter Number of Players: ");
                        int numPlayers = Integer.parseInt(sc.nextLine());

                        if (numPlayers <= 0) {
                            throw new InvalidInputException("Invalid Input");
                        }

                        for (int i = 1; i <= numPlayers; i++) {

                            System.out.println("\nPlayer " + i);

                            System.out.print("Enter Player Name: ");
                            String playerName = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = Integer.parseInt(sc.nextLine());

                            Player player =
                                    new Player(playerName, age);

                            team.addPlayer(player);
                        }

                        teams.add(team);

                        System.out.println("Team Added Successfully!");
                        break;

                    case 2:

                        if (teams.isEmpty()) {
                            System.out.println("No Teams Available");
                        } else {
                            for (Team t : teams) {
                                t.displayTeam();
                            }
                        }

                        break;

                    case 3:
                        System.out.println("Program Closed");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Input");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
    }
}