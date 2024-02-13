def solution(a, b, c, d):
    x = [a, b, c, d]
    x.sort()
    
    if x[0] == x[3]:
        return a * 1111
    
    elif x[0] == x[2]:
        return (10 * x[0] + x[3])**2
    elif x[1] == x[3]:
        return (10 * x[1] + x[0])**2
    
    elif x[0] == x[1] and x[2] == x[3]:
        return (x[0] + x[2]) * abs(x[0] - x[2])
    
    elif x[0] == x[1]:
        return x[2] * x[3]
    elif x[1] == x[2]:
        return x[0] * x[3]
    elif x[2] == x[3]:
        return x[0] * x[1]
    
    else:
        return x[0]