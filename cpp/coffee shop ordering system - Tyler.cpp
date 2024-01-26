/*
coffee shop ordering system
Tyler Wong
12/05/2023
*/
#include <iostream>
#include <chrono>
#include <thread>
int main() {
	//variable for user input
	int num=0;
	bool lock=false;
	std::cout<<"coffee shop"<<std::endl;
	while (lock==false) {
		std::cout<<"\nmenu:\n1. Espresso\n2. Latte\n3. Cappuccino"<<std::endl;
		std::cout<<"\nenter the number of your order"<<std::endl;
		std::cin>>num;
		//outputs based on user input
		switch (num) {
			case 1:
				std::cout<<"preparing your espresso..."<<std::endl;
				std::this_thread::sleep_for(std::chrono::seconds(1));
				std::cout<<"enjoy"<<std::endl;
				break;
			case 2:
				std::cout<<"preparing your latte..."<<std::endl;
				std::this_thread::sleep_for(std::chrono::seconds(2));
				std::cout<<"enjoy"<<std::endl;
				break;
			case 3:
				std::cout<<"preparing your cappuccino..."<<std::endl;
				std::this_thread::sleep_for(std::chrono::seconds(3));
				std::cout<<"enjoy"<<std::endl;
				break;
		}
		std::cout<<"place another order?\n1 for yes, 2 for no"<<std::endl;
		std::cin>>num;
		//lets user restart or quit
		switch (num) {
			case 1:
				lock=false;
				break;
			case 2:
				lock=true;
				break;
		}
	}
	std::cout<<"enjoy your day"<<std::endl;
	return 0;
}
