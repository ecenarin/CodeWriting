import java.util.HashMap;
import java.util.Iterator;

public class commonCharacterCount {
    int solution(String s1, String s2) {

        int sum = 0;

        HashMap<String, Integer> hm1, hm2;

        hm1 = hashMapper(s1);
        hm2 = hashMapper(s2);

        Iterator<String> it = hm1.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            if (hm2.get(key) != null) {
                sum += Math.min(hm1.get(key), hm2.get(key));
            }
        }

        return sum;
    }

    HashMap<String, Integer> hashMapper(String input) {

        String[] letters = input.split("");

        HashMap<String, Integer> hm = new HashMap<>();

        for (String each : letters) {
            Integer count = hm.get(each);
            if (count == null) {
                hm.put(each, 1);
            } else {
                hm.put(each, count+1);
            }
        }
        return hm;
    }
}
