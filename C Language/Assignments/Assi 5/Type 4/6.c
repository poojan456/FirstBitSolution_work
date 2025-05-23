//Write a program to check whether a given character is uppercase or lowercase. 
#include<stdio.h>
char UL(char);
void main(){
    char p;
    printf("Enter character");
    scanf(" %c",&p);
    char d=UL(p);
    if(d=='L')
    printf("Lowercase");
    else
    printf("Uppercase");

}
char UL(char p){
    if(p>='a'&& p<='z'){
        return 'L';

    }
    else{
        return 'U';
    }


}