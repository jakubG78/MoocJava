
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        System.out.println("File:");
        String fileName = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String fileRow = fileScanner.nextLine();
                String[] fileRowParts = fileRow.split(",");
                String homeTeamName = fileRowParts[0];
                String visitingTeamName = fileRowParts[1];
                int homeTeamScore = Integer.valueOf(fileRowParts[2]);
                int visitingTeamScore = Integer.valueOf(fileRowParts[3]);
                games.add(new Game(homeTeamName, visitingTeamName, homeTeamScore, visitingTeamScore));
            }
        } catch (Exception e) {
            System.out.println("File reading error " + e.getMessage());
        }

        System.out.println("Team:");
        String searchedTeam = scan.nextLine();
        int teamGamesCounter = 0;
        int teamWinsCounter = 0;
        int teamLossesCounter = 0;

        for (Game game : games) {
            if (isSearchedTeam(searchedTeam, game)) {
                teamGamesCounter++;
                if (isWinningTeam(searchedTeam, game)) {
                    teamWinsCounter++;
                } else if (game.getHomeTeamScore() != game.getVisitingTeamScore()) {
                    teamLossesCounter++;
                }
            }
        }
        System.out.println("Games: " + teamGamesCounter);
        System.out.println("Wins: " + teamWinsCounter);
        System.out.println("Losses: " + teamLossesCounter);
    }

    private static boolean isWinningTeam(String searchedTeam, Game game) {
        return (game.getHomeTeamName().equals(searchedTeam) && game.getHomeTeamScore() > game.getVisitingTeamScore())
                || (game.getVisitingTeamName().equals(searchedTeam) && game.getHomeTeamScore() < game.getVisitingTeamScore());
    }

    private static boolean isSearchedTeam(String searchedTeam, Game game) {
        return game.getHomeTeamName().equals(searchedTeam) || game.getVisitingTeamName().equals(searchedTeam);
    }

}
