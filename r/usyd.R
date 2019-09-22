HIV = read.csv('http://www.maths.usyd.edu.au/u/ellisp/AMED3002/HIV.csv') #Loads in the data from the USYD server
summary(HIV) #Shows a shummary of the data
HIV #Shows all the data

#Data properties

#(A). How many variables are in the dataset?
#Ans. 7
#How many observations are in the dataset? 
#Ans. 142 + 2701 = 2843 

#(B). Comment on the classes of these variables and how they are stored in R.
#State: character
#Sex: character
#diag: numeric
#death: numeric
#status: character
#T.caeg: character
#age: numeric

#(C). Is there anything missing in this dataset?
#No


#State vs sex

#(D). What types of variables should sex and state be? 
#character vectors
#(E). What is an appropriate statistical test that could be used by the researchers to test this question?
#Chi-Square test. (Tests variance of each state).
#(F). An assumption that there is no correlation between the phenomina.
#(G). Construct a contingency table for sex and state and comment on any striking features.
table(HIV$sex, HIV$state) #Make a contingency table for state and sex
#Striking features- significantly more males than females
#(H). Perform an appropriate test.
my_data = HIV[,1:2] #Selects only the first two rows- all we need for the test
my_data #Check it selected the correct data
plot(my_data$sex,main="Sex",xlab="Sex",ylab="Patients")#Shows the data for M vs. F
plot(my_data$state,main="State",xlab="State",ylab="Patients")
data_table = table(my_data) #Table of the data
data_table
summary(data_table) #Summary of the data (Not neccesary)
prop.test(table(my_data$sex)) #Chi-square test of the data
#(I). Using a significance value of of 0.05 what would you conclude? 
#The P-value is <2.2e-16(Very small, well below 0.05) therefore it is not random, there is a correlation between HIV and gender in the data.
#(J). We are assuming that men and women are equally likely to get HIV. We are concluding that there is an even proportion of men and women in each state.







