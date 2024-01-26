/*
factorial of a number
Tyler Wong
12/08/2023
*/
#include <iostream>
//function to calculate factorial
int factorial(int num) {
	for (int i=num-1; i>0; i--) {
		num*=i;
	}
	return num;
}
int main() {
	int num=0;
	int newNum=0;
	std::cout<<"enter a number"<<std::endl;
	std::cin>>num;
	newNum=factorial(num);
	std::cout<<"the factorial of this number is "<<newNum<<std::endl;
	return 0;
}
