/*
simulating a traffic light
Tyler Wong
12/05/2023
*/
#include <iostream>
#include <chrono>
#include <thread>
int main() {
	//variables to set time for each phase
	int green=15;
	int yellow=3;
	int red=30;
	//loops through each phase
	while (true) {
		std::cout<<"red"<<std::endl;
		std::this_thread::sleep_for(std::chrono::seconds(red));
		std::cout<<"green"<<std::endl;
		std::this_thread::sleep_for(std::chrono::seconds(green));
		std::cout<<"yellow"<<std::endl;
		std::this_thread::sleep_for(std::chrono::seconds(yellow));
	}
	return 0;
}
