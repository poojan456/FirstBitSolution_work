//WAP Replace all Occurrences of ‘a’ with $ in a String 
#include<stdio.h>
#include<string.h>
void main(){


    char s[20];
    printf("Enter the string");
    scanf("%s",s);

    int i;
    for(int i=0;i<strlen(s);i++){
        if(s[i]=='a'){
           s[i]='$';
            
        }
       

    }
    printf("%s",s);
    
}