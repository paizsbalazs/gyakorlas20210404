package gy;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String s, Character c) {

        if (!"01x".contains(c.toString())) {
            throw new IllegalArgumentException();
        }

        Path path = Path.of("C:/gyakorlas20210404/"+s);

            int result = 0;

            String csszoveg = c.toString();

            try (BufferedReader br = Files.newBufferedReader(path)) {
                result = processFile(br, c);
            } catch (IOException ioe) {
                throw new IllegalStateException("Can't find file.", ioe);
            }

        return result;
    }

    public int processFile(BufferedReader br, Character c) {

        int result = 0;

        try { String line = "";
            while ((line = br.readLine()) != null)
            {   int rresult = processRow(line, c);
                result = result + rresult ; }
        } catch (IOException e) {
            throw new IllegalArgumentException("File read error");
        }

        return result;
    }

    public int processRow(String s, Character character) {
        int result = 0;

        for (Character d: s.toCharArray()) {
            if (d==character) {
                result += 1;
            }
        }

        return result;
    }
}
