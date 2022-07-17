package katalogs;

import org.junit.Test;
import katalogs.ChristmasLights;

public class ChristmasLightsTest {
    /**
     * start turning off the lights and check what lights are turned on
     */

    @Test
    public void checklightsTurnedon() {
        ChristmasLights clights = new ChristmasLights();
        clights.ChristmasLights(1000,1000);

        int startx1 = 887;
        int starty1 =9 ;
        int startx2 = 959;
        int starty2= 629;


        clights.switchlights(startx1,starty1,  startx2,  starty2 , "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(454,398,  844,448 , "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(539,243  ,559,965 , "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(370,819 ,676,868 , "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(145,40 ,370,997 , "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(301,3 ,808,453, "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(351,678 ,951,908, "turn on" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(720,196,897,994, "toggle" );
        System.out.println(clights.checkTurnedOnLights());

        clights.switchlights(831,394 ,904,860, "toggle" );
        System.out.println(clights.checkTurnedOnLights());



    }

}
