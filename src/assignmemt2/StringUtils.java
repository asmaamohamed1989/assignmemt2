package assignmemt2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
interface StringForm
{
    boolean FormCompare(String s1,String s2);
    
}
public class StringUtils{
    public static String betterString(String s1,String s2,StringForm cmp)
    {
        if(cmp.FormCompare(s1, s2))
            return s1;
        return s2;   
    }
    
}
