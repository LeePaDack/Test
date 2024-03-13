def solution(arr, query):
    for idx, i in enumerate(query):
        if idx % 2 == 0 :
            arr = arr[:i+1]
        else :
            arr = arr[i:]
    return arr