package Plex;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.UtilSSLSocketFactory;

/**
 * Created by kuroma on 15/11/12.
 */
public class PlexMain {
    public static void main(String[] args) throws Throwable{
        Configuration conf = new Configuration.Builder()
                .setServer("irc.esper.net", 6697)
                .setName("TestBot")
                .setSocketFactory(new UtilSSLSocketFactory().trustAllCertificates())
                .addListener(new CommandListener())
                .setLogin("PlexTest") //change it Later
                .setRealName("Plex")//Change it Later
                .addAutoJoinChannel("#shinexusuk")
                .buildConfiguration();
        PircBotX plex = new PircBotX(conf);
        plex.startBot();
    }
}
