package structural.proxy;

import java.security.SecureRandom;
import java.util.Random;

public class RandomID {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

    private RandomID() {
        throw new IllegalStateException("Utility class");
    }

    public static String exec(int length) {
        StringBuilder buffer = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            buffer.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(buffer);
    }
}
