package ua.ithillel.javapro.task4.Subtask2;

public class Cat implements Participant {
    private int maxRunDistance;
    private int maxJumpHeight;
    private String name;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    @Override
    public boolean run(int distance) {
        return maxRunDistance >= distance;
    }
    @Override
    public boolean jump(int height) {
        return maxJumpHeight >= height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

}
