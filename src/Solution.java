import java.util.Arrays;

class Solution {
        public static void main(String[] args) {
            int [] nums = {2,5,8,7,8,7,4};
            int target = 10;
            Solution add = new Solution();
            int[] ints = add.twoSum(nums, target);
            String string = Arrays.toString(ints);
            System.out.println(string);
        }

        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }

