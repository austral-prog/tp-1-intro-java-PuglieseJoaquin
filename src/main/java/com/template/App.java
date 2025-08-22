package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    /* OPERACIONES BASICAS */
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

    /* ARRAYS */
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

    /* CONVERSIONES */
    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = 0.0;
        fahrenheit = (celsius * 9)/5 + 32;
        return fahrenheit;
    }

    /* Listas */
    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int sumador = 0;
        for (int i = 0; i < list.size(); i++) {
            sumador += list.get(i);
        }
        return sumador;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {

        // Verificamos si esta vacia
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía o nula");
        }

        int maxNum = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (maxNum < list.get(i)) {
                maxNum = list.get(i);
            }
        }
        return maxNum;
    }
    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> listPares = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                listPares.add(list.get(i));
            }
        }
        return listPares;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> listasConcatenadas = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            listasConcatenadas.add(list1.get(i));
        }
        for (int j = 0; j < list2.size(); j++) {
            listasConcatenadas.add(list2.get(j));
        }
        return listasConcatenadas;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        Boolean contain = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == element){
                contain = true;
            }
        }
        return contain;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> upperList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String palabra = list.get(i);
            String palabraMay = palabra.toUpperCase();
            upperList.add(palabraMay);
        }
        return upperList;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(newList.contains(list.get(i)) == false){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    /* SETS */
    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        Set<Integer> setList = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            setList.add(list.get(i));
        }
        return setList;
    }

    /* MAPS */
    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        Boolean contain = false;
        for (String clave : map.keySet()) {
            if(clave == key){
                contain = true;
            }
        }
        return contain;
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        Boolean contain = false;
        for(String valor : map.values()){
            if(valor == value){
                contain = true;
            }
        }
        return contain;
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        // Recorre un mapa y devuelve una lista de cadenas con el formato "clave -> valor".
        List<String> listaDeClaveValor = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()){
            String valor = entry.getKey() + " -> " + entry.getValue();
            listaDeClaveValor.add(valor);
        }
        return listaDeClaveValor;
    }
}
