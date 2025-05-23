//Write a program to check given 3 digit number is pallindrome or not.
#include<stdio.h>
int isPalindrome(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    
    int x=isPalindrome(n);
    if(x==1)
    printf("Palindrome");
    else
    printf("Not Palindrome");

}

int isPalindrome(int n){
    int temp=n;
   
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
       

        n=n/10;

    }
    if(rev==temp){
        return 1;

    }
    else{
        return 0;
    }
    



}