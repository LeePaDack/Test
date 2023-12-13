import math

def solution (denum1,num1,denum2,num2):
    
    분모 = num1*num2
    분자 = denum1*num2+denum2*num1
    
    최대공약수 = math.gcd(분모,분자)
    
    answer=[분자/최대공약수,분모/최대공약수]
    
    return answer