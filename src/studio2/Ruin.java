package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int totalSimulations = 500;
		int currentSimulation = 0;
		int totalWins = 0;
		int totalRuins = 0;
		int numPlays=0;
		System.out.println("Welcome to Casino");
		int StartAmount = 2;
		
		double winChance = 0.7;
		
		int winLimit = 10;
				
		int currentAmount = StartAmount;
		for (int i = 0; i < totalSimulations; i++)
		{
		numPlays=0;
		currentAmount=StartAmount;
		while (currentAmount < winLimit && currentAmount > 0)
		{
			if (Math.random()<=winChance)
			{
				currentAmount++;
			if (currentAmount==winLimit)
				{
				totalWins ++;
				System.out.println("Day: " + (i+1) + ", number: " + numPlays + " ended in success");
				}
			}
			else
				{
				currentAmount--;
				if (currentAmount == 0)
					{
					totalRuins++;
				System.out.println("Day: " + (i+1) + ", number: " + numPlays + " ended in ruin");
					}
				}
			numPlays++;
			}
		
	
		}
	double ruinRate = (Math.round(((double)totalRuins / totalSimulations)*100.0)/100.0);
	System.out.println("Simulated ruin rate: " + ruinRate);
	
		
		}

	}
	

