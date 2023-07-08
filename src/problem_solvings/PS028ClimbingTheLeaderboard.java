package problem_solvings;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class PS028ClimbingTheLeaderboard {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int[] scores = new int[n];
			int[] ranks = new int[n]; //The dense ranking of the scores
			
			//Initialize dense ranking and scores
			for(int i=0, rank=1; i < n; i++){
			    int s = in.nextInt();
			    scores[i] = s;
			    if(i > 0 && scores[i-1] != s)
			        rank++;
			    ranks[i] = rank;    
			}
			
			//Interate over Alice's level scores
			//int level = 0;
			int aliceRank = ranks[ranks.length-1] + 1; //Set it to worst rank+1
			int leaderboardIndex = n-1;
			int m = in.nextInt();
			
			int prevScore = -1; //Last score we saw
			
			for(int aliceScores=0; aliceScores < m; aliceScores++)
			{
			    int levelScore = in.nextInt();
			
			    //We iterate 1 past the front of the array incase we are greater than the best score
			    for(int i = leaderboardIndex; i >= -1; i--)
			    {
			        if(i < 0 || scores[i] > levelScore)
			        {
			            System.out.println(aliceRank);
			            break;
			        }
			        else if(scores[i] < levelScore)
			        {
			            if(scores[i] != prevScore)//We have went up a ranking
			            {
			                aliceRank--;    
			            }
			            leaderboardIndex--;
			        }
			        else//scores[i] == alice[level]
			        {
			            leaderboardIndex--;
			            aliceRank = ranks[i];
			        }
			        prevScore = scores[i];
			    }
			}
		}

//		Scanner masukan = new Scanner(System.in);
//
//		System.out.print("Masukkan banyaknya player pada leaderboard: ");
//		Integer n = masukan.nextInt();
//		masukan.nextLine();
//
//		System.out.print("Masukkan skor leaderboard: ");
//		String[] rankedStr = masukan.nextLine().split(" ");
//
//		List<Integer> ranked = new ArrayList<>();
//
//		for (int i = 0; i < n; i++) {
//			ranked.add(Integer.parseInt(rankedStr[i]));
//		}
//
//		System.out.print("Masukkan banyaknya skor player: ");
//		Integer m = masukan.nextInt();
//		masukan.nextLine();
//
//		System.out.print("Masukkan skor player: ");
//		String[] playerStr = masukan.nextLine().split(" ");
//
//		List<Integer> player = new ArrayList<>();
//
//		for (int i = 0; i < m; i++) {
//			player.add(Integer.parseInt(playerStr[i]));
//		}
//
//		// =============================================================
//
//		System.out.println("Leaderboard Then: " + ranked);
//
//		List<Integer> rank = new ArrayList<>();
//
//		for (int i = 0; i < player.size(); i++) {
//			int count = 0;
//			for (int j = 0; j < ranked.size(); j++) {
//				if (player.get(i) < ranked.get(j)) {
//					if (j == ranked.size() - 1) {
//						
//					} else
//					if (ranked.get(j) == ranked.get(j + 1)) {
//						count++;
//					}
//					if (j == ranked.size() - 1 || player.get(i) > ranked.get(j + 1)) {
//						rank.add(j + 2 - count);
//						ranked.add(j + 1, player.get(i));
//						j += 1;
//					}
//				} else
//
//				if (player.get(i) > ranked.get(j)) {
//					if (player.get(i) > ranked.get(0)) {
//						rank.add(1);
//						ranked.add(0, player.get(i));
//					}
//				} else
//
//				if (player.get(i) == ranked.get(j)) {
//					if (j == ranked.size() - 1) {
//						
//					} else
//					if (ranked.get(j) == ranked.get(j + 1)) {
//						count++;
//					}
//					if (player.get(i) != ranked.get(j + 1)) {
//						rank.add(j + 1 - count);
//						ranked.add(j, player.get(i));
//						j += 1;						
//					}
//				}
//
//			}
//		}
//
//		System.out.println("Leaderboard Now: " + ranked);
//
//		System.out.println("Your Rank: " + rank);

//		List<Integer> rankedNoDupe = new ArrayList<>();
//		String helper = "";
//
//		for (int i = 0; i < ranked.size(); i++) {
//			String helper2 = Integer.toString(ranked.get(i));
//			if (!(helper.equals(helper2))) {
//				helper = helper2;
//				rankedNoDupe.add(ranked.get(i));
//			}
//		}
//
//		System.out.println("Leaderboard No Dupe Then: " + rankedNoDupe);
//
//		List<Integer> rank = new ArrayList<>();
//
//		for (int i = 0; i < player.size(); i++) {
//			for (int j = 0; j < rankedNoDupe.size(); j++) {
//				if (player.get(i) < rankedNoDupe.get(j)) {
//					if (j == rankedNoDupe.size() - 1
//							|| player.get(i) > rankedNoDupe.get(j + 1)) {
//						rank.add(j + 2);
//						rankedNoDupe.add(j + 1, player.get(i));
//						j += 1;
//					}
//				} else
//
//				if (player.get(i) > rankedNoDupe.get(j)) {
//					if (player.get(i) > rankedNoDupe.get(0)) {
//						rank.add(1);
//						rankedNoDupe.add(0, player.get(i));
//					}
//				} else
//				
//				if (player.get(i) == rankedNoDupe.get(j)) {
//					rank.add(j + 1);
//				}
//				
//			}
//		}
//
//		System.out.println("Leaderboard No Dupe Now: " + rankedNoDupe);
//
//		System.out.println("Your Rank: " + rank);

	}
}
