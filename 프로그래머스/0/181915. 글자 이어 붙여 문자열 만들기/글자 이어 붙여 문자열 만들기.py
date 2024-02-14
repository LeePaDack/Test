def solution(my_string, index_list):
    return "".join([my_string[i] for i in index_list])

"""join은 문자열의 method 각 원소 사이에 지정된
문자열(여기서는 빈 문자열 '')을 삽입하여 하나의 문자열로 합치는 데 사용된다.

for i in index_list 는
리스트 index_list를 순회하는 for 루프 각 반복에서 i는 index_list의 원소(인덱스)를 참조한다.

"""