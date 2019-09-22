#Importing libraries
library("ggpubr")
library("dplyr")

#Importing the data
conart_prices = read.table("conart_prices.txt", header = TRUE, sep = "\t")
str(conart_prices)

#Making sold (The 1 or 0) numeric so we can manipulate it
conart_prices$sold <- as.numeric(conart_prices$sold)

#Taking a look at the data structure
str(conart_prices) 

#Filtering the data so only sold artworks, sorting by price sold
sold_art = conart_prices %>% 
  filter(sold == 1) %>%
  arrange(desc(price))

#Showing the data
sold_art
conart_prices


#Summary of data
summary(sold_art)
summary(sold_art$price)

#Scatter plot of sale price
plot(sold_art$price,
     xlab="Position of work by value",
     ylab = "Sale price of work",
     main ="Price Plot of Sold Artworks")
#Histogram of sale price
hist(sold_art$price,
     breaks = 50,
     ylab = "Number of artworks sold",
     xlab = "Price of artwork sold",
     main = "Number of Works Sold By Price")
#boxplot of sale price
boxplot(sold_art$price)
#Making the average estimated price
sold_art$av_est = rowMeans(sold_art[c('low_est','high_est')], na.rm = TRUE)
sold_art$av_est
#Summary of the average estimated price
summary(sold_art$av_est)
#Histogram of avg. estimated price
hist(sold_art$av_est, 
     breaks = 50,
     ylab = "Number of artworks sold",
     xlab = "Estimated Price of artwork sold",
     main = "Number of Works Sold By Estimated Price")

#Scatter plot of real sale price against estimated sale price
plot(sold_art$av_est,sold_art$price,
     ylab = "Actual Sale Price",
     xlab = "Estimated Sale Price",
     main = "Scatter of Estimated Vs. Actual Sale Price")
#Creating and plotting line of best fit
best_fit = lm(sold_art$av_est ~ sold_art$price)
abline(best_fit)
#Adjusted model made from accounting for the underestimation of price.
#(coloured red)
adjust = lm(1/0.8462*sold_art$av_est ~ sold_art$price)
abline(adjust,
       col='red')
#Observing information on the line of best fit and adjusted line
best_fit
summary(best_fit)
adjust
#Observing correlation between the two datasets
cor(x= sold_art$av_est, y= sold_art$price)

