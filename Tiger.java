public class Tiger extends Animal implements Walk, Eat {
    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public Tiger() {
        super("Tiger");
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + speed);
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger has finished eating.");
    }
}