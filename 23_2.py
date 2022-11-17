import matplotlib.pyplot as plt
x = [5,7,6,3,2,4]
y = [1,24,19,16,35,16]
colors = ['r','g','b','m','k','y']
plt.title('Scatter Plotting')
plt.scatter(x,y,marker='x',s=200,color=colors)
plt.show()
