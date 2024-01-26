/*
quadratic equation solver
Tyler Wong
11/27/2023
*/
#include <iostream>
#include <cmath>
int main() {
	//variables for quadratic formula
	float a=0;
	float b=0;
	float c=0;
	float discriminant=0;
	int solutions=0;
	//user input
	std::cout<<"enter a value"<<std::endl;
	std::cin>>a;
	std::cout<<"enter b value"<<std::endl;
	std::cin>>b;
	std::cout<<"enter c value"<<std::endl;
	std::cin>>c;
	discriminant=(b*b)-2*a*c;
	//calculates number of solutions
	if (discriminant>0) {
		std::cout<<"2 real solutions"<<std::endl;
		solutions=2;
	}
	else if (discriminant==0) {
		std::cout<<"1 real solutions"<<std::endl;
		solutions=1;
	}
	else if (discriminant<0) {
		std::cout<<"0 real solutions"<<std::endl;
		solutions=0;
	}
	//calculates solutions
	if (solutions==2) {
		std::cout<<(-1*b+sqrt(discriminant))/(2*b)<<std::endl;
		std::cout<<(-1*b-sqrt(discriminant))/(2*b)<<std::endl;
	}
	else if (solutions==1) {
		std::cout<<(-1*b)/(2*b)<<std::endl;
	}
	return 0;
}
