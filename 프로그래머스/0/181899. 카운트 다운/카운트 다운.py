def solution(start_num, end_num):
    # 빈 리스트 생성
    result_list = []
    
    # start_num부터 end_num까지 1씩 감소하는 수들을 리스트에 추가
    for num in range(start_num, end_num-1, -1):
        result_list.append(num)
    
    return result_list