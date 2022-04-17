# sample using pythonv3.8
num = 18
n1 = num % 10
n2 = num // 10 % 10
print(n1, n2)
# sum of all digits is equal to product of all digits
# sample 1124 1x1x2x4 = 8 and 1+1+2+4 = 8
def getspy(number):
    n1 = number % 10
    n2 = number // 10 % 10
    n3 = number // 100 % 10
    n4 = number // 1000 % 10
    sum = n1 + n2 + n3 + n4
    multiply = n1 * n2 * n3 * n4
    if sum == multiply:
        print('number is spy number')
    else:
        print('number is not spy number')
    # print( n1, n2, n3, n4 )
input_number = int(input('enter a number: '))
getspy(input_number)