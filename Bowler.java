public class Bowler {
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;


    public Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (wickets <= 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        double bowlingAverage = (double) runs_conceded / wickets;
        System.out.println("Name: " + name);
        System.out.printf("bowling_avg=%.1f\n", bowlingAverage);
    }

    public void showStatistics() {
        if (wickets < 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }

    public void computeStrikeRate() {
        if (wickets < 0 || runs_conceded < 0 || balls_bowled < 0 || matches < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        double strikeRate = (double) runs_conceded / balls_bowled;
        System.out.println("Name: " + name);
        System.out.printf("Strike_rate=%.8f\n", strikeRate);
    }

    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);

        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}
