def solution(arr, queries):
    for s, e, k in queries:
        if k == 0:
            continue
        for i in range(s, e +1):
            if i % k == 0:
                arr[i] += 1
    return arr