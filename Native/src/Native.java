public class Native {
	public static void main(String... args) {
        Native aNative = new Native();

        String text = "1ado3cqcsov53ufyqwf9m447nozdumn9n3xgti51mahpbfyeddzdd74gavjia1wm8q3npxrlmhx5jqrkfo569vbvw6uw1ywn7azvii2phlfp33v503r3e8mq7javab82dgtb2l1fq6iq68acjwdu4xh33vmq0ggqbf8eiudsh4b0i1aqbd6p5d37ki0mubh506";
        String pattern = "java";

        System.out.println("text    : " + text);
        System.out.println("pattern : " + pattern);
        int position = aNative._search(text, pattern);

        if (position == -1) {
            System.out.println("pattern not found");
        } else {
            System.out.println("pattern found at position : " + position);
        }
    }
    
    private static Native instance = new Native();
    
    public static Native getInstance() {
    	return instance;
    }
    
    public Port port;
    
    public class Port implements IStringMatching {

		@Override
		public int search(String text, String pattern) {
			return _search(text, pattern);
		}
    	
    }
    
    private Native() {
    	port = new Port();
    }

    public int _search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int j;

        for (int i = 0; i <= (n - m); i++) {
            j = 0;

            while ((j < m) && (text.charAt(i + j) == pattern.charAt(j))) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}