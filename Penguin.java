public class Penguin extends Animal implements Walk, Swim {
    private int walkSpeed;
    private int swimSpeed;
    private boolean isSwimming;
    private String featherColor;

    public Penguin() {
        setNameOfAnimal("Penguin");
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    @Override
    public void eatingFood() {
        System.out.println("The Penguin is eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The Penguin has finished eating fish.");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed);
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed);
    }

    public void displayMovement() {
        if (isSwimming) {
            swimming();
        } else {
            walking();
        }
    }

    public void displayProperties() {
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Walking Speed: " + walkSpeed);
        System.out.println("Swimming Speed: " + swimSpeed);
    }
}
