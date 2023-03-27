import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
import seaborn as sns

def breast_cancer(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18):
  b=[[int(a1),int(a2),int(a3),int(a3),int(a5),int(a6),int(a7),int(a8),int(a9),int(a10),
      int(a11),int(a12),int(a13),int(a14),int(a15),int(a16),int(a17),int(a18)]]
  data=pd.read_csv("/content/breast-cancer (1).csv")
  #data.head()
  #data.info()
  data.isna().sum()
  rom sklearn.preprocessing import LabelEncoder
  labelencoder_Y=LabelEncoder()
  data.iloc[:,1]=labelencoder_Y.fit_transform(data.iloc[:,1].values)
  #data.head()

  from sklearn.preprocessing import LabelEncoder
  labelencoder_Y=LabelEncoder()
  data.iloc[:,1]=labelencoder_Y.fit_transform(data.iloc[:,1].values)
  #data.head()

  #data.plot.scatter('diagnosis','area_mean')
  #plt.grid()

  data.drop(data.columns[[3,6,7,8,9,10,12,15,16,17,19]], axis=1, inplace=True)
  #data.head()

  plt.figure(figsize=(10,10))
  sns.heatmap(data.iloc[:,1:20].corr(),annot=True,fmt=".0%")

  x=data.iloc[:,2:20].values
  #print(x[0]) 
  y=data.iloc[:,1].values
  sns.pairplot(data.iloc[:,1:10],hue="diagnosis")

  from sklearn.model_selection import train_test_split
  x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.20,random_state=0)

  from sklearn.preprocessing import StandardScaler
  x_train=StandardScaler().fit_transform(x_train)
  x_test=StandardScaler().fit_transform(x_test)

  def models(x_train,y_train):
  from sklearn.linear_model import LogisticRegression
  log=LogisticRegression(random_state=0)
  log.fit(x_train,y_train)
  from sklearn.tree import DecisionTreeClassifier
  tree=DecisionTreeClassifier(random_state=0,criterion="entropy")
  tree.fit(x_train,y_train)
  from sklearn.ensemble import RandomForestClassifier
  forest=RandomForestClassifier(random_state=0,criterion="entropy",n_estimators=10)
  forest.fit(x_train,y_train)
  #print('[0]logistic regression accuracy',log.score(x_train,y_train))
  #print('[0]Descision tree accuracy',tree.score(x_train,y_train)) 
  #print('[0]random forest accuracy',forest.score(x_train,y_train))  
  return log,tree,forest

  model=models(x_train,y_train)

  from sklearn.metrics import accuracy_score
  from sklearn.metrics import classification_report

  for i in range(len(model)):
    print('')
  #print("model",i)
  #print(classification_report(y_test,model[i].predict(x_test)))
  #print('Accuracy : ',accuracy_score(y_test,model[i].predict(x_test)))
  
  pred=model[2].predict(x_test)
  #print(pred)
  #print(y_test)
  pred1=model[2].predict(b)
  return pred1
    
