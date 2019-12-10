package Strings;

public class ToDo {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String todoP1 = "My todo:\n " + todoText.toString();
        String todoP2 = todoP1 + "  - Download Games";
        String todoP3 = todoP2 + "\n     - Diablo";
        System.out.println(todoP3);
    }
}
