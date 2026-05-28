public class RemoveStars {
    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '*') {
                // remove last character
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "leet**cod*e";
        System.out.println(removeStars(s1)); // Output: lecoe

        String s2 = "erase*****";
        System.out.println(removeStars(s2)); // Output: ""
    }
}
