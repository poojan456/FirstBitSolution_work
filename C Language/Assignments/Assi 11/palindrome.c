//write a program to check the string is palindrome or not. 
#include<stdio.h>
#include<string.h>
void main(){
    char str[20],rev[20];;
    printf("Enter string");
    scanf("%s",str);

   int j=0;
    for(int i=strlen(str)-1;i>=0;i--){
         rev[j]=str[i];
         j++;
    }
    rev[j]='\0'; 
    if(strcmp(str,rev)==0){
        printf("Palindrome");
    }
    else{
        printf("not palindrome");
    }
}

