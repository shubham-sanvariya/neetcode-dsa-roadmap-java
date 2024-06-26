public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String str = "babad";
        Longest_Palindromic_Substring longestPalindromicSubstring = new Longest_Palindromic_Substring();
        longestPalindromicSubstring.longestPalindrome(str);
    }

        int resultStart;
        int resultLength;

        public String longestPalindrome(String s) {
            int strLength = s.length();
            if (strLength < 2) {
                return s;
            }
            for (int start = 0; start < strLength - 1; start++) {
                expandRange(s, start, start);
                expandRange(s, start, start + 1);
            }
            System.out.println(s.substring(resultStart, resultStart + resultLength));
            return s.substring(resultStart, resultStart + resultLength);
        }

        private void expandRange(String str, int begin, int end) {
            while (begin >= 0 && end < str.length() &&
                    str.charAt(begin) == str.charAt(end)) {
                begin--;
                end++;
            }
            if (resultLength < end - begin - 1) {
                resultStart = begin + 1;
                resultLength = end - begin - 1;
            }
        }
}
