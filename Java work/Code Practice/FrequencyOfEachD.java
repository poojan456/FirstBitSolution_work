public class FrequencyOfEachD {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 };
        int n = nums.length;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(nums[i] + " " + count);
        }

    }

}
