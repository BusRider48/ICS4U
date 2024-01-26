/*
100m race simulator
Tyler Wong
11/29/2023
*/
#include <iostream>
int main() {
	//variables for seconds in race, distance per second, total distance
	int seconds=0;
	int distanceSec=0;
	int distance=0;
	//gets user input for distance travelled every second, increments seconds
	while (distance<100) {
		std::cout<<"how far has the runner travelled this second?"<<std::endl;
		std::cin>>distanceSec;
		distance+=distanceSec;
		seconds++;
	}
	std::cout<<"done"<<"\nyou finished the race in under "<<seconds<<" seconds"<<std::endl;
	return 0;
}
