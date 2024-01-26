/*
numerical range sum/product calculator
Tyler Wong
11/29/2023
*/
#include <iostream>
int main() {
	//variables for starting value, ending value, sum of range, product of range
	int startVal=0;
	int endVal=0;
	int sum=0;
	int product=0;
	//user inputs for starting value, ending value
	std::cout<<"enter starting value"<<std::endl;
	std::cin>>startVal;
	std::cout<<"enter ending value"<<std::endl;
	std::cin>>endVal;
	//sets sum and product to the starting value
	sum=startVal;
	product=startVal;
	//takes the sum and product of all numbers from the second number to the final number
	for (int i=startVal+1; i<endVal+1; i++) {
		sum+=i;
		product*=i;
	}
	std::cout<<"the sum of the range is "<<sum<<"\nthe product of the range is "<<product<<std::endl;
	return 0;
}
