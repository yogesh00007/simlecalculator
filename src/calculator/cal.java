/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Yogesh
 */
public class cal  implements calimpl{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int substracts(int a, int b) {
        return a-b;
        
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }

    @Override
    public int multiplication(int a, int b) {
        
    return a*b;
            }
    
}
