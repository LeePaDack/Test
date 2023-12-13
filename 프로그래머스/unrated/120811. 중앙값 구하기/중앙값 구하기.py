def solution(array):
    array.sort()
    c=len(array)
    d=c//2
    answer=array[int(d)]
    return answer