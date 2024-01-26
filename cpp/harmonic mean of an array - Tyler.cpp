/*
harmonic mean of an array
Tyler Wong
12/06/2023
*/
#include <iostream>
int main() {
	//variables for array, total, average, counter
	float arr[8];
	float total=0;
	float average=0;
	int acc=8;
	int i=0;
	//gets user inputs
	for (i=0; i<8; i++) {
		std::cout<<"enter "<<acc<<" more numbers"<<std::endl;
		std::cin>>arr[i];
		acc--;
	}
	//gets total for calculating rate average
	for (i=0; i<8; i++) {
		arr[i]=1/arr[i];
		total+=arr[i];
	}
	//calculates and prints average
	average=total/8;
	average=1/average;
	std::cout<<"the rate average is "<<average<<std::endl;
	return 0;
}
