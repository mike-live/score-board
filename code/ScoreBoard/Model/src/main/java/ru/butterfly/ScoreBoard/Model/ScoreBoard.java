package ru.butterfly.ScoreBoard.Model;
import java.util.Timer;

public class ScoreBoard {

    public ScoreBoard() {
        timer = new Timer();
    }

    public Timer getTime() {
        return timer;
    }

    private Timer timer;
}
