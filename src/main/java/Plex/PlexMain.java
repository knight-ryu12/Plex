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
                .setServerHostname("irc.esper.net")
                .setServer("irc.esper.net", 6697)
                .setSocketFactory(new UtilSSLSocketFactory().trustAllCertificates())
                .addListener(new CommandListener())
                .setLogin() //change it Later
                .setRealName()//Change it Later
                .buildConfiguration();
        PircBotX plex = new PircBotX(conf);
        plex.startBot();
    }
}
