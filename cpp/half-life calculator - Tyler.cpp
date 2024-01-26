/*
half-life calculator
Tyler Wong
11/24/2023
*/
#include <iostream>
#include <cmath>
int main() {
	//variables for remaining quantity after time elapsed, initial quantity, time elapsed, and the half-life of the substance
	float Nt=0;
	float Ni=0;
	float t=0;
	float T=0;
	//gets input from user
	std::cout<<"enter the initial quantity of the substance"<<std::endl;
	std::cin>>Ni;
	std::cout<<"enter the time elapsed"<<std::endl;
	std::cin>>t;
	std::cout<<"enter the half-life of the substance"<<std::endl;
	std::cin>>T;
	//calculates the remaining quantity
	Nt=Ni*pow(0.5,(t/T));
	std::cout<<"the remaining quantity of the substance is "<<Nt<<std::endl;
	return 0;
}
