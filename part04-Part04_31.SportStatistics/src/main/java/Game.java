
public class Game {

    private String homeTeamName;
    private String visitingTeamName;
    private int homeTeamScore;
    private int visitingTeamScore;

    public Game(String homeTeamName, String visitingTeamName, int homeTeamScore, int visitingTeamScore) {
        this.homeTeamName = homeTeamName;
        this.visitingTeamName = visitingTeamName;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public void setVisitingTeamName(String visitingTeamName) {
        this.visitingTeamName = visitingTeamName;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public void setVisitingTeamScore(int visitingTeamScore) {
        this.visitingTeamScore = visitingTeamScore;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public String getVisitingTeamName() {
        return visitingTeamName;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public int getVisitingTeamScore() {
        return visitingTeamScore;
    }

}
