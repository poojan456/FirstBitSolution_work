//Check the given number is palindrome or not?
#include<stdio.h>
int isPalindrome(int);
void main(){
    int n;
    scanf("%d",&n);
    int k=isPalindrome(n);
    if(k==1)
    printf("palindrome");
    else{
        printf("not palindrome");
    }
}
int isPalindrome(int n){
    int rev=0;
    int temp=n;
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(temp==rev){
        return 1;
    }
    else{
        return 0;
    }

}