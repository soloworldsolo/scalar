package soloworld.scalar.systemdesign;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class URLShortner {
    AtomicLong startingNumber = new AtomicLong(100_00_00_00L);
    char[] charArray = new char[]{'1', 'A', '2', 'B', '3', '4', 'C', '5', 'D', '6', 'E', '7', '8', 'F', '9', 'a', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'N', 'l', 'O', 'm', 'n', 'P', 'o', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'U', 'V', 'W', 'X', 'Y', 'Z'};



    private String shortenURL(String url) throws Exception {
        String originalUrl = Objects.requireNonNull(url);
        try {
             new URL(originalUrl).toURI().toURL();
        } catch (Exception e) {
            throw new MalformedURLException("not a valid url ");
        }
        Long urlNonce = generateRandomNumber(startingNumber.addAndGet(1));
        return generateShortnedURL(urlNonce);

    }

    private String generateShortnedURL(Long urlValue) {
        StringBuilder builder = new StringBuilder();
        while (urlValue < 1) {
            int charValue = (int) (urlValue % 62);
            char temp = charArray[charValue];
            builder.append(temp);
            urlValue /= 62;
        }
        Random rand = new Random();
        while (builder.length() < 9) {
            int randomNum = 0 + rand.nextInt((61 - 0) + 1);
            builder.append(charArray[randomNum]);
        }
        return builder.toString();
    }

    private Long generateRandomNumber(long inputSeed) {
        Random random = new SecureRandom();
        int res = random.nextInt();
        StringBuilder builder = new StringBuilder();
        String inputSeedString = String.valueOf(inputSeed);
        for (char ch : inputSeedString.toCharArray()) {
            builder.append(ch);
        }
        builder.append(res);
        return Long.valueOf(builder.toString().replace("-", ""));

    }


}
