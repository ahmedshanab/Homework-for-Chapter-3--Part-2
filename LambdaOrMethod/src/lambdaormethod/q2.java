/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaormethod;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author LENOVO
 */
class q2 {
     public String text(String s1 ){
        return s1.toUpperCase();
        
    } 
    public static void main(String[] args) {
        /* q2 l1 = new q2();
         System.out.println(" ");
         System.out.println(l1.text("ahmed Shanab"));*/
        
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
         
        Function<String,String> test = String::toUpperCase;
        System.out.println(test.apply(input));
         
    }
    
}
