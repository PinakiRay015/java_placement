package leetcodeContest;
public class leetcode2 {
    public int minimumOperations(String word) {
        int operations = 0;
        int n = word.length();

        for (int i = 1; i < n; i++) {
            char current = word.charAt(i);
            char prev = word.charAt(i - 1);

            if (current == prev || Math.abs(current - prev) == 1) {
                operations++;
                i++; // Skip the next character, as we have already handled it in the current operation
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        leetcode2 solution = new leetcode2();
        String word = "abacaba";
        int result = solution.minimumOperations(word);
        System.out.println(result); // Output: 1
    }
}

