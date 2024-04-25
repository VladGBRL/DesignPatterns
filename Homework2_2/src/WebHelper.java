import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebHelper {
    private static WebHelper instance;
    private String webContent;
    private final String url = "https://www.youtube.com"; // URL-ul paginii web

    // Constructorul privat împiedică crearea de instanțe directe
    private WebHelper() {}

    // Metoda pentru a obține instanța singleton
    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    // Metoda pentru a obține conținutul paginii web
    public String getWebSiteContent() {
        if (webContent == null) {
            // Încarcă conținutul paginii web doar dacă nu a fost încă încărcat
            try {
                webContent = fetchWebContent();
            } catch (IOException e) {
                e.printStackTrace();
                return "Error: Failed to fetch web content";
            }
        }
        return webContent;
    }

    // Metoda pentru a încărca conținutul paginii web de la URL
    private String fetchWebContent() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        URL url = new URL(this.url);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
            }
        }
        return contentBuilder.toString();
    }
}
