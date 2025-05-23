
//
#include<stdio.h>
void isPalindrome(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    isPalindrome(n);

}
void isPalindrome(int n){
    int temp;
    
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