
/**
 * An introduction to Strings and String methods.
 *
 * @author Wilhem Alcivar
 */
import java.util.*;
public class StringParser
{
    /**
     * Takes a String and returns that String with all characters uppercased.
     * E.G. cat would become CAT. dOnUt would become DONUT.
     *
     * @param s
     * @return String
     */
    public static String upperCaseString(String s)
    {
        String change = s.toUpperCase();
        return change;
    }

    /**
     * Takes a String and returns that String with all characters lowercased.
     * E.G. MOUSE would become mouse. dOnUt would become donut.
     *
     * @param s
     * @return String
     */
    public static String lowerCaseString(String s) {
        
        return s.toLowerCase();
    }

    /**
     * Takes a String and returns the first character of that string.
     * E.G. cat would return c. Embark would return E.
     *
     * @param s
     * @return String
     */
    public static Character getFirstCharacter(String s) {
        
        char first = s.charAt(0);
        return first;
        
    }

    /**
     * Takes a String and returns the character at index n of that string.
     * E.G. cat, 2 would return t. Embark, 4 would return r.
     *
     * @param s
     * @param n
     * @return String
     */
    public static Character getNthCharacter(String s, Integer n) {
        char num = s.charAt(n);
        return num;
    }

    /**
     * Takes a String and returns that string with the first character uppercased.
     * E.G. cat would return Cat. cofFee would return CofFee.
     *
     * @param s
     * @return String
     */
    public static String upperCaseFirstCharacter(String s) {
        String change = s.substring(0,1).toUpperCase();
        String nameCap = change + s.substring(1);
        return nameCap;
    }

    /**
     * Takes a String and returns that string with the first character of each word in it uppercased
     * and then joined.
     * E.G. dog whistle would return DogWhistle. adjuNCT pRoFessOR would return AdjuctProfessor.
     *
     * @param s
     * @return String
     */
    public static String camelCaseString(String s) {
        s = s.toLowerCase();
        int index = s.indexOf(" ") + 1;
        
        s = s.substring(0,1).toUpperCase() +  s.substring(1,index -1)+ s.substring(index, index +1).toUpperCase() + s.substring(index +1); 

        return s;
    }

    /**
     * Takes a String and returns that string with each character lowercased
     * and then joined with an underscore
     * E.G. dog whistle would return dog_whistle. adjuNCT pRoFessOR would return adjuct_professor.
     *
     * @param s
     * @return String
     */
    public static String snakeCaseString(String s) {
        
        String val = s.toLowerCase();

        val = val.replaceAll(" ","_");
        
        return val;
    }

    /**
     * Takes a String and returns the length of that string
     * E.G. cat would return 3. extra would return 5.
     *
     * @param s
     * @return String
     */
    public static Integer getLength(String s) {
        
        int quantity = s.length();
        return quantity;
    }

    /**
     * Takes in two strings and returns true if they are equal
     * E.G. example and shelf would return false. 
     * cat and CaT would return false. 
     * Dog and Dog would return true
     *
     * @param s1
     * @param s2
     * @return String
     */
    public static Boolean isEqual(String s1, String s2) {
        if(s1.equals(s2))
        {
            return true;
        }
            return false;
    }

    /**
     * Takes in two strings and returns true if they are equal
     * E.G. example and shelf would return false. 
     * cat and CaT would return true. 
     * Dog and Dog would return true
     *
     * @param s1
     * @param s2
     * @return String
     */
    public static Boolean isEqualIgnoreCase(String s1, String s2) {
        if(s1.equalsIgnoreCase(s2))
        {
            return true;
        }
        return false;
    }
}
