#control statment
#if statment
x=50
y=60
if(x==y):
  print("value of x=",x)

#if-else statment
a=1
es=0
os=0
while(a<=20):
  if(a%2==0):
    print("even number are ",a,end="\t")
    es+=a
    a+=1
  else:
    print("odd number are",a,end="\t")
    os+=a
    a+=1
print("sum of even is=",es)
print("sum of odd number is=",os)

#if-elif-else
p=int(input("enter your percentage"))
if (p>=70 and p<=100):
  print("designation")
elif(p>=60 and p<=69):
  print("first class")
elif(p>50 and p<=59):
  print("second class")
elif(p>40 and p<=49):
  print("pass")
else:
  print("fail")

#print largest number
a=int(input("enter value 1"))
b=int(input("enter value 2"))
c=int(input("enter value 3"))
if(a>b and a>c):
  print("a is big")
elif(b>a and b>c):
  print("b is big")
else:
  print("c is big")
  
#print smallest number
a=int(input("enter value 1"))
b=int(input("enter value 2"))
c=int(input("enter value 3"))
if(a<b and a<c):
  print("a is small")
elif(b<a and b<c):
  print("b is small")
else:
  print("c is small")
  
#while loop
#print 1 to 10
a=1
while(a<11):
  print(a)
  a+=1
  
#print 1 to 10 in reverse
a=10
while(a>0):
  print(a)
  a-=1
  
#print even num between 1 to 50
a=2
while(a<=50):
  print(a)
  a+=2

#print odd number between 1 to 50
a=1
while(a<=49):
  print(a)
  a+=2
#for loop
#using for loop print odd num
for i in range(1,50,2):
  print("i",end="\t")

#using for print even num
for i in range(2,51,2):
  print(i)

#using for loop print 1 to 10
for i in range(1,10):
  print(i)
  
#using for loop print 10 to 1
for i in range(10,1,-1):
  print(i)

#print sum from list
li=[10,20,30,60,70,80]
sum=0
for i in li:
  sum+=i
print("total",sum)

