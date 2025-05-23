// using type 2
#include<stdio.h>
isPalindrome();
void main(){
    int v=isPalindrome();
    if(v==1){
        printf("Palindrome");

    }
    else{
        printf("not palindrome");

    }
}
isPalindrome(){
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
        return 1;
       
    }
    else{
        return 0;
        
    }

}
