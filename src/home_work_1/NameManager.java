package home_work_1;

import java.util.Objects;
import java.util.Scanner;

// TestCase_1 ____________________________________________________________
class TestCase_1 {

    public static void main(String[] args) {

        NameManager obj = new NameManager();
        String currentName = obj.getName();

        if (Objects.equals(currentName, obj.nameVasily)) {
            System.out.println(obj.firstTextVersion);
            System.out.println(obj.secondTextVersion);
        }

        if (Objects.equals(currentName, obj.nameAnastasia)) {
            System.out.println(obj.secondTextVersion);
        }

        if (!Objects.equals(currentName, obj.nameVasily) && !Objects.equals(currentName, obj.nameAnastasia)) {
            System.out.println(obj.thirdTextVersion);
        }
    }
}

// TestCase_2 ____________________________________________________________
class TestCase_2 {

    public static void main(String[] args) {

        NameManager obj = new NameManager();
        String currentName = obj.getName();

        if (Objects.equals(currentName, obj.nameVasily)) {
            System.out.println(obj.firstTextVersion);
            System.out.println(obj.secondTextVersion);
        } else if (Objects.equals(currentName, obj.nameAnastasia)) {
            System.out.println(obj.secondTextVersion);
        } else {
            System.out.println(obj.thirdTextVersion);
        }
    }
}

// TestCase_3 ____________________________________________________________
class TestCase_3 {

    public static void main(String[] args) {

        NameManager obj = new NameManager();
        String currentName = obj.getName();

        switch (currentName) {
            case NameManager.nameVasily:
                System.out.println(obj.firstTextVersion);
                System.out.println(obj.secondTextVersion);
                break;
            case NameManager.nameAnastasia:
                System.out.println(obj.secondTextVersion);
                break;
            default:
                System.out.println(obj.thirdTextVersion);
                break;
        }
    }
}

class NameManager {

    static final public String nameVasily           = "Василий";
    static final public String nameAnastasia        = "Анастасия";
    static final public String firstTextVersion     = "Привет";
    static final public String secondTextVersion    = "Я тебя так долго ждал";
    static final public String thirdTextVersion     = "Добрый день, а вы кто?";

    static String currentValidName = "";

    static boolean isValidName = false;

    public String getName() {

        System.out.println("Please enter your name...");

        while (!isValidName) {
            Scanner scannerValue = new Scanner(System.in);
            isValidName = checkValidData(scannerValue);
        }
        return currentValidName;
    }

    private static boolean checkValidData(Scanner scannerValue) {
        // Check Int Number
        if (scannerValue.hasNextInt()) {
            System.out.println("ERROR! You've entered NUMBER");
            return false;
        }
        // Check Double Number
        else if (scannerValue.hasNextDouble()) {
            System.out.println("ERROR! You've entered NUMBER");
            return false;
        }
        // Check Valid Names
        else if (scannerValue.hasNextLine()) {
            return checkValidName(scannerValue.nextLine());
        }
        else {
            return false;
        }
    }

    private static boolean checkValidName(String currentName) {

        if (currentName.length() > 1) {

            if (currentName.contentEquals(nameVasily) || currentName.contentEquals(nameAnastasia)) {
//                System.out.println(("Correct Name! - ") + currentName);
                currentValidName = currentName;
                return true;
            }

            // Check If Valid Name You Spelled in Lower Case
            else if (currentName.equals(nameVasily.toLowerCase()) || currentName.equals(nameAnastasia.toLowerCase())) {
                System.out.println("You spelled your name '" + currentName + "' in lower case");
                return false;
            } else {
//                System.out.println("You've entered other NAME");
                currentValidName = currentName;
                return true;
            }
        } else {
            System.out.println("Please, enter your name");
            return false;
        }
    }
}
