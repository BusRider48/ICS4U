/*
change calculator
Tyler Wong
11/27/2023
*/
#include <iostream>
int main() {
	//variables for total change and individual coins
	int num=0;
	int quarters=0;
	int dimes=0;
	int nickels=0;
	int pennies=0;
	//user input for total change
	std::cout<<"enter amount of change (0-100)"<<std::endl;
	std::cin>>num;
	//ends program if the user gives an unwanted input
	if (num>100) {
		std::cout<<"invalid input"<<std::endl;
		return 0;
	}
	if (num<0) {
		std::cout<<"invalid input"<<std::endl;
		return 0;
	}
	//calculates individual change
	while (num>0) {
		if (num>=25) {
			num-=25;
			quarters++;
		}
		else if (num>=10) {
			num-=10;
			dimes++;
		}
		else if (num>=5) {
			num-=5;
			nickels++;
		}
		else if (num>=1) {
			num-=1;
			pennies++;
		}
	}
	std::cout<<"quarters: "<<quarters<<"\ndimes: "<<dimes<<"\nnickels: "<<nickels<<"\npennies: "<<pennies<<std::endl;
	return 0;
}
