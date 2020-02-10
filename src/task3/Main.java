package task3;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
    int numberOfLevels = userInput.getInfoFromUser();
    Tree.generateTree(numberOfLevels);
    }
}
