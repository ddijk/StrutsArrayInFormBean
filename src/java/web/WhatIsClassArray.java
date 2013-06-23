package web;

/**
 *
 * @author DickD
 */
public class WhatIsClassArray
{
  public static void main(String[] args)
  {
    Integer i = Integer.parseInt("3");
    Wrapper w = new Wrapper(i);
    String[] sa = new String[]
    {
      "aap", "noot", "mies"
    };

    System.out.println("int=" + i);
    System.out.println("w=" + w);
    System.out.println("sa=" + sa);
  }
}

class Wrapper
{
  int i;

  Wrapper(int i)
  {
    this.i = i;
  }
}
