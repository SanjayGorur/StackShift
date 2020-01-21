import java.util.Deque;
import java.util.LinkedList;

public class StacksChallenge
{

	public static void main(String[] args) 
	{
		Deque<Integer> evens = new LinkedList<Integer>();
        Deque<Integer> odds =  new LinkedList<Integer>();
        Deque<Integer> comb = new LinkedList<Integer>();
        
        evens.push(42);
        evens.push(34);
        evens.push(18);
        evens.push(10);
        evens.push(2);
        
        odds.push(31);
        odds.push(23);
        odds.push(13);
        odds.push(7);
        odds.push(3);
        
        System.out.println(evens);
        System.out.println(odds);
        
        Deque<Integer> newEvens =  new LinkedList<Integer>(evens);
        Deque<Integer> newOdds =  new LinkedList<Integer>(odds);
        
        while(newEvens.isEmpty() == false || newOdds.isEmpty() == false)
        {
        	if(newEvens.isEmpty() && !newOdds.isEmpty())
        	{
        		comb.push(newOdds.pop());
        	}
        	
        	if(!newEvens.isEmpty() && newOdds.isEmpty())
        	{
        		comb.push(newEvens.pop());
        	}
        	
        	if(newEvens.isEmpty() == false && newOdds.isEmpty() == false)
        	{
        		if(newEvens.peek().compareTo(newOdds.peek()) > 0)
        		{
        			comb.push(newOdds.pop());
        		}
        		
        		else
        		{
        			comb.push(newEvens.pop());
        		}
        	}
        }
       
        Deque<Integer> copy = new LinkedList<>(comb);
        comb.clear();
        while(copy.isEmpty() == false)
        {
        	comb.push(copy.pop());
        }
        
        System.out.println(comb);
	}

}
