/*
TicTacToe game c++
Tyler Wong
01/21/2024
*/
#include <iostream>
#include <cstdlib>
#include <ctime>
int main() {
	
	//variables for player input, size of the grid, player indicator, draw counter
	int inp=0;
	int gridSize=5;
	int player=1;
	int draw=0;
	bool lock=false;
	bool optionLock=false;
	bool gameLock=false;
	std::cout<<"------------------------------------\nTicTacToe (but better)\n------------------------------------"<<std::endl;
	
	//main loop
	while (lock==false) {
		
		//options loop
		while (optionLock==false) {
			std::cout<<"you are in the options.\nenter '0' to exit.\nenter any number above 4 to change the grid size. grid: "<<gridSize<<std::endl;
			std::cin>>inp;
			if (inp==0) {
				std::cout<<"starting program"<<std::endl;
				optionLock=true;
				break;
			}
			else if (inp>4) {
				gridSize=inp;
			}
		}
		
		//generates array for grid
		int grid[gridSize*gridSize];
		for (int i=0; i<gridSize*gridSize; i++) {
			grid[i]=0;
		}
		
		//game loop
		while (gameLock==false) {
			
			//draws grid to screen
			for (int i=1; i<=gridSize*gridSize; i++) {
				if (grid[i-1]==0) {
					std::cout<<"- ";
				}
				else if (grid[i-1]==1) {
					std::cout<<"x ";
				}
				else if (grid[i-1]==2) {
					std::cout<<"o ";
				}
				if (i%gridSize==0) {
					std::cout<<std::endl;
				}
				if (grid[i]!=0) {
					draw++;
				}
			}
			std::cout<<std::endl;
			
			//win conditions for player 1
			for (int i=0; i<gridSize*gridSize; i++) {
				if (grid[i]==1) {
					
					//horizontal win
					if (grid[i+1]==1&&i+1<gridSize*gridSize&&(i+1)%gridSize!=0) {
						if (grid[i+2]==1&&i+2<gridSize*gridSize&&(i+2)%gridSize!=0) {
							if (grid[i+3]==1&&i+3<gridSize*gridSize&&(i+3)%gridSize!=0) {
								std::cout<<"player 1 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
					
					//vertical win
					else if (grid[i+gridSize]==1&&i+gridSize<gridSize*gridSize) {
						if (grid[i+(2*gridSize)]==1&&i+(2*gridSize)<gridSize*gridSize) {
							if (grid[i+(3*gridSize)]==1&&i+(3*gridSize)<gridSize*gridSize) {
								std::cout<<"player 1 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
					
					//diagonal right win
					else if (grid[i+gridSize+1]==1&&i+gridSize+1<gridSize*gridSize&&(i+gridSize+1)%gridSize!=0) {
						if (grid[i+(2*gridSize)+2]==1&&i+(2*gridSize)+2<gridSize*gridSize&&(i+(2*gridSize)+2)%gridSize!=0) {
							if (grid[i+(3*gridSize)+3]==1&&i+(3*gridSize)+3<gridSize*gridSize&&(i+(3*gridSize)+3)%gridSize!=0) {
								std::cout<<"player 1 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
					
					//diagonal left win
					else if (grid[i+gridSize-1]==1&&i+gridSize-1<gridSize*gridSize&&(i+gridSize)%gridSize!=0) {
						if (grid[i+(2*gridSize)-2]==1&&i+(2*gridSize)-2<gridSize*gridSize&&(i+(2*gridSize)-1)%gridSize!=0) {
							if (grid[i+(3*gridSize)-3]==1&&i+(3*gridSize)-3<gridSize*gridSize&&(i+(2*gridSize)-2)%gridSize!=0) {
								std::cout<<"player 1 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
				}
				
				//draw, resets draw counter if there is no draw
				else if (draw==gridSize*gridSize) {
					std::cout<<"draw"<<std::endl;
					gameLock=true;
				}
				else {
					draw=0;
				}
			}
			
			//player 2 win conditions
			for (int i=0; i<gridSize*gridSize; i++) {
				if (grid[i]==2) {
					
					//horizontal win
					if (grid[i+1]==2&&i+1<gridSize*gridSize&&(i+1)%gridSize!=0) {
						if (grid[i+2]==2&&i+2<gridSize*gridSize&&(i+2)%gridSize!=0) {
							if (grid[i+3]==2&&i+3<gridSize*gridSize&&(i+3)%gridSize!=0) {
								std::cout<<"player 2 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
					
					//vertical win
					else if (grid[i+gridSize]==2&&i+gridSize<gridSize*gridSize) {
						if (grid[i+(2*gridSize)]==2&&i+(2*gridSize)<gridSize*gridSize) {
							if (grid[i+(3*gridSize)]==2&&i+(3*gridSize)<gridSize*gridSize) {
								std::cout<<"player 2 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
					
					//diagonal right win
					else if (grid[i+gridSize+1]==2&&i+gridSize+1<gridSize*gridSize&&(i+gridSize+1)%gridSize!=0) {
						if (grid[i+(2*gridSize)+2]==2&&i+(2*gridSize)+2<gridSize*gridSize&&(i+(2*gridSize)+2)%gridSize!=0) {
							if (grid[i+(3*gridSize)+3]==2&&i+(3*gridSize)+3<gridSize*gridSize&&(i+(3*gridSize)+3)%gridSize!=0) {
								std::cout<<"player 2 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
					
					//diagonal left win
					else if (grid[i+gridSize-1]==2&&i+gridSize-1<gridSize*gridSize&&i+gridSize%gridSize!=0) {
						if (grid[i+(2*gridSize)-2]==2&&i+(2*gridSize)-2<gridSize*gridSize&&i+gridSize%gridSize!=0) {
							if (grid[i+(3*gridSize)-3]==2&&i+(3*gridSize)-3<gridSize*gridSize&&i+gridSize%gridSize!=0) {
								std::cout<<"player 2 wins"<<std::endl;
								gameLock=true;
								break;
							}
						}
					}
				}
				
				//draw, resets draw counter if there is no draw
				else if (draw==gridSize*gridSize) {
					std::cout<<"draw"<<std::endl;
					gameLock=true;
				}
				else {
					draw=0;
				}
			}
			
			if (gameLock==true) {
				break;
			}
			
			//input for player 1
			if (player==1) {
				std::cout<<"player 1"<<std::endl;
				std::cin>>inp;
				if (grid[inp-1]==0) {
					grid[inp-1]=1;
					player=2;
				}
				else {
					std::cout<<"invalid move"<<std::endl;
					player=1;
				}
			}
			
			//input for player 2
			else if (player==2) {
				std::cout<<"player 2"<<std::endl;
				std::cin>>inp;
				if (grid[inp-1]==0) {
					grid[inp-1]=2;
					player=1;
				}
				else {
					std::cout<<"invalid move"<<std::endl;
					player=2;
				}
			}
		}
		
		//allows the user to play again or exit the program
		std::cout<<"play again?\nenter '0' to start a new game.\nenter '1' to end program."<<std::endl;
		std::cin>>inp;
		if (inp==0) {
			player=1;
			for (int i=0; i<gridSize*gridSize; i++) {
				grid[i]=0;
			}
			draw=0;
			gameLock=false;
		}
		else {
			std::cout<<"ending program"<<std::endl;
			lock=true;
		}
	}
	return 0;
}
