package ua.ithillel.javapro.task4.Subtask2;

public class RunningTrack implements Obstacle {
    private String name;
    private int length;

    public RunningTrack(String name, int length) {
        this.name = name;
        this.length = length;
    }


    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(length)) {
            System.out.printf("%s пройшов перешкоду %s на дистанції %d м.\n", participant.getName(), name, length);
            return true;
        } else {
            System.out.printf("%s не пройшов перешкоду %s на дистанції %d м. Пройдено %d м \n", participant.getName(), name, length, participant.getMaxRunDistance());
            return false;
        }
    }
}
