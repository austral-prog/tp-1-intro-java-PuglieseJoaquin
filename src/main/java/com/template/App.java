package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int sumador = a + b;
        return sumador;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        boolean paridad;
        if(number%2 == 0){
            paridad = true;
        }else {
            paridad = false;
        }
        return paridad;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        int maxNum;
        if(a>b) {
            maxNum = a;
        }else{
            maxNum = b;
        }
        return maxNum;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        return factorial;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int longitud = input.length();
        return longitud;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String reverse = "";
        for(int i = input.length()-1; i>= 0; i--){
            reverse += input.charAt(i); // Capturamos el caracter que esta en ese Indice
        }
        return reverse;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        boolean prime = true;
        for(int i=2; i<number; i++ ){
            if(number%i == 0){
                prime = false;
            }
        }
        return prime;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int smallElem = array[0];
        for(int i=0; i<array.length;i++)
            if(smallElem > array[i]){
                smallElem = array[i];
            }
        return smallElem;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sumador = 0;
        for(int i=0; i<array.length; i++){
            sumador += array[i];
        }
        return sumador;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = 0.0;
        fahrenheit = (celsius * 9)/5 + 32;
        return fahrenheit;
    }
}
