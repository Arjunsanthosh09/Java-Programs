// 14.Write a Program to implement  all string handling functions.(length, concatenation, 
// character extraction, string comparison, string index, substring, replace, lower and uppercase, trim)

import java.io.DataInputStream;

public class stringfunctions {
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        String data1,data2;
        try {
            System.out.println("Enter the first string :");
            data1=in.readLine();
            System.out.println("Enter the Second string :");
            data2=in.readLine();
            
            System.out.println("----------Length Function --------------");
            System.out.println("length of the first String is "+data1.length());
            System.out.println("length of the first String is "+data2.length());

            System.out.println("----------concatenation Function --------------");
            String concat=data1.concat(data2);
            System.out.println("concatenation of two string is  :"+concat);

            System.out.println("----------character extraction Function --------------");
            int at1;
            System.out.println("enter a index to extract the character ");
            at1=Integer.parseInt(in.readLine());
            System.out.println("Character at "+at1+ " from string "+data1+" is "+ data1.charAt(at1));

            System.out.println("----------string comparison --------------");
            if (data1.equals(data2)) {
                System.out.println("Both strings are equal..");
            }
            else{
                System.out.println("Both strings are not equal");
            }

            System.out.println("----------String Index Function--------------");
            char c;
            System.out.println("Enter a character to find the index in the first string:");
            c = in.readLine().charAt(0);

            int index = data1.indexOf(c);
            if (index != -1) {
                System.out.println("Character '" + c + "' found at index: " + index + " in string '" + data1 + "'.");
            } else {
                System.out.println("Character '" + c + "' not found in the string '" + data1 + "'.");
            }

            System.out.println("----------substring Function--------------");
            int start,end;
            System.out.println("Entr the starting index to retrive the substring:");
            start=Integer.parseInt(in.readLine());
            System.out.println("Entr the ending index to retrive the substring:");
            end=Integer.parseInt(in.readLine());
            System.out.println("Sub string is :"+data1.substring(start, end));

            System.out.println("----------replace Function--------------");
            String data3,data4;
            System.out.println("Enter a string :");
            data3=in.readLine();
            System.out.println("Enter astring to replace:");
            data4=in.readLine();
            System.out.println("Replaced string is  "+data1.replace(data3, data4));

            System.out.println("----------lower and uppercase--------------");
            System.out.println("lower case of "+data1 +" is"+ data1.toLowerCase());
            System.out.println("Upper case of "+data2 +" is"+ data2.toUpperCase());

            System.out.println("----------trim--------------");
            System.out.println("Enter a string with leading and trailing spaces:");
            String strWithSpaces = in.readLine();
            System.out.println("String after trim: '" + strWithSpaces.trim() + "'");
        } catch (Exception e) {
            
        }
    }    
}
