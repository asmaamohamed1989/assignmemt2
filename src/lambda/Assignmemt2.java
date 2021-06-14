/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*import assignmemt2.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;*/
package lambda;

import assignmemt2.StringUtils;

public class Assignmemt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1="ASMAAMOHAMED";
      String string2="CCC";
     
        String stri = StringUtils.betterString(string1,string2,(s1,s2)->s1.length()>s2.length());
        System.out.println(stri);
        
    }
    
}

interface CheckString
{
    
public class Assignment2 {
   public static boolean isMoreThanFifty(int n1, int n2) {
return (n1 + n2) > 50;
}
public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
List<Integer> newList = new ArrayList<>();
for (Integer i : l) {
if (p.test(i, i + 10)) {
newList.add(i);
	}
}
return newList;
}



/**
 *
 * @author Muslim
 */

