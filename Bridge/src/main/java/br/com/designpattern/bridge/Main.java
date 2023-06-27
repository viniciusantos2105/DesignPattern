package br.com.designpattern.bridge;

import br.com.designpattern.bridge.platforms.Facebook;
import br.com.designpattern.bridge.platforms.IPlatform;
import br.com.designpattern.bridge.platforms.TwitchTV;
import br.com.designpattern.bridge.platforms.YouTube;
import br.com.designpattern.bridge.transmissions.AdvancedLive;
import br.com.designpattern.bridge.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new TwitchTV());
        /*startLive(new YouTube());
        startLive(new Facebook());
        */
    }
         

    public static void startLive(IPlatform platform){
        /*System.out.println("Aguarde...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
        */
        System.out.println("Transmissçao avançada... aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }

}