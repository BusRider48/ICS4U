/*
TicTacToe game
Tyler Wong
01/15/2024
*/
import java.util.Scanner;
public class Main {
    public static void main(String[]main) {
		
		//variables for input, player number, check for draw, array for grid, toggle for cpu
        String inp;
        int player=1;
        int draw=0;
        int[] grid=new int[9];
        boolean cpu=false;
        boolean lock=false;
        boolean optionLock=false;
        boolean gameLock=false;
        System.out.println("------------------------------------\nTicTacToe\n------------------------------------");
		
		//main loop
        while (lock==false) {
			
			//options loop
            while (optionLock==false) {
                Scanner sc=new Scanner(System.in);
			System.out.println("you are in the options. to change a setting enter the setting name followed by what you want to change it to, seperated by a space (' ').\ntype 'done' to exit.\ncpu "+cpu);
                inp=sc.nextLine();
                if (inp.equals("done")) {
                    System.out.println("starting game");
                    optionLock=true;
                    break;
                }
                int space=inp.indexOf(" ");
                String settingName=inp.substring(0,space);
                String settingValue=inp.substring(space+1,inp.length());
                if (settingName.equals("cpu")) {
                    if (settingValue.equals("true")) {
                        cpu=true;
                    }
                    else if (settingValue.equals("false")) {
                        cpu=false;
                    }
                }
            }
			
			//game loop
            while (gameLock==false) {
				
				//outputs grid to screen
                for (int i=0; i<grid.length; i++) {
                    if (grid[i]==0) {
                        System.out.print("- ");
                    }
                    else if (grid[i]==1) {
                        System.out.print("x ");
                    }
                    else if (grid[i]==2) {
                        System.out.print("o ");
                    }
                    if (i==2) {
                        System.out.print("\n");
                    }
                    if (i==5) {
                        System.out.print("\n");
                    }
                    if (i==8) {
                        System.out.print("\n\n");
                    }
                    if (grid[i]!=0) {
                        draw++;
                    }
                }
				
				//win checks for player 1
                for (int i=0; i<grid.length; i++) {
					if (i==0&&grid[i]==1&&grid[i+4]==1&&grid[i+4+4]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==0&&grid[i]==1&&grid[i+1]==1&&grid[i+1+1]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==0&&grid[i]==1&&grid[i+3]==1&&grid[i+3+3]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==1&&grid[i]==1&&grid[i+3]==1&&grid[i+3+3]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==2&&grid[i]==1&&grid[i+2]==1&&grid[i+2+2]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==2&&grid[i]==1&&grid[i-1]==1&&grid[i-1-1]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==2&&grid[i]==1&&grid[i+3]==1&&grid[i+3+3]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==3&&grid[i]==1&&grid[i+1]==1&&grid[i+1+1]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==5&&grid[i]==1&&grid[i-1]==1&&grid[i-1-1]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==6&&grid[i]==1&&grid[i-2]==1&&grid[i-2-2]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==6&&grid[i]==1&&grid[i+1]==1&&grid[i+1+1]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==6&&grid[i]==1&&grid[i-3]==1&&grid[i-3-3]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==7&&grid[i]==1&&grid[i-3]==1&&grid[i-3-3]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==8&&grid[i]==1&&grid[i-4]==1&&grid[i-4-4]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==8&&grid[i]==1&&grid[i-1]==1&&grid[i-1-1]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (i==8&&grid[i]==1&&grid[i-3]==1&&grid[i-3-3]==1) {
						System.out.println("player 1 wins");
						gameLock=true;
						break;
					}
					else if (draw==9) {
						System.out.println("draw");
						gameLock=true;
					}
					else {
						draw=0;
					}
				}
				
				//win checks for player 2
				for (int i=0; i<grid.length; i++) {
					if (i==0&&grid[i]==2&&grid[i+4]==2&&grid[i+4+4]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==0&&grid[i]==2&&grid[i+1]==2&&grid[i+1+1]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==0&&grid[i]==2&&grid[i+3]==2&&grid[i+3+3]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==1&&grid[i]==2&&grid[i+3]==2&&grid[i+3+3]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==2&&grid[i]==2&&grid[i+2]==2&&grid[i+2+2]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==2&&grid[i]==2&&grid[i-1]==2&&grid[i-1-1]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==2&&grid[i]==2&&grid[i+3]==2&&grid[i+3+3]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==3&&grid[i]==2&&grid[i+1]==2&&grid[i+1+1]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==5&&grid[i]==2&&grid[i-1]==2&&grid[i-1-1]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==6&&grid[i]==2&&grid[i-2]==2&&grid[i-2-2]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==6&&grid[i]==2&&grid[i+1]==2&&grid[i+1+1]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==6&&grid[i]==2&&grid[i-3]==2&&grid[i-3-3]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==7&&grid[i]==2&&grid[i-3]==2&&grid[i-3-3]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==8&&grid[i]==2&&grid[i-4]==2&&grid[i-4-4]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==8&&grid[i]==2&&grid[i-1]==2&&grid[i-1-1]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (i==8&&grid[i]==2&&grid[i-3]==2&&grid[i-3-3]==2) {
						System.out.println("player 2 wins");
						gameLock=true;
						break;
					}
					else if (draw==9) {
						System.out.println("draw");
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
                    Scanner sc=new Scanner(System.in);
                    System.out.println("player 1");
                    inp=sc.nextLine();
                    if (grid[Integer.parseInt(inp)-1]==0) {
                        grid[Integer.parseInt(inp)-1]=1;
                        player=2;
                    }
                    else {
                        System.out.println("invalid move");
                        player=1;
                    }
                }
				
				//input for player 2 or cpu
                else if (player==2) {
                    if (cpu==true) {
                        inp=String.valueOf((int)((9-1+1)*Math.random()+1));
                        if (grid[Integer.parseInt(inp)-1]==0) {
                            grid[Integer.parseInt(inp)-1]=2;
                            player=1;
                        }
                        else {
                            player=2;
                        }
                    }
                    else {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("player 2");
                        inp=sc.nextLine();
                        if (grid[Integer.parseInt(inp)-1]==0) {
                            grid[Integer.parseInt(inp)-1]=2;
                            player=1;
                        }
                        else {
                            System.out.println("invalid move");
                            player=2;
                        }
                    }
                }
            }
			
			//allows the user to start a new game or quit
            Scanner sc=new Scanner(System.in);
            System.out.println("play again? y/n");
            inp=sc.nextLine();
            if (inp.equals("y")) {
				player=1;
				for (int i=0; i<grid.length; i++) {
					grid[i]=0;
				}
				draw=0;
                gameLock=false;
            }
            else {
                System.out.println("ending program");
                lock=true;
            }
        }
    }
}
