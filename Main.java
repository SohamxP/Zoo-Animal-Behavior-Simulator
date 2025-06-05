import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        int menuChoice;

        // Create single instances of animals to persist data
        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : Tiger");
                        menuChoice = animalDetailsManipulationMenu(keyboard, tiger);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Set weight: ");
                                tiger.setWeight(keyboard.nextInt());
                                System.out.print("Set height: ");
                                tiger.setHeight(keyboard.nextInt());
                                System.out.print("Set age: ");
                                tiger.setAge(keyboard.nextInt());
                                System.out.print("Set number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.print("Set speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                System.out.print("Set sound level of roar: ");
                                tiger.setSoundLevel(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Name: " + tiger.getNameOfAnimal());
                                System.out.println("Weight: " + tiger.getWeight());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Sound Level: " + tiger.getSoundLevel());
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? (1: Yes / 2: No)");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2:
                    do {
                        System.out.println("The animal which is chosen is : Dolphin");
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Set weight: ");
                                dolphin.setWeight(keyboard.nextInt());
                                System.out.print("Set height: ");
                                dolphin.setHeight(keyboard.nextInt());
                                System.out.print("Set age: ");
                                dolphin.setAge(keyboard.nextInt());
                                System.out.print("Set color: ");
                                keyboard.nextLine();
                                dolphin.setColor(keyboard.nextLine());
                                System.out.print("Set swimming speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Name: " + dolphin.getNameOfAnimal());
                                System.out.println("Weight: " + dolphin.getWeight());
                                System.out.println("Height: " + dolphin.getHeight());
                                System.out.println("Age: " + dolphin.getAge());
                                System.out.println("Color: " + dolphin.getColor());
                                System.out.println("Swimming Speed: " + dolphin.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? (1: Yes / 2: No)");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    do {
                        System.out.println("The animal which is chosen is : Penguin");
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguin);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Set weight: ");
                                penguin.setWeight(keyboard.nextInt());
                                System.out.print("Set height: ");
                                penguin.setHeight(keyboard.nextInt());
                                System.out.print("Set age: ");
                                penguin.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // Clear buffer
                                System.out.print("Set feather color: ");
                                penguin.setFeatherColor(keyboard.nextLine());
                                System.out.print("Set swim speed: ");
                                penguin.setSwimSpeed(keyboard.nextInt());
                                System.out.print("Is the penguin swimming (true/false): ");
                                penguin.setSwimming(keyboard.nextBoolean());
                                break;
                            case 2:
                                System.out.println("Age: " + penguin.getAge());
                                System.out.println("Height: " + penguin.getHeight());
                                System.out.println("Weight: " + penguin.getWeight());
                                System.out.println("Walking Speed: 5 (default)");
                                System.out.println("Swimming Speed: " + penguin.getSwimSpeed());
                                break;
                            case 3:
                                if (penguin.isSwimming()) {
                                    penguin.swimming();
                                } else {
                                    penguin.walking();
                                }
                                break;
                            case 4:
                                penguin.eatingFood();
                                penguin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal? (1: Yes / 2: No)");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (1: Yes / 2: No):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal:");
        return keyboard.nextInt();
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("Enter choice (1-4):");
        return keyboard.nextInt();
    }
}
