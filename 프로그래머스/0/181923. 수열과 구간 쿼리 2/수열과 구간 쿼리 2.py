def solution(arr, queries):
    result = []
    for s, e, k in queries:
        i_list = [i for i in arr[s:e+1] if i > k]
        if i_list:
            result.append(min(i_list))
        else:
            result.append(-1)
    return result