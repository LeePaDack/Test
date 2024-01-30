def solution(numLog):
    answer = ''
    result = []
    
    for i in range(1,len(numLog)):
        
        if numLog[i] - numLog[i-1] == 1:
            result.append('w')
        elif numLog[i] - numLog[i-1] == -1:
            result.append('s')
        elif numLog[i] - numLog[i-1] == 10:
            result.append('d')
        elif numLog[i] - numLog[i-1] == -10:
            result.append('a')
            
    answer = ''.join(result)
    return answer