package edu.teamrocket.golfstrokes;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.Bytes;

class Course {
    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    Course(){};

    void addPlayerCourse(Player player,Byte[] playerCourse){
        Byte holeNumber = 0;
        for (Byte holeStroke : playerCourse){
            this.playersCourse.put(player.getInitials(),holeNumber++,holeStroke);
        }

    }

    byte[] getPlayerCourse(Player player){
        return Bytes.toArray(this.playersCourse.row(player.getInitials()).values());
    }    
}
