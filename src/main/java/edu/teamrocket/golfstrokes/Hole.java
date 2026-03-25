package edu.teamrocket.golfstrokes;

class Hole {

    private Byte number;
    private Byte par;

    Hole(Byte number, Byte par) {
        this.number = number;
        this.par = par;
    }

    Byte getNumber() {
        return this.number;
    }

    Byte getPar() {
        return this.par;
    }

    @Override
    public String toString(){
        return new StringBuilder()
        .append("\s\s\s")
        .append(this.getNumber())
        .append(" - ")
        .append(this.getPar())
        .toString();
    }


} 