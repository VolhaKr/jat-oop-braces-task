package org.example.epam.volha.jat.classloaders;

  public class Test {

    public static void main(String[] args) {
      int aNumber=5;

      if (aNumber >= 0) {
        if (aNumber == 0) {
          System.out.println("first string");
        } else {
          System.out.println("second string");
        }
      }
      System.out.println("third string");
    }
  }
