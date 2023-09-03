import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        Map m = new HashMap();
        String str = "Hello my name is Arthur and I am a Java Developer";
        System.out.println(str);
        System.out.println(str.toCharArray());

        for (char x : str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old + 1);
            } else {
                m.put(x, 1);
            }
        }
        m.remove(' ');

        System.out.println(m);

    }

}


