#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n)
{
    int answer = 0;

    for (int i = 2; i < n; i++)//n이 최소 3부터 시작이므로 i = 2로 시작한다.
    {
        if (n % i == 1)//n 나누기 i 의 나머지가 1일 때
        {
            answer = i;
            break;
        }
    }

    return answer;
}