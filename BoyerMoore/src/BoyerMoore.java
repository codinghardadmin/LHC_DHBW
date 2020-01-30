public class BoyerMoore {
    public static void main(String... args) {
        BoyerMoore boyerMoore = new BoyerMoore();

        String text = "1ado3cqcsov53ufyqwf9m447nozdumn9n3xgti51mahpbfyeddzdd74gavjia1wm8q3npxrlmhx5jqrkfo569vbvw6uw1ywn7azvii2phlfp33v503r3e8mq7javab82dgtb2l1fq6iq68acjwdu4xh33vmq0ggqbf8eiudsh4b0i1aqbd6p5d37ki0mubh506";
        String pattern = "java";

        System.out.println("text    : " + text);
        System.out.println("pattern : " + pattern);
        int position = boyerMoore._search(text, pattern);

        if (position == -1) {
            System.out.println("pattern not found");
        } else {
            System.out.println("pattern found at position : " + position);
        }
    }
    
    private static BoyerMoore instance = new BoyerMoore();
    
    public static BoyerMoore getInstance() {
    	return instance;
    }
    
    public Port port;
    
    public class Port implements IStringMatching {

		@Override
		public int search(String text, String pattern) {
			return _search(text, pattern);
		}
    	
    }
    
    private BoyerMoore() {
    	port = new Port();
    }

    private int _search(String text, String pattern) {
        int[] last = buildLast(pattern);
        int n = text.length();
        int m = pattern.length();
        int i = m - 1;

        if (i > n - 1) {
            return -1;
        }

        int j = m - 1;

        do {
            if (pattern.charAt(j) == text.charAt(i)) {
                if (j == 0) {
                    return i;
                } else {
                    i--;
                    j--;
                }
            } else {
                int lo = last[text.charAt(i)];
                i = i + m - Math.min(j, 1 + lo);
                j = m - 1;
            }
        } while (i <= n - 1);

        return -1;
    }

    private int[] buildLast(String pattern) {
        int[] last = new int[128];

        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }

        for (int i = 0; i < pattern.length(); i++) {
            last[pattern.charAt(i)] = i;
        }

        return last;
    }
}