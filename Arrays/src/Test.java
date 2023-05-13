public class Test {
    public static void main(String[] args) {
        System.out.println(getPalindromesCount("227596693"));
    }
    public static int getPalindromesCount(String s) {
        // ensure the input constraints are satisfied
        assert 5 <= s.length() && s.length() <= Math.pow(10,5);
        assert s.chars().allMatch(x -> x == '0' || x == '1');

        // initialize variables
        int n = s.length();
        int[] pre_cnt = new int[4];
        int[] suf_cnt = new int[4];
        int[] cnt = new int[2];
        int[] cnt_so_far = new int[2];
        int[] s_arr = new int[n];
        int mod = (int) (Math.pow(10, 9) + 7);
        int ans = 0;

        for (int j = 0; j < n; j++) {
            s_arr[j] = s.charAt(j) == '0' ? 0 : 1;
        }

        for (int j = 0; j < n; j++) {
            suf_cnt[s_arr[j]] += cnt[0];
            suf_cnt[2 + s_arr[j]] += cnt[1];
            cnt[s_arr[j]] += 1;
        }

        for (int j = 0; j < n; j++) {
            cnt[s_arr[j]] -= 1;
            suf_cnt[2 * s_arr[j]] -= cnt[0];
            suf_cnt[2 * s_arr[j] + 1] -= cnt[1];

            ans += pre_cnt[0] * suf_cnt[0]; // "00" and "00"
            ans += pre_cnt[1] * suf_cnt[2]; // "01" and "10"
            ans += pre_cnt[2] * suf_cnt[1]; // "10" and "01"
            ans += pre_cnt[3] * suf_cnt[3]; // "11" and "11"
            ans %= mod;

            pre_cnt[s_arr[j]] += cnt_so_far[0];
            pre_cnt[2 + s_arr[j]] += cnt_so_far[1];
            cnt_so_far[s_arr[j]] += 1;
        }

        return ans;
    }
}
