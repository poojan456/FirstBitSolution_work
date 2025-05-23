// convert upper a to lower and lower to upper using func

#include<stdio.h>
void character();
void main(){
    character();
}
void character(){
    char ch;
    printf("Enter any character");
    scanf(" %c", &ch);
    if(ch>='a'&& ch<='z'){
        ch=ch-32;
        printf("%c",ch);
        
    }
    else if(ch>='A'&& ch<='Z'){
        ch=ch+32;
        printf("%c",ch);
        
    }
    else if(ch>='0'&&ch<='9') {
        printf("its a digit");
    }
}