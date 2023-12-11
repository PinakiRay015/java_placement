package leetcodeContest;

public class leetcode1 {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        int commonCount1 = 0;
        int commonCount2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    commonCount1++;
                    break;
                }
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[j] == nums1[i]) {
                    commonCount2++;
                    break;
                }
            }
        }

        System.out.println("[" + commonCount1 + "," + commonCount2 + "]");
    }
}
