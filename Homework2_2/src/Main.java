public class Main {
    public static void main(String[] args) {
        WebHelper webHelper = WebHelper.getInstance();
        String webContent = webHelper.getWebSiteContent();
        System.out.println("Web Content: " + webContent);

        // Dacă încercăm să obținem conținutul din nou, nu va fi încărcat din nou deoarece am utilizat singleton pattern
        String webContentAgain = webHelper.getWebSiteContent();
        System.out.println("Web Content Again: " + webContentAgain);
    }
}
