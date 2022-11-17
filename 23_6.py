import matplotlib.pyplot as plt
values = [7,8,6,4,3]
colors = ['b', 'g', 'r', 'c', 'm',]
labels = ['A', 'B', 'C', 'D', 'E',]
explode = (0, 0.5, 0, 0.1, 0,)
plt.pie(values, colors=colors, labels=labels, explode=explode, autopct='%1.1f%%',counterclock=False,shadow=True)
plt.title('Values')
plt.show()
