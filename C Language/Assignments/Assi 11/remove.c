//WAP to Remove the nth Index Character from a Non-Empty String 
#include<stdio.h>
#include<string.h>
void main(){
    char s[20];
    printf("Enter string");
    scanf("%s",s);
    if(s<0){
       printf("Empty string");
    }
    int n;
    printf("Enter index");
    scanf("%d",&n);
    char str[20];
    for(int i=n;i<strlen(s);i++){
        s[i]=s[i+1];
 
        }
         printf("%s",s);
   

}