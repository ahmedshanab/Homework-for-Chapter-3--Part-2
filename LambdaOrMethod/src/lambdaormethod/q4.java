/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaormethod;

/**
 *
 * @author LENOVO
 */
public class q4 {
    @FunctionalInterface
private interface Operation<T> {
    void testMethod(int s);
}
    
    public static void main(String[] args) {
        Operation<Integer> test = value->System.out.printf("%d  ", value );
        test.testMethod(5);
    }
    
}
