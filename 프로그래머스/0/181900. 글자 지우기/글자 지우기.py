def solution(my_string, indices):
    answer = ''
    lst = list(my_string) 
    
    for i in indices: # 지워야되는 index 부분을 0으로 변경해줌
        lst[i] = 0
    
    mask ={0} # 0을 버리기 위한 mask
    lst = [i for i in lst if i not in mask] # lst를 돌면서 만약 단어가 mask에 안들어가면 추가
    answer = ''.join(lst) # 문자열로 변경
    
    return answer