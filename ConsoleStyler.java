public class ConsoleStyler {
    // Reset
    private static final String RESET = "\033[0m";  // Text Reset
    
    // Regular Colors
    private static final String BLACK = "\033[0;30m";   // BLACK
    private static final String RED = "\033[0;31m";     // RED
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BLUE = "\033[0;34m";    // BLUE
    private static final String PURPLE = "\033[0;35m";  // PURPLE
    private static final String CYAN = "\033[0;36m";    // CYAN
    private static final String WHITE = "\033[0;37m";   // WHITE
    
    // Bold
    private static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    private static final String RED_BOLD = "\033[1;31m";    // RED
    private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    private static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    private static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    private static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    private static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    private static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    
    // Underline
    private static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    private static final String RED_UNDERLINED = "\033[4;31m";    // RED
    private static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    private static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    private static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    private static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    private static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    private static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE
    
    // Background
    private static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    private static final String RED_BACKGROUND = "\033[41m";    // RED
    private static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    private static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    private static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    private static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    private static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    private static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    
    // High Intensity
    private static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    private static final String RED_BRIGHT = "\033[0;91m";    // RED
    private static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    private static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    private static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    private static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    private static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    private static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE
    
    // Bold High Intensity
    private static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    private static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    private static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    private static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    private static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    private static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
    
    // High Intensity backgrounds
    private static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    private static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    private static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    private static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    private static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    private static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    private static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    private static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    // Function to print a message in regular black color
    public static void printBlack(String message) {
        System.out.println(ConsoleStyler.BLACK + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular red color
    public static void printRed(String message) {
        System.out.println(ConsoleStyler.RED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular green color
    public static void printGreen(String message) {
        System.out.println(ConsoleStyler.GREEN + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular yellow color
    public static void printYellow(String message) {
        System.out.println(ConsoleStyler.YELLOW + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular blue color
    public static void printBlue(String message) {
        System.out.println(ConsoleStyler.BLUE + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular purple color
    public static void printPurple(String message) {
        System.out.println(ConsoleStyler.PURPLE + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular cyan color
    public static void printCyan(String message) {
        System.out.println(ConsoleStyler.CYAN + message + ConsoleStyler.RESET);
    }

    // Function to print a message in regular white color
    public static void printWhite(String message) {
        System.out.println(ConsoleStyler.WHITE + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold black color
    public static void printBlackBold(String message) {
        System.out.println(ConsoleStyler.BLACK_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold red color
    public static void printRedBold(String message) {
        System.out.println(ConsoleStyler.RED_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold green color
    public static void printGreenBold(String message) {
        System.out.println(ConsoleStyler.GREEN_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold yellow color
    public static void printYellowBold(String message) {
        System.out.println(ConsoleStyler.YELLOW_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold blue color
    public static void printBlueBold(String message) {
        System.out.println(ConsoleStyler.BLUE_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold purple color
    public static void printPurpleBold(String message) {
        System.out.println(ConsoleStyler.PURPLE_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold cyan color
    public static void printCyanBold(String message) {
        System.out.println(ConsoleStyler.CYAN_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bold white color
    public static void printWhiteBold(String message) {
        System.out.println(ConsoleStyler.WHITE_BOLD + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined black color
    public static void printBlackUnderlined(String message) {
        System.out.println(ConsoleStyler.BLACK_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined red color
    public static void printRedUnderlined(String message) {
        System.out.println(ConsoleStyler.RED_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined green color
    public static void printGreenUnderlined(String message) {
        System.out.println(ConsoleStyler.GREEN_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined yellow color
    public static void printYellowUnderlined(String message) {
        System.out.println(ConsoleStyler.YELLOW_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined blue color
    public static void printBlueUnderlined(String message) {
        System.out.println(ConsoleStyler.BLUE_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined purple color
    public static void printPurpleUnderlined(String message) {
        System.out.println(ConsoleStyler.PURPLE_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined cyan color
    public static void printCyanUnderlined(String message) {
        System.out.println(ConsoleStyler.CYAN_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message in underlined white color
    public static void printWhiteUnderlined(String message) {
        System.out.println(ConsoleStyler.WHITE_UNDERLINED + message + ConsoleStyler.RESET);
    }

    // Function to print a message with black background
    public static void printBlackBackground(String message) {
        System.out.println(ConsoleStyler.BLACK_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with red background
    public static void printRedBackground(String message) {
        System.out.println(ConsoleStyler.RED_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with green background
    public static void printGreenBackground(String message) {
        System.out.println(ConsoleStyler.GREEN_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with yellow background
    public static void printYellowBackground(String message) {
        System.out.println(ConsoleStyler.YELLOW_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with blue background
    public static void printBlueBackground(String message) {
        System.out.println(ConsoleStyler.BLUE_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with purple background
    public static void printPurpleBackground(String message) {
        System.out.println(ConsoleStyler.PURPLE_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with cyan background
    public static void printCyanBackground(String message) {
        System.out.println(ConsoleStyler.CYAN_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message with white background
    public static void printWhiteBackground(String message) {
        System.out.println(ConsoleStyler.WHITE_BACKGROUND + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright black color
    public static void printBlackBright(String message) {
        System.out.println(ConsoleStyler.BLACK_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright red color
    public static void printRedBright(String message) {
        System.out.println(ConsoleStyler.RED_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright green color
    public static void printGreenBright(String message) {
        System.out.println(ConsoleStyler.GREEN_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright yellow color
    public static void printYellowBright(String message) {
        System.out.println(ConsoleStyler.YELLOW_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright blue color
    public static void printBlueBright(String message) {
        System.out.println(ConsoleStyler.BLUE_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright purple color
    public static void printPurpleBright(String message) {
        System.out.println(ConsoleStyler.PURPLE_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright cyan color
    public static void printCyanBright(String message) {
        System.out.println(ConsoleStyler.CYAN_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message in bright white color
    public static void printWhiteBright(String message) {
        System.out.println(ConsoleStyler.WHITE_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright black background
    public static void printBlackBackgroundBright(String message) {
        System.out.println(ConsoleStyler.BLACK_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright red background
    public static void printRedBackgroundBright(String message) {
        System.out.println(ConsoleStyler.RED_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright green background
    public static void printGreenBackgroundBright(String message) {
        System.out.println(ConsoleStyler.GREEN_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright yellow background
    public static void printYellowBackgroundBright(String message) {
        System.out.println(ConsoleStyler.YELLOW_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright blue background
    public static void printBlueBackgroundBright(String message) {
        System.out.println(ConsoleStyler.BLUE_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright purple background
    public static void printPurpleBackgroundBright(String message) {
        System.out.println(ConsoleStyler.PURPLE_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright cyan background
    public static void printCyanBackgroundBright(String message) {
        System.out.println(ConsoleStyler.CYAN_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }

    // Function to print a message with bright white background
    public static void printWhiteBackgroundBright(String message) {
        System.out.println(ConsoleStyler.WHITE_BACKGROUND_BRIGHT + message + ConsoleStyler.RESET);
    }
}

