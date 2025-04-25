#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    
    if(a<b)
        for(a; a<=b; a++){
            answer = answer + a;
        }
    
    else if(b<a)
        for(b; b<=a; b++){
            answer = answer + b;
        }
        
    else
        answer = a;

    return answer;
}