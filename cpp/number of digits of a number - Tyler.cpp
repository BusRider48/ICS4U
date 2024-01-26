/*
number of digits of a number
Tyler Wong
12/08/2023
*/
#include <iostream>
//function to calculate number of digits
int numDigits(int N) {
	int acc=0;
	bool lock=false;
	while (lock==false) {
		N=N/10;
		acc++;
		if (N<1) {
			lock=true;
		}
	}
	return acc;
}
int main() {
	int num=0;
	int newNum=0;
	std::cout<<"enter a number"<<std::endl;
	std::cin>>num;
	newNum=numDigits(num);
	std::cout<<"the digits in this number is "<<newNum<<std::endl;
	return 0;
}
