# Zoo Animal Behavior Simulator

## Description

Zoo Animal Behavior Simulator is a Java console application that demonstrates object-oriented design by simulating various animal behaviors such as walking, swimming, and eating. The project uses a modular approach to showcase inheritance, interfaces, and polymorphism in Java.

## Features

* **Object-Oriented Structure:** An abstract `Animal` base class defines common properties (name, age, etc.) and methods. Concrete classes (`Tiger`, `Dolphin`, `Penguin`, etc.) extend `Animal`, demonstrating inheritance.
* **Behavior Interfaces:** The project defines interfaces such as `Walk`, `Swim`, and `Eat` to represent animal behaviors. Classes implement the relevant interfaces to provide specific behavior code for each animal.
* **Polymorphism:** The same method calls on an `Animal` type invoke different implementations at runtime. For example, calling `eat()` on a `Tiger` versus a `Dolphin` object invokes species-specific logic.
* **Console Menu System:** A text-based menu guides the user through actions. Users can create or select an animal, then choose behaviors (Walk, Swim, Eat). The program reads user input and displays results.
* **Real-Time Property Updates:** Each action updates the internal state of the animal (for example, changing its hunger or energy level). The current properties of the animal can be displayed via the menu.
* **Extensible Design:** The clear separation of behaviors into interfaces and the use of inheritance make it easy to add new animal types or behaviors in the future. Adding a new animal class or a new interface requires minimal changes to the existing codebase.

## Technologies Used

* **Java:** A widely-used, platform-independent, object-oriented programming language.

## Setup Instructions

To run the simulator, you need the Java Development Kit (JDK) installed on your machine. The following steps describe how to compile and run the application:

* **Command Line (Terminal):** Navigate to the project root directory and use `javac` to compile the code. For example:

  ```bash
  javac *.java
  java ZooAnimalBehaviorSimulator
  ```

  This compiles all `.java` files and starts the main application. (Replace `ZooAnimalBehaviorSimulator` with your main class name if different.) Ensure your Java `PATH` is configured so that `javac` and `java` are available.

* **Using an IDE (IntelliJ/Eclipse):** Open or import the project in your IDE. Then build and run the project:

  * *IntelliJ IDEA:* Go to **Build > Build Project**, then run the main class (or press **Ctrl+F9** to compile and **Shift+F10** to run).
  * *Eclipse:* Go to **Project > Build Project** (or enable "Build Automatically"), then right-click the main class and select **Run As > Java Application** (or press **Ctrl+F11**).

## Usage

Once the program is running, a console menu appears with options. A typical workflow is:

1. **Create or Select an Animal:** Choose to create a new animal by specifying its species and initial properties (name, age, etc.), or select an existing animal to work with.
2. **Choose an Action:** With an animal selected, choose a behavior from the menu (such as *Walk*, *Swim*, or *Eat*). The corresponding method is invoked on the animal object.
3. **View Animal Properties:** Select the option to display the current state of the selected animal, showing attributes like energy, hunger, or other stats.
4. **Repeat or Exit:** After each action, the menu reappears, allowing you to perform additional operations. Choose "Exit" to end the simulation.

During usage, when an action is performed (for example, "Tiger walks"), the program prints a message like `Tiger is walking...` and updates the tiger’s attributes. This guided menu interface provides clear feedback and an interactive user experience.

## Future Improvements

* **Graphical User Interface (GUI):** Add a Swing or JavaFX interface to make the simulator more user-friendly and visually appealing.
* **Persistence:** Implement file I/O or a database to save and load animal states or zoo configurations.
* **Additional Animals and Behaviors:** Introduce more animal classes (e.g. `Elephant`, `Shark`) and behaviors (e.g. `Sleep`, `Play`), or extend existing behaviors with more complexity.
* **Advanced Simulation:** Add features like time progression, random events, or more detailed health/hunger systems for a more realistic zoo environment.
* **Automated Testing:** Provide unit tests (e.g. using JUnit) for the classes and interfaces to ensure correctness and facilitate future development.
