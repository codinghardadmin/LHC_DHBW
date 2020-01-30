public class KnuthMorrisPratt {
    public static void main(String... args) {
        KnuthMorrisPratt knuthMorrisPratt = new KnuthMorrisPratt();

        String text = "1ado3cqcsov53ufyqwf9m447nozdumn9n3xgti51mahpbfyeddzdd74gavjia1wm8q3npxrlmhx5jqrkfo569vbvw6uw1ywn7azvii2phlfp33v503r3e8mq7javab82dgtb2l1fq6iq68acjwdu4xh33vmq0ggqbf8eiudsh4b0i1aqbd6p5d37ki0mubh506";
        String pattern = "java";

        System.out.println("text    : " + text);
        System.out.println("pattern : " + pattern);
        int position = knuthMorrisPratt._search(text, pattern);

        if (position == -1) {
            System.out.println("pattern not found");
        } else {
            System.out.println("pattern found at position : " + position);
        }
    }
    
    private static KnuthMorrisPratt instance = new KnuthMorrisPratt();
    
    public static KnuthMorrisPratt getInstance() {
    	return instance;
    }
    
    public Port port;
    
    public class Port implements IStringMatching {

		@Override
		public int search(String text, String pattern) {
			return _search(text, pattern);
		}
    	
    }
    
    private KnuthMorrisPratt() {
    	port = new Port();
    }

    public int _search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] fail = computeFail(pattern);
        int i = 0;
        int j = 0;

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                if (j == m - 1) {
                    return i - m + 1; // match
                }
                i++;
                j++;
            } else if (j > 0) {
                j = fail[j - 1];
            } else
                i++;
        }

        return -1;
    }

    public int[] computeFail(String pattern) {
        int[] fail = new int[pattern.length()];
        fail[0] = 0;
        int m = pattern.length();
        int j = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(j) == pattern.charAt(i)) {
                fail[i] = j + 1;
                i++;
                j++;
            } else if (j > 0) {
                j = fail[j - 1];
            } else {
                fail[i] = 0;
                i++;
            }
        }

        return fail;
    }
}