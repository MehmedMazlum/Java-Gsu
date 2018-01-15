package iki_basamakli_oyunu;

import java.util.Scanner ;

public static int getInput()
{
    int temp = 1;

    do
    {
        System.out.println("Answers must be between 1 and 15");
        temp =  reader.nextInt();

        if(temp >=1 && temp <= 15)
        {
            return temp;
        }
        else
        {
            System.out.println("Please enter a valid value");
        }
    }while(temp > 15 || temp < 1);

    //This value will never be reached because the do while loop structure will not end until a valid return value is determined
    return 1;
}//End 