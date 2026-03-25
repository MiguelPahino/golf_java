package edu.teamrocket.golfstrokes;

class Player {

    private final String initials;
    private Byte handicap;
    private Short score = 0;
    private Short points = 0;

    Player (String name, Byte strokes){
        this.initials = name;
        this.handicap = strokes;
    }

    public String getInitials() {
        return this.initials;
    }

    public Byte getHandicap() {
        return this.handicap;
    }

    public Short getScore() {
        return this.score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Short getPoints() {
        return this.points;
    }

    public void setPoints(Short points) {
        this.points = points;
    }

    @Override
    public String toString(){
        return "\n" + this.initials + "\s--->" + "\sH'cap:\s" + this.handicap 
        + "\tStrokes:\s" + this.getScore() + "\sPoints\s" + this.getPoints();
    }
}