/*
simulate rolling a pair of dice
Tyler Wong
12/01/2023
*/
#include <iostream>
#include <cstdlib>
#include <ctime>
int main() {
	//variables for 2 dice and total
	int die1=0;
	int die2=0;
	int dice=0;
	//sets each die to a random number between 1 and 6, sets total to the sum
	std::srand(std::time(nullptr));
	die1=(std::rand()%6)+1;
	die2=(std::rand()%6)+1;
	dice=die1+die2;
	//prints first die
	std::cout<<"first die - ";
	switch (die1) {
		case 1:
			std::cout<<"ONE"<<std::endl;
			break;
		case 2:
			std::cout<<"TWO"<<std::endl;
			break;
		case 3:
			std::cout<<"THREE"<<std::endl;
			break;
		case 4:
			std::cout<<"FOUR"<<std::endl;
			break;
		case 5:
			std::cout<<"FIVE"<<std::endl;
			break;
		case 6:
			std::cout<<"SIX"<<std::endl;
			break;
	}
	//prints second die
	std::cout<<"second die - ";
	switch (die2) {
		case 1:
			std::cout<<"ONE"<<std::endl;
			break;
		case 2:
			std::cout<<"TWO"<<std::endl;
			break;
		case 3:
			std::cout<<"THREE"<<std::endl;
			break;
		case 4:
			std::cout<<"FOUR"<<std::endl;
			break;
		case 5:
			std::cout<<"FIVE"<<std::endl;
			break;
		case 6:
			std::cout<<"SIX"<<std::endl;
			break;
	}
	//prints total
	std::cout<<"total - ";
	switch (dice) {
		case 1:
			std::cout<<"ONE"<<std::endl;
			break;
		case 2:
			std::cout<<"TWO"<<std::endl;
			break;
		case 3:
			std::cout<<"THREE"<<std::endl;
			break;
		case 4:
			std::cout<<"FOUR"<<std::endl;
			break;
		case 5:
			std::cout<<"FIVE"<<std::endl;
			break;
		case 6:
			std::cout<<"SIX"<<std::endl;
			break;
		case 7:
			std::cout<<"SEVEN"<<std::endl;
			break;
		case 8:
			std::cout<<"EIGHT"<<std::endl;
			break;
		case 9:
			std::cout<<"NINE"<<std::endl;
			break;
		case 10:
			std::cout<<"TEN"<<std::endl;
			break;
		case 11:
			std::cout<<"ELEVEN"<<std::endl;
			break;
		case 12:
			std::cout<<"TWELVE"<<std::endl;
			break;
	}
	return 0;
}
