package edu.teamrocket.golfstrokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    private Optional<Player> playerA = Optional.empty();
    private Optional<Player> playerB = Optional.empty();
    private Optional<Player> playerC = Optional.empty();
    private Optional<Player> playerD = Optional.empty();

    private final List<Hole> holes = new ArrayList<Hole>();

    private Course playersCourse;

    public ScoreCard(){}

    public void setPlayerA(Player playerA) {
        this.playerA = Optional.of(playerA);
    }

    public void setPlayerB(Player playerB) {
        this.playerB = Optional.of(playerB);
    }

    public void setPlayerC(Player playerC) {
        this.playerC = Optional.of(playerC);
    }

    public void setPlayerD(Player playerD) {
        this.playerD = Optional.of(playerD);
    }

    byte[] getplayersCourse(Player player){
        return playersCourse.getPlayerCourse(player);
    }


    
}