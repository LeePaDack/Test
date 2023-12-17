def solution(n):
    answer = 1
    people = n // 7 
    if n > people * 7:
        answer = people + 1
    else:
        answer = people
    return answer