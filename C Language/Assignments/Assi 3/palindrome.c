// Check the given number is palindrome or not? 
#include<stdio.h>
void main(){
    int n,temp;
    printf("Enter the number");
    scanf("%d",&n);
    int rev=0;
    temp=n; 
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(rev==temp){
        printf("Palindrome");
    }
    else{
        printf("not palindrome");
    }
}

