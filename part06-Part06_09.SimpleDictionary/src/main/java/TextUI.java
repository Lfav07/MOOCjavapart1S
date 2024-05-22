import java.util.Scanner;

public class TextUI {

    private Scanner scanner;

    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }
    public void start() {
        while (true) {
        System.out.print("Command: ");
        String input = scanner.nextLine();
        if (input.equals("end")) {
            System.out.println("Bye bye!");
            break;
        }
        if (input.equals("add")) {
            System.out.print("Word: ");
            String Word2 = scanner.nextLine();
            System.out.print("Translation: ");
            String translation = scanner.nextLine();
            simpleDict.add(Word2, translation);
            continue;
        }
        if (input.equals("search")) {
            System.out.print("To be translated: ");
            String Tobetranslated = scanner.nextLine();
             if (simpleDict.translate(Tobetranslated) == null) {
                System.out.println("Word " + Tobetranslated + " was not found");
            } else {
            System.out.println(simpleDict.translate(Tobetranslated));
            }
            continue; 

        }
        System.out.println("Unknown command");
    
    }
        
    }
    }