/*
volume and surface area of a cone
Tyler Wong
11/23/2023
*/
#include <iostream>
#include <cmath>
int main() {
	//variables for pi, radius, height, surface area, and volume
	float pi=3.14;
	float radius=0;
	float height=0;
	float surfaceArea=0;
	float volume=0;
	//gets user inputs
	std::cout<<"enter radius of the base of the cone"<<std::endl;
	std::cin>>radius;
	std::cout<<"enter height of the cone"<<std::endl;
	std::cin>>height;
	//calculates surface area and volume
	surfaceArea=pi*radius*(radius+sqrt((height*height)+(radius*radius)));
	volume=pi*(radius*radius)*(height/3);
	std::cout<<"the volume is "<<volume<<"\nthe surface area is "<<surfaceArea<<std::endl;
	return 0;
}
