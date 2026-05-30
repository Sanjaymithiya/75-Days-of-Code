public class CompressString {
    public static int compress(char[] chars) {
        int write = 0; // index to write compressed result
        int i = 0;     // index to scan input

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count consecutive characters
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write the character
            chars[write++] = current;

            // write the count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // new length of compressed array
    }
 
    public static void main(String[] args) {
        char[] chars1 = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars1)); // Output: 6
        // chars1 becomes: ['a','2','b','2','c','3', ...]

        char[] chars2 = {'a'};
        System.out.println(compress(chars2)); // Output: 1
        // chars2 becomes: ['a']

        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars3)); // Output: 4
        // chars3 becomes: ['a','b','1','2', ...]
    }
}
