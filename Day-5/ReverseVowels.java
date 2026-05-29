public class ReverseVowels {
    //check its vowel or not
    public static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(ch) != -1) {
            return true;
        }else{
            return false;
        }
    }

    //reverse vowels in string
    public static String reverse(String str){
        char arr[] = str.toCharArray();
        int lp = 0; int rp = arr.length-1;
        while (lp < rp) {
            while (lp < rp && !isVowel(arr[lp])) {
                lp++;
            }
            while (lp < rp && !isVowel(arr[rp])) {
                rp--;
            }
            //swap
            char temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;

            lp++;
            rp--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "IceCreAm";
        String str2 = "LeetCode";
        System.out.println(reverse(str));
        System.out.println(isVowel('a'));
    }
}