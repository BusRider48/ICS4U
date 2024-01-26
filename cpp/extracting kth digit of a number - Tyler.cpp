/*
extracting kth digit of a number
Tyler Wong
12/08/2023
*/
#include <iostream>
//function to calculate kth digit
int digit(int N,int k) {
	int Nn=0;
	for (int i=k; i>0; i--) {
		Nn=N%10;
		N=N-Nn;
		N=N/10;
	}
	return (Nn);
}
int main() {
	int num1=0;
	int num2=0;
	int newNum=0;
	std::cout<<"enter a number"<<std::endl;
	std::cin>>num1;
	std::cout<<"enter another number"<<std::endl;
	std::cin>>num2;
	newNum=digit(num1,num2);
	std::cout<<"the digit is "<<newNum<<std::endl;
	return 0;
}
