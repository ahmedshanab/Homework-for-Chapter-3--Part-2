/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaormethod;

import java.util.Scanner;
import java.util.function.Consumer;
//import static javax.management.Query.value;

/**
 *
 * @author LENOVO
 */
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        Consumer<Integer> test = (value) -> System.out.println(value);
        test.accept(input);

        //solution2
        System.out.println("Ans Solution 2 ----------");
        Operation<Integer> operation1 = (value) -> System.out.printf("%d ", value);
        operation1.testMethod(5);

    }
;

}
    @FunctionalInterface
interface Operation<T> {

    void testMethod(int s);
}
