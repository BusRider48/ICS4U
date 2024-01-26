/*
cost of paint calculator
Tyler Wong
11/23/2023
*/
#include <iostream>
int main() {
	//variables for length, width, height, surface area, amount a bucket covers, cost per bucket, total buckets, and total cost
	int length=0;
	int width=0;
	int height=0;
	int surfaceArea=0;
	int paintMax=0;
	int paintCost=0;
	int buckets=0;
	int cost=0;
	//gets user inputs
	std::cout<<"enter length of room"<<std::endl;
	std::cin>>length;
	std::cout<<"enter width of room"<<std::endl;
	std::cin>>width;
	std::cout<<"enter height of room"<<std::endl;
	std::cin>>height;
	std::cout<<"enter painted room per bucket"<<std::endl;
	std::cin>>paintMax;
	std::cout<<"enter cost of paint"<<std::endl;
	std::cin>>paintCost;
	//calculates total buckets and cost
	surfaceArea=((length*height)*2)+((width*height)*2)+((length*width)*2);
	buckets=surfaceArea/paintMax;
	cost=buckets*paintCost;
	std::cout<<"you need "<<buckets<<" buckets, costing "<<cost<<std::endl;
	return 0;
}
