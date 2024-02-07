def solution(l, r):

    result = []
    exception = set(['1','2','3','4','6','7','8','9'])

    for i  in range(l,r+1):
        num = set(str(i))

        if num & exception:
            pass
        else:
            result.append(i)

    if len(result) == 0 :
        result.append(-1)

    answer = sorted(result)
    return answer