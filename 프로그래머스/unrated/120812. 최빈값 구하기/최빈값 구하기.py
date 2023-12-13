def solution(array):
    answer = 0
    
    dic_array={}
    
    for i in array:
        if i in dic_array:
            dic_array[i]+=1
        else:
            dic_array[i]=1
            
    max_idx=-1
    max_cnt=0
    for i in dic_array:
        if dic_array[i]>max_cnt:
            max_cnt=dic_array[i]
            max_idx=i
        elif dic_array[i]==max_cnt:
            max_idx=-1
    answer=max_idx
    return answer