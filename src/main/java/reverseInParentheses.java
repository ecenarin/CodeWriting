public class reverseInParentheses {
    public static void main(String[] args) {

        System.out.println(solution("ece(alper)narin(asya(ararat))"));
    }

    static String solution(String inputString) {

        StringBuilder newString = new StringBuilder(inputString);
        String result = inputString;
        int indexOpen = -1;
        int indexClose = -1;

        while (result.contains("(") || result.contains(")")) {
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == '(') {
                    indexOpen = i;
                }
                if (result.charAt(i) == ')') {
                    indexClose = i;
                }
                if (indexOpen != -1 && indexClose != -1) {
                    int countTemp = 1;

                    for (int j = indexOpen+1; j < indexClose; j++) {
                        newString.setCharAt(indexClose-countTemp, result.charAt(j));
                        countTemp++;
                    }
                    newString.setCharAt(indexOpen, '.');
                    newString.setCharAt(indexClose, '.');
                    result = newString.toString();
                    indexOpen = -1;
                    indexClose = -1;
                    System.out.println(result);
                    i = 0;
                }
            }
        }
        result = result.replace(".", "");
        return result;
    }
}
