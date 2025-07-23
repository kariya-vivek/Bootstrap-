#5 task
#print table
a=int(input("enter any number"))
i=1
while(i<=10):
  print(a,"*",i,a*i)
  i+=1
  
#print area

#circle
pi=3.14
r=int(input("enter value of r"))
x=pi*r**2
print("area of circle=",x)

#square area
pi=3.14
s=int(input("enter value of s"))
x=s**2
print("area of square=",x)

#rectangle
l=int(input("enter value of i"))
w=int(input("enter value of w"))
x=l*w
print("area of rectangle=",x)


#triangle
b=int(input("enter  base"))
h=int(input("enter height"))
x=0.5*b*h
print("area of triangle=",x)

#celsius
c=int(input("enter celsius="))
f=(c * 1.8)+32
print("fahernhit=",f)

#fahernhit
f=int(input("enter fahernhit="))
c=(f - 32)*5/9
print("celsius=",c)

#creat result
name=input("enter name")
rollno=int(input("enter roll number"))
markj=int(input("enter mark of j2ee"))
markp=int(input("enter mark of python"))
markc=int(input("enter mark of cs"))
total=markj+markp+markc
avg=total/3
print("total of student=",total)
print("average=",avg)

#seprat three value of user
var1,var2,var3=[int(x) for x in input("enter number").split(',')]
print("sum is=",var1+var2+var3)

