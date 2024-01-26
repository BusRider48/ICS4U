/*
leap year checker
Tyler Wong
11/27/2023
*/
#include <iostream>
int main() {
	//variable for year and whether or not it is a leap year
	int year=0;
	bool leapYear=false;
	//user input for year
	std::cout<<"enter a year"<<std::endl;
	std::cin>>year;
	//ends the program if the user enters a negative number
	if (year<0) {
		std::cout<<"this is an invalid year"<<std::endl;
		return 0;
	}
	//calculates leap year
	else {
		if (year%4==0) {
			leapYear=true;
			if (year%100==0) {
				leapYear=false;
				if (year%400==0) {
					leapYear=true;
				}
			}
		}
	}
	if (leapYear==true) {
		std::cout<<"this is a leap year"<<std::endl;
	}
	else if (leapYear==false) {
		std::cout<<"this is not a leap year"<<std::endl;
	}
	return 0;
}
