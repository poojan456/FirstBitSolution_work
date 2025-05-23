// Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
int Check(char);
void main(){
    char c;
    printf("Enter Any character");
    scanf(" %c",&c);
    int v=Check(c);
    if(v==1)
    printf("its vowel");
    else
    printf("its connsonanat");

}
int Check(char c){
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        return 1;
    }
    else{
        return 0;
    }

}