package com.company;

import com.sun.source.tree.AssignmentTree;

import javax.swing.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;




public class Main {
    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello World");
        /*
    Variables In JAvA : Variables are data containers which stores Data Values
    ie, Strings, Int, float, char, boolean
    How to generate Variables
    Syntax : <data type> <variable name> = <value>
//     */
//        String Name = "Rabia";
//        System.out.println(Name);
//        int a = 45, x= 22, y = 99, z = 25;
//        float b =  25.55f;
//        boolean isAdult = false;
//        System.out.println(a);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(b);
//        System.out.println(isAdult);

        /* Rules for constructing names of variables in java
        1. Can contain digits, underscores, Dollar signs or letters
        2. Should begin with the letter, $ or #
        3. Java is case-sensitive language that means Rabia != rabia
            that means These are two different variables
        4. It cannot have white spaces
        5. Variables cannot be named after reserved keywords


         */


        /* There are  two types of Java Data Types:
        1. Primitive : (Already Defined) ie, byte(1 byte), short(2 byte), int(4 byte),
           long(4 byte), double(8 byte), float(4 byte), boolean(1 bit), character(2 byte)

        2. Non-Primitive or Reference data type (Objects):
//         */
//        byte u= -56;
//        System.out.println(u);
//        double f= 435834.9535545d ;
//        System.out.println(f);
//        char Grades = 'A';
//        System.out.println(Grades);

        /*
        Operators in Java :
                            Operand,     Operator,     ,Operand  =   Results
                               4            +              4     =     8

                               Types of Operators in Java
                               1. Arithmetic Operators
                               2. Assignment Operators
                               3. Logical Operators
                               4. Comparison Operator

         */

//        // Arithmetic Operator
//
//        int num1 = 5 , num2 = 10; // (Assignment Operator)
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 % num2);
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//
//
//
//        System.out.println(num1++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);
//
//        num1+=10;
//        System.out.println(num1);
//        num2-=2;
//        System.out.println(num2);
//
//        num2%=5;
//        System.out.println(num2);
//
//        int num3=20;
//        num3/=2;
//        System.out.println(num3);

        /* Comparison Operators
        1. == : Checks for equality
        2. != :
        3. < :
        4. > :
        5. <= :
        5. >= :


        //Logical Operators

        && : Logical AND Operator : Returns True only if both the conditions are true
        || : Logical OR Operator : if one condition is true
        !  : Logical NOT Operator : Reverse the result from True to False and vice versa
         */

        // Taking Input from the user

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter input : ");
//        String input = scan.nextLine();
//        System.out.println(input);
//
//       Scanner scan1 = new Scanner(System.in);
//       System.out.print("Enter your age : ");
//       int input1 = scan1.nextInt();
//       System.out.println(input1);
//
//       Scanner scan2 = new Scanner(System.in);
//       System.out.print("Enter your Standard : ");
//       int input2 = scan2.nextInt();
//       System.out.println(input2);


        // Strings

//        String name = "Rabia Khan";
//        String Course = "Java";
//        System.out.println(name);
//        System.out.println(Course);
//        System.out.println(name + " is learning " + Course);
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name + " is \"learning\" " + Course);  // Escape Sequence character.
//        System.out.println(name + " is learning\t " + Course);
//        System.out.println(name + " is \"learning\n " + Course);
//
//        // string Methods
//
//        System.out.println(name.contains("ab"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.endsWith("han"));
//        System.out.println(name.indexOf("khan"));
//
////        Scanner scan3 = new Scanner(System.in);
////        System.out.println("Enter Age");
////        int input = scan3.nextInt();
////        System.out.println(input);
//
//        String color = "Lavender";
//        System.out.println(color);
//        System.out.println(color.length());
//        System.out.println(color.toUpperCase());
//        System.out.println(color.contains("der"));
//        System.out.println(color.indexOf("d"));
//        System.out.println(color.charAt(0));
//        System.out.println(color.endsWith("er"));
//
//        int numb1 = 25, numb2=34;
//        System.out.println(Math.max(numb1,numb2));
//        System.out.println(Math.min(numb1,numb2));
//        System.out.println(Math.sqrt(81));
//        System.out.println(Math.abs(-44));
//        System.out.println(Math.abs(22));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//
//        String mickey = "Mickey_Mouse_Club_House";
//        System.out.println(mickey);
//        System.out.println(mickey.contains("Club"));
//        System.out.println(mickey.endsWith("use"));
//        System.out.println(mickey.indexOf("Mickey"));
//        System.out.println(mickey.charAt(8));


        //If-else Conditionals

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int input = scan.nextInt();
//        System.out.println(input);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age = scan.nextInt();
//        if (age>70){
//            System.out.println("You are not a kid");
//        }
//        else if (age>20){
//            System.out.println("You are an adult");
//        }
//        else if (age<60){
//            System.out.println("You are senior citizen");
//        }
//        else{
//            System.out.println("You are a kid");
//        }

