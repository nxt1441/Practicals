import math as m
import matplotlib.pyplot as plt
x = range(10)
y = []
for i in range(10):
 y.append(m.cos(i))
print(x)
print(y)
ax=plt.axes()
ax.grid()
plt.title("My First Graph")
plt.xlabel("X-axis")
plt.ylabel("Y-axis")
plt.xlim([-2,12])
plt.ylim([-2,2])
plt.annotate(xy=[6,-1],text='lowest value of y')
plt.plot(x,y,linestyle='-.',color='r',marker='p')
plt.show()
