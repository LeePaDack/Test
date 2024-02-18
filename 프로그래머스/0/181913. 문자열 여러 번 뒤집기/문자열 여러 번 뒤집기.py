def solution(mystring, queries):
    for i in range(len(queries)):
        a, b = queries[i][0], queries[i][1]
        mystring = mystring[:a] + mystring[a:b+1][::-1] + mystring[b+1:]
    return mystring