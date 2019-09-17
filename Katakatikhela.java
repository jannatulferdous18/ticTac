package Game;

import java.util.Scanner;


public class Katakatikhela {
public static void main(String [] args){
    char a[][]={{'7','|','8','|','9'},{'-','-','-','-','-'},{'4','|','5','|','6'},{'-','-','-','-','-'},{'1','|','2','|','3'}};
    //int i,j;
 /*   for(i=0;i<5;i++)
    {
    	for(j=0;j<5;j++)
    	{
                System.out.print(""+a[i][j]);
    		}
    	System.out.println();
    }*/

    char win[][]=new char[10][10];
  int i,c,j,k=0,l=0,g,p=1,turn=0,flag=1,player=0,option;
    Scanner sc=new Scanner(System.in);


   System.out.print("\t\t\t\t   WELCOME\n");


   for(i=0;i<5;i++)
   {
   	for(j=0;j<5;j++)
   	{
               System.out.print(""+a[i][j]);
   		}
   	System.out.println();
   }
    for(; ;)
    {

                 if(p>2)
                 {
                        p=1;
                 }
               System.out.print("\nPlayer "+p + ": ");
               turn=sc.nextInt();
               System.out.print("\n\n\n\n");
               if(turn==1 && a[4][0]=='1')
               {
                          if(p==1){
                          a[4][0]='O';
                          win[2][0]='O';
                          l++;
                          }
                          else{
                          a[4][0]='X';
                          win[2][0]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
               System.out.print("\n");
                     p++;
               }
               
              else if(turn==4 && a[2][0]=='4')
               {
                          if(p==1){
                          a[2][0]='O';
                          win[1][0]='O';
                          l++;
                          }
                          else{
                          a[2][0]='X';
                          win[1][0]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");

                                                   p++;

               }
               else if(turn==7 && a[0][0]=='7')
               {
                          if(p==1){
                          a[0][0]='O';
                          win[0][0]='O';
                          l++;
                          }
                          else{
                          a[0][0]='X';
                          win[0][0]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");
                                                   p++;

               }
              else if(turn==2 && a[4][2]=='2')
               {
                          if(p==1){
                          a[4][2]='O';
                          win[2][1]='O';
                          l++;
                          }
                          else{
                          a[4][2]='X';
                          win[2][1]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");
                                                 p++;

               }
              else if(turn==5 && a[2][2]=='5')
               {
                          if(p==1){
                          a[2][2]='O';
                          win[1][1]='O';
                          l++;
                          }
                          else{
                          a[2][2]='X';
                          win[1][1]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");
                                                   p++;

               }
              else if(turn==8 && a[0][2]=='8')
               {
                          if(p==1){
                          a[0][2]='O';
                          win[0][1]='O';
                          l++;
                          }
                          else{
                          a[0][2]='X';
                          win[0][1]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");
                  p++;


               }
             else  if(turn==3 && a[4][4]=='3')
               {
                          if(p==1){
                          a[4][4]='O';
                          win[2][2]='O';
                          l++;
                          }
                          else{
                          a[4][4]='X';
                          win[2][2]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");
                                                   p++;


               }
              else if(turn==6 && a[2][4]=='6')
               {
                          if(p==1){
                          a[2][4]='O';
                          win[1][2]='O';
                          l++;
                          }
                          else{
                          a[2][4]='X';
                          win[1][2]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");
                    p++;


               }
             else  if(turn==9 && a[0][4]=='9')
               {
                          if(p==1){
                          a[0][4]='O';
                          win[0][2]='O';
                          l++;
                          }
                          else{
                          a[0][4]='X';
                          win[0][2]='X';
                          l++;
                          }
                          for(i=0;i<5;i++)
                          {
                          	for(j=0;j<5;j++)
                          	{
                                      System.out.print(""+a[i][j]);
                          		}
                          	System.out.println();
                          }
                  System.out.print("\n");

                                        p++;

               }

               else { System.out.printf("wrong keyword pressed ");}
               System.out.printf("\n\n\n");


               for(i=0;i<3;i++)
               {
                   flag=1;
                   for(j=0;j<3;j++)
                   {

                       if((win[i][j]=='O' && win[i+1][j]=='O' && win[i+2][j]=='O') || (win[i][j]=='O' && win[i][j+1]=='O' && win[i][j+2]=='O') || (win[0][0]=='O' && win[1][1]=='O' && win[2][2]=='O') || ( win[0][2]=='O' && win[1][1]=='O' && win[2][0]=='O'))
                       {
                           flag=0;
                           player=1;
                       }
                      else  if(win[i][j]=='X' && win[i+1][j]=='X' && win[i+2][j]=='X' || win[i][j]=='X' && win[i][j+1]=='X' && win[i][j+2]=='X' || win[0][0]=='X' && win[1][1]=='X' && win[2][2]=='X' || win[0][2]=='X' && win[1][1]=='X' && win[2][0]=='X')
                       {
                           flag=0;
                           player=2;
                       }

                   }
                   if(flag==0)
                   break;
               }
                 if(flag==0)
               {
                  System.out.printf("Player %d  Won\n",player);
                   break;
               }

            else if(l==9)
            {
                System.out.printf("Game is drawn\n");
               break;
            }

        }
}
}

