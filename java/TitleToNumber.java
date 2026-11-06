public class TitleToNumber {

    static int titleToNumber(String columnTitle) {
        int result = 0;

        for (char ch : columnTitle.toCharArray()) {
            // shift previous letters one place left (base 26), add this letter's value A=1..Z=26
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));   // 1
        System.out.println(titleToNumber("AB"));  // 28
        System.out.println(titleToNumber("ZY"));  // 701
    }
}
