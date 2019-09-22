#Takes a set of large dimensions and compresses to a smaller sub-set
#Highly correlated data in multiple dimensions. 
#Compresses large volumes of data into smaller amounts.
head(iris) #Takes the iris sample data set
d = iris[,1:4]#This filters out only the first 4 colums as the 5th column is not numerical
head(d) #Presents the data
pc = princomp(d, cor=TRUE, score=TRUE) #Runs principle component analysis , Correlation set to true, Capture the score
summary(pc)

#Cumulative Proportions: Reflection of variations in the data culmulatively between components.
#The components show how much of the data they represent i.e.Using PCA you only needed to look at component 1 and 2 to get a sense of the data.
#Standard deviation shows the proportain that deviates from the trend


plot(pc) #gives a visual way to look at the data
plot(pc, type ="l") #shows the data as a line chart
#notice the shape of the curve is an "elbow curve", from where the line flattens out, you don't need to consider any of the components.

biplot(pc) #Shows the barings of the inputs to the direction of variance. 

dim(d) #Shows the number of observations

attributes(pc) # Shows the attributes

pc$loadings #Just shows the data on the loadings
#shows how the indivudal dimensions have a baring on the principle components identified.

pc$scores #Maps the input into a set of transformation based on corrilation



