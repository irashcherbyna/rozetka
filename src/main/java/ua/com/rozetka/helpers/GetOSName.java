package ua.com.rozetka.helpers;

public class GetOSName {

    public static String getChromeDriverPath() {
        String path = null;
        if(isWindows()){
            path = LoadProperties.getProperty("chrome_windows");
        }else if(isMac()){
            path =  LoadProperties.getProperty("chrome_mac");
        }else if(isUnix ()) {
            path = LoadProperties.getProperty("chrome_unix");
        }
        return path;
    }

    public static boolean isWindows(){
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf( "win" ) >= 0);
    }

    public static boolean isMac(){
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf( "mac" ) >= 0);
    }

    public static boolean isUnix (){
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf( "nix") >=0 || os.indexOf( "nux") >=0);
    }
}
