import java.util.*;
public class first{
public static void main(String[]arr){
    System.out.println("Hello"+ " Dunia ");
    System.out.println(2+4);
    System.out.println('A'+2);

    char firstCharacter= 'a';
    System.out.println("the first character is:" + (char)(firstCharacter+2));

    int num1=23;

    double num2=num1; //Implict type conversion
    System.out.println(num2);

    long value1=123456789;
    
    int value2=(int)value1; //Explicit type conversion
    System.out.println(value2);
    int activeuser=100;
    int prefix= ++activeuser;
    System.out.println(prefix);
} 
}