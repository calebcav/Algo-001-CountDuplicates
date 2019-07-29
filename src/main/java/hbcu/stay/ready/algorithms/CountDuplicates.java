package hbcu.stay.ready.algorithms;

import java.util.ArrayList;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){

        ArrayList<String> seenStrings = new ArrayList<String>();

        ArrayList<String> duplicateStrings = new ArrayList<String>();


        for (int i = 0; i < input.length; i ++){
            if (seenStrings.contains(input[i])){
                if(!duplicateStrings.contains(input[i])){
                    duplicateStrings.add(input[i]);
                }
            }
            else{
                seenStrings.add(input[i]);
            }
        }

        return duplicateStrings.size();
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        ArrayList<Integer> seenNumbers = new ArrayList<Integer>();

        ArrayList<Integer> duplicateNumbers = new ArrayList<Integer>();


        for (int i = 0; i < input.length; i ++){
            if (seenNumbers.contains(input[i])){
                if(!duplicateNumbers.contains(input[i])){
                    duplicateNumbers.add(input[i]);
                }
            }
            else{
                seenNumbers.add(input[i]);
            }
        }

        return duplicateNumbers.size();

    }


}
