def solution(intStrs, k, s, l):
    result = []
    ret = ''
    for i in intStrs:
        ret = i[s:s+l]
        if int(ret) > k:
            result += [int(ret)]
    return result