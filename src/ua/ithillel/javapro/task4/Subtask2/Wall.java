package ua.ithillel.javapro.task4.Subtask2;

public class Wall implements Obstacle {
    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public boolean overcome(Participant participant) {
        if (participant.jump(height)) {
            System.out.printf("%s пройшов перешкоду %s на дистанції %d м.\n", participant.getName(), name, height);
            return true;
        } else {
            System.out.printf("%s не пройшов перешкоду %s на дистанції %d м. Пройдено %d м \n", participant.getName(), name, height, participant.getMaxJumpHeight());
            return false;
        }
    }

}
