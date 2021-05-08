package org.thoughtcrime.securesms.conversation;

public class CountMessageWords {
    public String Counter(String c) {
        int wordCount = 0;

        for (int i = 0; i < c.length() - 1; i++) {
            if (c.charAt(i) == ' ' && Character.isLetter(c.charAt(i + 1)) && (i > 0)) {
                wordCount++;
            }
        }
        wordCount++;

        return ("Characters: " + c.length() + "\nWords: " + wordCount);
    }
}