//        switch (age){
//            case 12:
//                System.out.println("You are 12 years old");
//                break;
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            case 22:
//                System.out.println("You are 22 years old");
//                break;
//            case 30:
//                System.out.println("You are 30 years old");
//                break;
//            default:
//                System.out.println("You did not match any of the cases");
//                break;
//        }

        //Quick Quiz
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Enter a number to know name of the day");
//        int day = scan.nextInt();
//
//        switch (day){
//            case 1 :
//                System.out.println("Today is Sunday");
//                break;
//            case 2 :
//                System.out.println("Today is Monday");
//                break;
//            case 3 :
//                System.out.println("Today is Tuesday");
//                break;
//            case 4 :
//                System.out.println("Today is Wednesday");
//                break;
//            case 5 :
//                System.out.println("Today is Thursday");
//                break;
//            case 6 :
//                System.out.println("Today is Friday");
//                break;
//            case 7 :
//                System.out.println("Today is Saturday");
//                break;
//            default:
//                System.out.println("Not Defined");
//        // While loops
//        int i=0;
//        while(i<100){
//            System.out.println(i);
//            i+=1;
//
//        //Do-while Loop
//
//        int j=0;
//        do{
//            System.out.println(j);
//            j+=1;
//        }while(j<100);
//        break;


//        //for loop [Break
//        for (int i = 0; i <= 10; i++) {
//            if(i>2) {
//                break;
//            }
//            else{
//
//                System.out.println(i);
//
//            }
//        }
        //Loops
        //While Loop
        /* Syntax : While ( condition ){
        //This code will keep executing until the condition is true
         */
/*
        int i = 0;
        while(i<100){
            System.out.println(i);
            i+=1;

        }
Do while
Will necessarily run for once irrespective of the given condition
*/
//        int j=0;
//        do {
//            System.out.println(j);
//            j+=1;
//        }while (j>100);
//
////For Loop
 /*
       for (st1;st2;st3){
       //Code to be executed
//*/
//        for (int i=0; i<=10; i++){
//            if(i>5){
//                break;
//            }
//            else{
//                System.out.println(i);
//            }
//
//        }
        //continue is used for skipping a line or condition and then to move ahead
//        for (int i=0; i<=10; i++){
//            if(i==5){
//                continue;
//            }
//            else{
//                System.out.println(i);
//            }
//
//        }
//
        // Java Arrays
//        int [] marks = {1,2,3,4,5};
////        System.out.println(marks[3]);
////        marks[3]=33;
////        System.out.println(marks[3]);
////        //Classical way to iterate an  array
////        for(int i=0;i<=marks.length;i++){
////            System.out.println(i);
////        }
//        //For each loop
////        for(int value: marks){
////            System.out.println(value);
////        }
//        int [][]matrix={{1,2,3},{4,5,6}};
//        System.out.println(matrix[0][1]);
//
//        int [][]matrix1={{22,33,44,55},{55,66,77,88}};
//        System.out.println(matrix1[0][1]);
//
//        //strings
//        String []cars={"Maruti", "Suzuki", "Innova", "Ford Titanium"};
//        for (String value:cars) System.out.println(value);
//        System.out.println("This is a break");
//        System.out.println(cars[1]);

//        //Try . catch
//        String[] cars = {"Maruti", "Suzuki", "Innova", "Ford Titanium"};
//        try {
//            System.out.println(cars[5]);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Masoom");

//        String[] cosmetic={
//            "kajal", "foundation", "mascara", "lipstick", "tint", "blush", "eye shadow", "high lighter", "concealer"
//        };
//      for (String value:cosmetic) System.out.println(value);
//        System.out.println(cosmetic.length);
//        System.out.println(cosmetic[5]);
//        try {
//            System.out.println(cosmetic[15]);
//        } catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Does not exist");
////        System.out.println(sum(5,7));
//        float number_1, number_2;
//        System.out.print("Enter first number : ");
//        Scanner scan = new Scanner(System.in);
//        number_1=scan.nextFloat();
//
//        System.out.print("Enter the second number : ");
//        Scanner scan2 = new Scanner(System.in);
//        number_2=scan.nextFloat();
//        System.out.print("You have entered ");
//        System.out.println(number_1);
//        System.out.print(" You have entered ");
//        System.out.println(number_2);
//        String prompt ="Enter 0 for addition, 1 for subtraction, 2 for multiplication and 3 for division";
//        System.out.println(prompt);
//
//        int input = scan.nextInt();
//        switch (input){
//            case 0:
//                System.out.println("Adding these number");
//                System.out.println("The result is : ");
//                System.out.println(number_1+number_2);
//                break;
//
//            case 1:
//                System.out.println("Subtracting these number");
//                System.out.println("The result is : ");
//                System.out.println(number_1-number_2);
//                break;
//            case 2:
//                System.out.println("Multiplying these number");
//                System.out.println("The result is : ");
//                System.out.println(number_1 * number_2);
//                break;
//
//            case 3:
//                System.out.println("Dividing these number");
//                System.out.println("The result is : ");
//                System.out.println(number_1/number_2);
//                break;
//            default:
//                System.out.println("Invalid input");
//        }





    }
}





























