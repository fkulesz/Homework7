package task1;

public class Main {
    public static void main(String[] args) {
        TabGenerator generator = new TabGenerator();
        int[] newTab = generator.generateTab();
        TabGenerator.checkIfTabIsPalindrom(newTab);
    }

}
