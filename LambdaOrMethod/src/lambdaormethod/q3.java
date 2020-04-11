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
public class q3 {
    
    @FunctionalInterface
    interface Operation { 
        void test(); 
    }
    public static void main(String[] args) {
        Operation operation1 = () -> System.out.println("Welcoms To Labda !!! ... ");
        operation1.test();
        
        
    }
    
}
