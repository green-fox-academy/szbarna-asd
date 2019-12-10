package Strings;

public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        String fixedUrl = url.replace("bots" , "odds");
        fixedUrl = fixedUrl.replace("s/" , "s:/"); //replacement
        System.out.println(fixedUrl);

        String fixedUrl2 = "https:" + url.substring(5, url.length() - 4) + "odds"; // substring az adott
        System.out.println(fixedUrl2);                                              //stringben az 5. indextől a sor végétől
    }                                                                               // számított 4. indexig printel
}
