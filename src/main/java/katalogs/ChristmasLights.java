package katalogs;

import java.util.Arrays;

public class ChristmasLights {

     int start_x1;
     int start_y1;
     int end_x1;
     int end_y1;
     int lights[][];

    public void ChristmasLights(int x1, int y1) {
         lights = new int [x1][y1];
         start_x1 = 0;
         start_y1 = 0;
         end_x1 = x1;
         end_y1 = y1;

         for(int position_x = start_x1;position_x<end_x1;position_x++){
             for(int position_y = start_y1;position_y<
                     end_y1;position_y++){
                lights [position_x][position_y] = 0 ;
             }
         }
    }

    public int checkTurnedOnLights() {
       int turnedon_lights_count =0;
        for(int position_x= start_x1;position_x<end_x1;position_x++) {
           for (int position_y = start_y1;position_y<end_y1;position_y++) {
               turnedon_lights_count += lights[position_x][position_y];
           }
       }
        return turnedon_lights_count;
    }

    public void switchlights(int start_x1, int start_y1, int end_x1, int end_y1, String state) {
     int increment =2;
        if(state == "turn on") {
         increment =1;
     }

        for ( int position_x= start_x1;position_x<end_x1;position_x++) {
         for (int position_y = start_y1;position_y<end_y1;position_y++){
              lights[position_x][position_y] += increment;
         }
     }
    }


}
