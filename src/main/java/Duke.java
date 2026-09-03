public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        commandType = getCommandType(input);
        return "Duke heard: " + input;
    }

    /**
     * Returns the command type used to style Duke's response.
     */
    public String getCommandType() {
        return commandType;
    }

    private String getCommandType(String input) {
        String commandWord = input.strip().split("\\s+", 2)[0].toLowerCase();
        switch (commandWord) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "";
        }
    }
}
