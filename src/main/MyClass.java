/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class MyClass
{
    public static void main(String[] args)
    {
        int[] array = new int[3];
        try
        {
            array[7] = 3;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds!");
        }
        finally
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}