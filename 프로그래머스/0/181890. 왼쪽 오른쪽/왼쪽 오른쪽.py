def solution(str_list):
    if 'l' not in str_list and 'r' not in str_list:
        return []

    l_index = str_list.index('l') if 'l' in str_list else float('inf')
    r_index = str_list.index('r') if 'r' in str_list else float('inf')

    if l_index < r_index:
        return str_list[:l_index]
    else:
        return str_list[r_index+1:]