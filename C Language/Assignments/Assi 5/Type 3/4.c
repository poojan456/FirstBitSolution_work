#include<stdio.h>
void isVowel(char);
void main(){
    char p;
    printf("Enter character");
    scanf(" %c",&p);
    isVowel(p);


}
void isVowel(char p){
   
    
    if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U'){
        printf("its vowel");
    }
    else{
        printf("consonant");
    }
}
