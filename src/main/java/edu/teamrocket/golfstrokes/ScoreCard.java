package edu.teamrocket.golfstrokes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    private Optional<Player> playerA = Optional.empty();
    private Optional<Player> playerB = Optional.empty();
    private Optional<Player> playerC = Optional.empty();
    private Optional<Player> playerD = Optional.empty();

    private final List<Hole> holes = new ArrayList<Hole>();

    private Course playersCourse;

    public ScoreCard(){
        
    }

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

    void setPlayersCourse(Course course ){
        this.playersCourse = course;
    }

    public List<Player> getPlayers(){
        return Arrays.asList(playerA,playerB,playerC,playerD)
        .stream()
        .filter(Optional::isPresent)
        .map(Optional::get).toList();

    }

    byte[] getPlayersCourse(Player player){
        return playersCourse.getPlayerCourse(player);
    }

    void addHoles(Byte[] holesPar){
        byte holeNumber = 1;
        for ( Byte par : holesPar){
            this.holes.add(new Hole(holeNumber, par));
        }
    }

    public List<Hole> getHoles() {
        return this.holes;
    }

    public byte getNumHoles() {
        return (byte) this.getHoles().size();
    }


    
}