class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

        int[] res = new int[nums.length];

        int idx = 0;
        int i = neg.size() - 1;
        int j = 0;

        while (i >= 0 && j < pos.size()) {

            if (Math.abs(neg.get(i)) <= pos.get(j)) {
                res[idx] = neg.get(i) * neg.get(i);
                i--;
            } else {
                res[idx] = pos.get(j) * pos.get(j);
                j++;
            }

            idx++;
        }

        while (i >= 0) {
            res[idx] = neg.get(i) * neg.get(i);
            i--;
            idx++;
        }

        while (j < pos.size()) {
            res[idx] = pos.get(j) * pos.get(j);
            j++;
            idx++;
        }

        return res;
    }
}