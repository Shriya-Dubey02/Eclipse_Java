package MockProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VotingSystem {
	
	static class Candidate
	{
		String name;
		String partyName;
		int votes;
		
		public Candidate(String name, String partyName) {
			this.name=name;
			this.partyName=partyName;
			this.votes=0;
			
		}
		// method
		void incrementVotes()
		{
			votes++;
		}
		
		int getVotes() 
		{
			return votes;
			
		}
		String getName()
		{
			return name;
		}
		String getPartyName()
		{
			return partyName;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		List<Candidate> candidate= new ArrayList<>();
		Set<Integer> votedUser= new HashSet<Integer>();
		
		candidate.add(new Candidate("Manish", "A"));
		candidate.add(new Candidate("Hari", "B"));
		candidate.add(new Candidate("Navneet", "C"));
		candidate.add(new Candidate("Swati", "D"));
		
		while(true)
		{
			System.out.println("Voting System");
			System.out.println("1. Vote");
			System.out.println("2. Show Results");
			System.out.println("3. Exit");
			int choice= sc.nextInt();
			
			if(choice==1)
			{
				vote(sc,candidate, votedUser);
			}
			else if(choice==2)
			{
				showResults(candidate);
			} 
			else if(choice==3)
			{
				System.out.println("Exiting the system");
				break;
			}
			else
			{
				System.out.println("Invalid choice, please try again");
			}
		}
		sc.close();
		
	}
	
	private static void vote(Scanner sc, List<Candidate> candidate,Set<Integer> votedUser)
	{
		System.out.println("Enter your voter Id: ");
		int voterId=sc.nextInt();
		
		System.out.println("Candidates: ");
		for(int i=0;i< candidate.size();i++)
		{
			System.out.println((i+1)+"."+candidate.get(i).getName()+" ("+candidate.get(i).getPartyName()+" )");
		}
		
		System.out.println("Enter the number of candidate you want to vote");
		int candidateChoice=sc.nextInt();
		
		if(candidateChoice<1 || candidateChoice > candidate.size())
		{
			System.out.println("invalid choice");
		}
		else {
			candidate.get(candidateChoice - 1).incrementVotes();
			votedUser.add(voterId);
			System.out.println("Your vote has been recorded. Thank you for voting!!");
		}
	}
// to show the result
	private static void showResults(List<Candidate> candidate) {
		System.out.println("Results: ");
		for(Candidate c:candidate)
		{
			System.out.println(c.getName()+" - "+c.getPartyName()+" : "+c.getVotes());
		}
	}
}
