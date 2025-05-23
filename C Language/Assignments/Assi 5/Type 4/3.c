//Write a program to check whether a given year is a leap year.
#include<stdio.h>
char Leap(int);
void main(){
    int yr;
    printf("Enter yr");
    scanf("%d", &yr);
     char check=Leap(yr);
     
     if(check=='L')
     printf("Leap yr");
     else
     printf("Not leap yr");

}
char Leap(int yr){
    if(yr%400==0||(yr%4==0&&yr%100!=0))
    return 'L';
    else 
    return 'N';


}