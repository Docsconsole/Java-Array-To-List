package docsconsole;

import java.util.Objects;

public class StringHashCodeExample {
    public static void main(String[] args) {
        String string = "docsconsole";
        System.out.println(string.hashCode()); // 1317198524
        String string1 = "docsconsole.com";
        System.out.println(string1.hashCode()); // 1207273295
    }
}
