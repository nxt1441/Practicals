import datetime as dt
import pandas as pd
from matplotlib import pyplot as plt
import numpy as np

start_date = dt.datetime(2021, 9, 1)
end_date = dt.datetime(2021, 9, 30)
daterange = pd.date_range(start_date, end_date)
print(daterange)

sales = (np.random.rand(len(daterange)) * 50).astype(int)
print(sales)

df=pd.DataFrame(sales,index=daterange,columns=['sales'])
lr_coef = np.polyfit(range(0, len(df)), df.sales, 1)
print(lr_coef)

lr_fun = np.poly1d(lr_coef)
print(lr_fun)

trend = lr_fun(range(0, len(df)))
print(trend)

df['trend']=trend
print(df)

df.loc['2021-9-1':'2021-9-30'].plot()
plt.xlabel('SalesData')
plt.ylabel('SalesValue')
plt.title('Plotting Time')
plt.legend(['Sales', 'Trend'], loc=0)
plt.show()
