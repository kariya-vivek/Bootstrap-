#command line argument
import sys
val1=int(sys.argv[1])
val2=int(sys.argv[2])
print("sum=",val1+val2)
print("sub=",val1-val2)
print("multi=",val1*val2)
print("div=",val1/val2)


#using command line print sum of even and odd
import sys
lis=sys.argv[1:]
esum=0
osum=0
for i in lis:
  x=int(i)
  if(x%2==0):
    esum+=x
  else:
    osum+=x
print("even sum=",esum)
print("odd sum=",osum)

