package pr4;


public class Score {
    private int score_milan;
    private int score_madrid;
    private String last = "DRAW";

    Score() {
        this.score_madrid = 0;
        this.score_milan = 0;
    }

    public void set_milan(int x) {
        this.score_milan = x;
    }

    public void set_madrid(int x) {
        this.score_madrid = x;
    }

    public void inc_madrid() {
        this.score_madrid++;
        this.last = "Madrid";
    }

    public void inc_milan() {
        this.score_milan++;
        this.last = "Milan";
    }

    public int get_milan() {
        return this.score_milan;
    }

    public int get_madrid() {
        return this.score_madrid;
    }

    public String get_winer() {
        if (this.score_milan > this.score_madrid) {
            return "Winner: Milan";
        }
        if (this.score_milan < this.score_madrid) {
            return "Winner: Madrid";
        } else {
            return "Winner: DRAW";
        }
    }

    public String get_last() {
        return "Last Scorer: " + this.last;
    }

    public String get_score() {
        return "Result: " + this.score_milan + " X " + this.score_madrid;
    }
}