package com.gradle.code;

public class RoomServiceImp implements RoomService {

    @Override
    public void addMediaToRoom(Project project, int floorLevel, int roomId, String input){
        project.floors.get(floorLevel).getRoom(roomId).media.add(input);
    }

    @Override
    public void removeMediaFromRoom(Project project, int floorLevel, int roomId, String input){
        project.floors.get(floorLevel).getRoom(roomId).media.remove(input);
    }

}
