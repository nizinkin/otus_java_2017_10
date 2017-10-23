package ru.otus.java;
import java.util.List;
import com.google.common.primitives.Ints;
/**
 *simple binary search in array with google guava (contains method already exist in Ints, just kata)
 * 
 */
public class BinarySearch {
    
public boolean isExist(int[] array, int value) {
    
    boolean isExist = false;
    Ints.sortDescending(array);
    int[] sortedArr = array;
    int startKey = 0;
    int endKey = sortedArr.length-1;
    int midKey = (endKey+startKey)/2;
    int midVal = sortedArr[midKey];
    while (startKey != endKey){
        midKey = (endKey+startKey)/2 ;
        midVal = sortedArr[midKey];
        if (midVal == value){
            isExist = true;
            return isExist;
        } else if (midVal < value) {
            endKey = midKey-1;
        } else {
            startKey = midKey+1;
            
        }
    }
    return isExist;
 
}
}
