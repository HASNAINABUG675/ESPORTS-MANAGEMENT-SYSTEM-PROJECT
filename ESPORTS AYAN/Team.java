import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void displayTeam() {
        System.out.println("\nTeam Name: " + teamName);

        for (Player p : players) {
            p.display();
        }
    }
}