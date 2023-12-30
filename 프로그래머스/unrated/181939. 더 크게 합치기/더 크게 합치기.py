def solution(a, b):
    answer1 = str(a)+str(b)
    answer2 = str(b)+str(a)
    if answer1 > answer2:
        return int(answer1)
    else:
        return int(answer2)