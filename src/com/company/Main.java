package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = {2, 4, 9, 6, 7, 0, 5}; //works only for even number of elements?
        int[] b = alternate(a);
        for (int n : b)
            System.out.print(n + " ");
    }

    static int[] alternate (int[] a)
    {
        //alternating array: first, last, second, second last, etc
        int[] b = new int [a.length];
        for (int i = 1, j = 0; i < a.length; i = i + 2, j++)
        {
            b [i - 1] = a [j]; //even values of b[] are a[] counting up
            b [i] = a [a.length - 1 - j]; //odd values of b[] are a[] counting down
        }
        return b;
    }
}
