public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Your current Java version: " + getVersion());
    }

    // Kommentar von Michi

    public static int getVersion() {
        String version = System.getProperty("java.version");
        if (version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int dot = version.indexOf(".");
            if (dot != -1) {
                version = version.substring(0, dot);
            }
            // Kommentar
            //Kommentar Irini
        }
        return Integer.parseInt(version);
    }
}
