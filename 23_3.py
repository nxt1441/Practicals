import matplotlib.pyplot as plt
day = [8,7,6,5,4,3,2,1]
temp = [22,21,19,25,32,30,27,21]
colors = ['r','b','m','k','g','r','b']
plt.title('Bar Chart')
plt.bar(range(0,8),temp,color=colors,align='edge')
plt.show()
