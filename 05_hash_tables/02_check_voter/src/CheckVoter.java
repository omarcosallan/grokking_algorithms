import java.util.HashMap;
import java.util.Map;

public class CheckVoter {

    private static Map<String, Boolean> voted  = new HashMap<>();

    public static void main(String[] args) {
        checkVoter("tom"); // let them vote!
        checkVoter("mike"); // let them vote!
        checkVoter("mike"); // kick them out!
    }

    private static void checkVoter(String name) {
        if (voted.containsKey(name)) {
            System.out.println("Kick them out!");
        } else {
            voted.put(name, Boolean.TRUE);
            System.out.println("let them vote!");
        }
    }
}