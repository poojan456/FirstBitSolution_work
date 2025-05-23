//Calculate sum of numbers in the given rang
#include<stdio.h>
void palindrome();
void main(){
    palindrome();
}
void palindrome(){
    int n,original;
    int rev=0;
    printf("enter the number\n");
    scanf("%d",&n);
    original=n;
    int temp=n;
    while(temp!=0){

        int rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    if(original==rev){
        printf("palindrome");
    }
    else{
        printf("not palindrome");
    }  
}