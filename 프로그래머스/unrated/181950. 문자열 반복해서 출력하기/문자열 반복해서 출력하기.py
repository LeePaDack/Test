a, b = input().strip().split(' ')
b = int(b)

if len(a)>=1 and len(a)<=10 and b>=1 and b<=10:
    repeat = a*b
    print (repeat)
else:
    print("잘못되어있음")