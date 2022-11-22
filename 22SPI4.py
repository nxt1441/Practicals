import matplotlib.pyplot as plt
values1=[8,6,7,6,8,9,7]
values2=[8,7,6,8,9,7,8]
plt.plot(range(0,7),values1,linestyle='-',color='r',marker='o')
plt.plot(range(0,7),values2,linestyle=':',color='m',marker='x')
plt.legend(['Student1','Student2'])
plt.show()
