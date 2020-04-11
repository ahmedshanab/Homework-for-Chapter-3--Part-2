/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdasummarize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author LENOVO
 */
public class Lambdasummarize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Long> LambdaSum;
        try {
            LambdaSum = Files.lines(Paths.get("test.txt"))
                    .parallel().flatMap( (letters) -> Arrays.stream(letters.toLowerCase().split("")))
                    .collect(Collectors.groupingBy((c) -> c, Collectors.counting()));
                   
            
                     System.out.println("character : value ");
                     LambdaSum.forEach((character, value) -> System.out.println("     "+character + "    :  " + value));
        } catch (IOException ex) {
            Logger.getLogger(Lambdasummarize.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
