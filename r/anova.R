group1 = c(2,3,7,2,6)
group2 = c(10,8,7,5,10)
group3 = c(10,13,14,13,15)

Combined_Groups = data.frame(cbind(group1,group2,group3)) # combines data into a single set
Combined_Groups #Shows spreadsheet like data
summary(Combined_Groups) #shows min, median, mean and max

Stacked_Groups = stack(Combined_Groups) 
Stacked_Groups #Displays the data of the table

Anova_Results = aov(values ~ ind, data = Stacked_Groups) #Performs ANOVA
summary(Anova_Results) #Shows the Anova results

#In this case the results would be presented as F(2,12) = 22.59, p<.05
#As P<0.5 this shows that the data is significant
#P=0.0000854 (Very small)

