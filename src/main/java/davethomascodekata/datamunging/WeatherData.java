package davethomascodekata.datamunging;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WeatherData {

    public void readWeatherData() {
        String[] lines = null;
       File test =  new File("/src/resources/weather.dat");

        try {
            lines = Files.readAllLines(new File("/src/resources/weather.dat").toPath()).toArray(new String[0]);
        } catch (IOException e) {
            System.out.println("Unable to find the file");
            e.printStackTrace();
        }
        for(String line: lines) {
            System.out.println(lines);
        }
    }

    public static void main(String[] args) {
        WeatherData reader = new WeatherData();
        reader.readWeatherData();
    }
}
