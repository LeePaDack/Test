def solution(arr):
    if 2 in arr:
        return arr[arr.index(2) : len(arr) - arr[::-1].index(2)]        
    return [-1]