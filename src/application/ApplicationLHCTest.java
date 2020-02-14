package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ApplicationLHCTest {
    public static void main(String[] args) {

        // Static Test of LHC

        Queue<String> trap1 = getTrapQueue(1);

        Queue<String> trap2 = getTrapQueue(2);

        List<String> blocks = collision(trap1, trap2);

        System.out.println(blocks.size());

        System.out.println(blocks.size());

        for (String block : blocks) {
            // System.out.println(block);
            int position = knuthmorrisprattsearch(block, "higgs");

            if (position != -1) {
                System.out.println("FOUND higgs boson");
            } else {
                //System.out.println("not found");
            }
        }

    }

    private static int knuthmorrisprattsearch(String text, String pattern) {
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

    public static int[] computeFail(String pattern) {
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

    public static int search(String text, String pattern) {
        return boyermooresearch(text, pattern);
    }

    private static int boyermooresearch(String text, String pattern) {
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

    private static int[] buildLast(String pattern) {
        int[] last = new int[128];

        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }

        for (int i = 0; i < pattern.length(); i++) {
            last[pattern.charAt(i)] = i;
        }

        return last;
    }

    public static LinkedList<String> collision(Queue<String> trap1, Queue<String> trap2) {
        String proton1 = trap1.element();
        String proton2 = trap2.element();

        LinkedList<String> blocks = new LinkedList<String>();

        for (int i = 0; i < 200000; i=i+5) {
            String part1 = proton1.substring(i, i+5);
            String part2 = proton2.substring(i, i+5);

            String block = part1 + part2;

            blocks.add(block);
        }

        return blocks;
    }

    public static Queue<String> getTrapQueue(int type) {
        int proton = 1;

        if (type == 2) {
            proton = 2;
        }

        Queue<String> trap = new LinkedList<String>();

        for (int id = proton; id <= 50; id+=2) {
            String sId = id < 10 ? String.valueOf("0" + id) : String.valueOf(id);
            String path = "data//proton_" + sId + ".txt";

            System.out.println(path);

            trap.add(readProtonStructure(path));

            //System.out.println("Length: " + readProtonStructure(path).length());
        }

        return trap;
    }

    public static String readProtonStructure(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
