package inheritance;

public class Grandparent {
    String grand = "vanaja"; // Move this line above

    void displayGrandparent() {
        System.out.println("Grandparent: " + grand); // Now it can access the variable
    }
}
