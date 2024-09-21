package com.company;
import java.util.Locale;

public class _14_String_Methods
{
    public static void main(String[] args)
    {
        String name = "student47";

        // Method 1 - name.length(); Returns a length of a given string in integer form.

        int length = name.length();

        System.out.println();
        System.out.println("The length of the string is : "+ length);

        // Method 2 - name.toLowerCase(); Returns a string convert into lower case.
        
        String lowerCase = name.toLowerCase();

        System.out.println();
        System.out.println("The Lower Case string is : " + lowerCase);

        // Method 3 - name.toUpperCase(); Returns a string convert into upper case.

        String upperCase = name.toUpperCase();

        System.out.println();
        System.out.println("The Upper Case string is : "+ upperCase);

        // Method 4 - name.trim(); Returns a string by removing the trailing and leading spaces.

        String non_trimmed = "         student47       ";
        String trimmed = non_trimmed.trim();

        System.out.println();
        System.out.println("The NON - Trimmed string is : "+ non_trimmed);
        System.out.println("The Trimmed string is : "+ trimmed);

        // Method 5 - name.substring(int start); Returns a substring from start to end name with given index (ex- index is 3 then it will returns a string from index 3 to end).

        String substring = name.substring(3);

        System.out.println();
        System.out.println("The substring from given index is : "+ substring);

        // Method 6 - name.substring(int start , int end); Returns a substring from start to end with given start index and end index (ex - start index is 1 and end index is 4 then return string from 1 to 4).

        String substring2 = name.substring(2,8);

        System.out.println();
        System.out.println("The substring2 from given index is : "+ substring2);

        // Method 7 - name.replace(char {old_char}, char {new_char}); Returns a string with replacing all the character which has been given to function with new character.

        String replace = name.replace('t','p');

        System.out.println();
        System.out.println("The Replaced character string is : "+ replace);

        // Method 8 - name.startswith(string {}); Returns Boolean true if the input is found on starting of the string and if not found returns false.

        boolean check_starts_with = name.startsWith("stu");

        System.out.println();
        System.out.println("The status of startsWith is : "+ check_starts_with);

        // Method 9 - name.endsWith(string {}); Returns Boolean true if the input is found at ending of the string and if not found returns false.

        boolean check_ends_with = name.endsWith("t47");

        System.out.println();
        System.out.println("The status of endsWith is : "+ check_ends_with);

        // Method 10 - name.charAt(int {index_of_string}); Returns the character at a given index .

        char charAt = name.charAt(5);

        System.out.println();
        System.out.println("The character at given index is : "+ charAt);

        // Method 11 - name.indexOf(string {string_literal} , int {index}); Returns the integer value , if the given character or string is not found then returns -1 and if found then returns 0 .

        int indexOf = name.indexOf('i', 0);

        System.out.println();
        System.out.println("The string from given index is : "+ indexOf);

        // Method 12 - name.indexOf(string {string_literal}); Returns the begin index of given entered string from the string.

        int indexOf2 = name.indexOf("nt");

        System.out.println();
        System.out.println("The character in string on given index is : "+ indexOf2);

        // Method 13 - name.lastIndexOf(String {string_literal}); Returns the last index of the given string from the string.

        int last_index = name.lastIndexOf("u");

        System.out.println();
        System.out.println("The last index of the given string is : "+ last_index);

        // Method 14 - name.lastIndexOf(string {string_literal}, int {integer}); Returns the last index of the given string from the string and cheking also from ending

        int last_index2 = name.lastIndexOf("t", 8) ;

        System.out.println();
        System.out.println("The last index of the given string is : "+ last_index2);

        // Method 15 - name.equals(string {string_literal}); Returns Boolean true if the whole string match to given string (Case Sensitive).

        boolean equals = name.equals("StUDent47");

        System.out.println();
        System.out.println("The status of equals to string is : "+ equals);

        // Method 16 - name.equalsIgnoreCase(string {string_literal}); Returns Boolean true if the whole string is match to the given stirng (Non-Case Sensitive).

        boolean equals2 = name.equalsIgnoreCase("StudenT47");

        System.out.println();
        System.out.println("The status of equals2 to string is : "+ equals2);
    }
}