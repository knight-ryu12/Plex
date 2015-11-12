package Plex;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

/**
 * Created by kuroma on 15/11/12.
 */
// Danny, Don't forget to extend ListenerAdapter before making Listener XD
public class CommandListener extends ListenerAdapter {
    @Override
    public void onMessage(MessageEvent event) throws Exception {
        //command here.
        if (event.getMessage().startsWith("?helloworld")) {
            event.respond("Hello World!");
        }
        // Example thin
    }
}
