/*
problem : Extract text inside VALID matching HTML-like tags

🔹 What the problem wants (plain English)
For each input line:
1.Find matching opening and closing tags
2.Extract only the text inside them
3.Tags must:
1.Have the same name
2.Be properly closed
4.If nothing valid is found → print None*/

import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String line = in.nextLine();

            boolean found = false;

            Pattern p = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);

            while (m.find()) {
                System.out.println(m.group(1));
                System.out.println(m.group(2));
                
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        in.close();
    }
}
