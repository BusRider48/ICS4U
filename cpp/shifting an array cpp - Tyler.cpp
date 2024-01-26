/*
shifting an array
Tyler Wong
12/06/2023
*/
#include <iostream>
int main() {
	//variables for array, shifted array, counter
	int arr[8];
	int newArr[8];
	int acc=8;
	int i=0;
	//gets inputs from user
	for (i=0; i<8; i++) {
		std::cout<<"enter "<<acc<<" more numbers"<<std::endl;
		std::cin>>arr[i];
		acc--;
	}
	//sets shifted array
	for (i=0; i<8; i++) {
		newArr[i+3]=arr[i];
		if (i>4) {
			newArr[i-5]=arr[i];
		}
	}
	//outputs shifted array
	for (i=0; i<8; i++) {
		std::cout<<newArr[i]<<std::endl;
	}
	return 0;
}
