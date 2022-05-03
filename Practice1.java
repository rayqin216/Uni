package practice;

import java.util.*;
import java.io.*;

public class P1 {
	
	public int[] GenerateArray()
	{
		int size = 5;
		
		int apple[] = new int[size];
		if(size > 0)
		{
			for(int x = 0; x < size; x++)
			{
				apple[x] = (int)(Math.random() * 100);
			}
		}
		else
		{
			GenerateArray();
		}
		return apple;
	}

	public void Task84() {
		Scanner console = new Scanner(System.in);
		System.out.println("please enter a string with more than 3 characters");
		String input = "";
		String result = "";
		do {
			input = console.nextLine();
		} while (input.length() < 3);
		int inputsize = input.length();
		for (int x = inputsize - 1; x > inputsize - 4; x--) {
			String add = input.substring(x);
			result = add + input + add;
		}
		System.out.println(result);

	}

	public void Task85() 
	{
		Scanner console = new Scanner(System.in);
		System.out.println("The word you want to check");
		String check = console.nextLine().toLowerCase();
		System.out.println("The sentence you want to check");
		String example = console.nextLine().toLowerCase();
		int checksize = check.length();
		Queue<Character> apple = new LinkedList<Character>();
		for(int x = 0; x < checksize; x++)
		{
			char c = check.charAt(x);
			apple.add(c);
		}
		boolean test = true;
		int count = 0;
		do
		{
			char d = example.charAt(count);
			if(d == apple.peek())
			{
				apple.poll();
			}
			else
			{
				test = false;
			}
			count++;
		}while(test == true && apple.size() != 0);
		System.out.println("the word is the first work: " + test);

	}
	
	public void Task86()
	{
		Scanner console = new Scanner(System.in);
		System.out.println("enter n");
		int n = Integer.parseInt(console.nextLine());
		int result = n;
		int count = 0; 
		do
		{
			if(result % 2 == 0)
			{
				result = result/2;
				count++;
			}
			else 
			{
				result = (result * 3 + 1) / 2; 
				count++; 
			}
		}while(result != 1);
		System.out.println("number of steps taken: " + count);
		
	}
	
	public void Task87() //read digits of a integer 
	{
		System.out.println("enter a number"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		try
		{
		   String sample = br.readLine();
		   char[] number = sample.toCharArray();
		   for(int x = 0; x < number.length; x++)
		   {
			   sum += number[x] - '0';
		   }
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		System.out.println("sum is:" + sum);
		
	}
	
	public void Task88() //get system environment
	{
		System.out.println(System.getenv());
		System.out.println(System.getProperties());
	}
	
	public void Task92(int[] array)
	{
		int odd = 0;
		int even = 0;
		for(int x = 0; x < array.length; x++)
		{
			if(array[x] % 2 == 0 && array[x] != 0)
			{
				even++;
			}
			else if(array[x] % 2 != 0 && array[x] != 0)
			{
				odd++;				
			}
		}
		System.out.println("nummber of odd number: " + odd + "\nnumber of even number: " + even);
	}
	
	public void Task94() //sorting odd at beginning, even at end
	{
		int[] test = GenerateArray();
		System.out.println("original: " + Arrays.toString(test));
		int y = 0;
	    while(y < test.length && test[y] % 2 == 0)
	        y++;
	              
	    for(int j = y + 1; j < test.length; j++) {
	        if(test[j] % 2 != 0) {
	            int temp = test[y];
	            test[y] = test[j];
	            test[j] = temp;
	            y++;
	        }
	    } 
		for(int i: test)
		{
			System.out.print(i + "," );
		}
		System.out.println();
		
	}
	
	public void Task95()
	{
		String[] array = new String[6];
		int y = 0;
		for(int x = 0; x < array.length; x++)
		{
		
			String r = Integer.toString(y);
			array[x] = r;
			y++;			
		}
		System.out.println("the array: " + Arrays.toString(array));
		
	}
	
	public void Task96()
	{
		int[] array = {1,20,3,4,5,10,20};
		System.out.println("the array: " + Arrays.toString(array));
		boolean ten = false;
		int tenposition = 0;
		boolean notten = false;
		int nottenposition = 0;
		boolean result = false;
		for(int x = 0; x < array.length; x++)
		{
			if(array[x] == 10)
			{
				tenposition = x;
				ten = true;
			}
			else if(array[x] == 20)
			{
				nottenposition = x;
				notten = true;
			}	
		}
		if(tenposition < nottenposition)
		{
			result = true;
		}
		else 
		{
			result = false;
		}
		if(ten == true && notten == true)
		{
			System.out.println("Is there a ten in the array: " + ten);
			System.out.println("Is there a twenty in the array: " + notten);
			System.out.println("Is 20 after 10 in the array: " + result);
		}
		else if(ten == true && notten != true)
		{
			System.out.println("Is there a ten in the array: " + ten);
			System.out.println("Is there a twenty in the array: " + notten);
		}
		else
		{
			System.out.println("ten in the array: " + ten);
		}


	}
	
	public void Task97(int n)
	{
		boolean result1 = false;
		boolean result2 = false;
		int apple[] = {2,1,3,6,2,3,2};
		if(apple.length < 3)
		{
			System.out.println("Error");
		}
		else
		{
			for(int x = 0; x < apple.length -1; x++)
			{
				if( x < apple.length - 2 && apple[x] == n)
				{
					if(apple[x +1] == n && apple[x +2] == n)
					{
						result1= true;
						result2 =true;
					}				
					else if(apple[x +1] != n && apple[x +2] == n)
					{
						result2 =true;
					}
					else if(apple[x +1] == n && apple[x +2] != n)
					{
						result1 =true;
					}		
				}
				else if( x == apple.length -2 && apple[x] == n)
				{
					if(apple[x +1] == n)
					{
						result1= true;
					}			
				}
			}
		}
			System.out.println("There is" + n + "next to each other? " + result1);
			System.out.println("There is" + n + "one element apart from each other? " + result2);
	}
	
	public void Task98()
	{
		int count = 0;
		boolean result = false;
		int[] apple = {1, 20, 3, 5, 10, 20, 21};
		System.out.println(Arrays.toString(apple));
		if(apple.length >= 2)
		{
			for(int x =0; x < apple.length; x++)
			{
				if(apple[x] == 20 && x < apple.length -1)
				{
					count++;
					if(apple[x +1] == 20)
					{
						result = true;
					}
					
				}
				else if(apple[x] == 20 && x == apple.length -1)
				{
					count++;
				}
			}
			System.out.println("20 appeared " + count + " times.");
			System.out.println("Are there 20s next to each other: " + result);

		}
		else
		{
			System.out.println("Error in array size");
		}	
	}
	
	public void Task99(int n)
	{
		int[] apple = {3,2,13,4,5,1};
		boolean result = false;
		for(int x = 0; x < apple.length - 1; x++)
		{
			if(apple[x] == n || apple[x +1] == n)
			{
				result = true;
			}
		}
		System.out.println("Is there a specific number " + n + "in the adjcent pair: " + result);
		
	}
	
	public void Task100()
	{
		int[] a = {1,2,4,5,6};
		int[] b = {1,3,5,6,7};
		int count = 0;
		for(int x = 0; x < a.length; x++)
		{
			if(Math.abs(a[x] - b[x]) <= 1 && a[x] != b[x])
			{
				count++;
			}
		}
		System.out.println("number of pairs of elements that differ 1 or less: " + count);
	}
	
	public void Task101()
	{
		int[] a = {0,10,12,20,1,20};
		int count1 = 0;
		int count2 = 0;
		boolean result = false;
		for(int x = 0; x < a.length; x++)
		{
			if(a[x] == 10)
			{	
				count1++;
			}
			else if(a[x] == 20)
			{
				count2++;
			}
		}
		if(count1 > count2)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		System.out.println("Number of 10 is greater than number of 20: " + result);
	}
	
	public void Task102()
	{
		int[] a = {30,10,12,20,1,30};
		System.out.println(Arrays.toString(a));
		int count1 = 0;
		int count3 = 0;
		for(int x = 0; x < a.length; x++)
		{
			if(a[x] == 10)
			{
				count1++;
			}
			else if(a[x] == 30)
			{
				count3++;
			}
		}
		if(count1 == 0 && count3 == 0)
		{
			System.out.println("No 10 or 30 in this array");
		}
		else
		{
			System.out.println("Number of 10 = " + count1 + "\nNumber of 30 = " + count3);			
		}
		
	}
	
	public void Task103()
	{
		int[] a = {7,11,4,1,10,0,10,17};
		boolean result = false;
		int count = a.length - 1;
		do
		{
			if(a[count] != 10)
			{
				count--;
				result = false;
			}
			else if(a[count] == 10)
			{
				result = true;
			}
		}while(result == false);
		System.out.println("position: " + count);
		int bsize = a.length -1 - count;
		int[] b = new int[bsize];
		for(int y = 0; y < bsize; y++)
		{
			b[y] = a[count +1];
			count++;
		}
		System.out.println(Arrays.toString(b));
	}
	
	public void Task104()
	{
		int[] a = {12,2,3,4,5,110,6,10,8};
		int count = a.length -1;
		boolean result = false;
		do
		{
			if(a[count] != 10)
			{
				count--;
				result = false;
			}
			else if(a[count] == 10)
			{
				result = true;
			}
		}while(result == false);
		System.out.println("position: " + count);
		int[] b = new int[count]; 
		for(int y = 0; y < count; y++)
		{
			b[y] = a[y];
		}
		System.out.println(Arrays.toString(b));
	}
	
	public void Task105()
	{
		int[] a = {2,2,23,5,3,5,1,2};
		int groupsize = 2;
		Stack<Integer> b = new Stack<>();
		Queue<Integer> d = new LinkedList<Integer>();
		for(int x = 0; x < groupsize; x++)
		{
			b.add(a[x]);
		}
		for(int y = a.length - 1; y > a.length -1 - groupsize; y--)
		{
			d.add(a[y]);
		}
		boolean result = true;
		do
		{
			if(b.pop() == d.peek())
			{
				d.poll();
				result = true;
			}
			else
			{
				result = false;
			}
		}while(result == true && !b.empty() && !d.isEmpty());
		System.out.println(b + "\n" + d);
		System.out.println("the group is the same? " + result);
	}
	
	public void Task106()
	{
		int[] a = {26,2,22,15,8};
		int last = a[0];
		int[] b = new int[a.length];
		for(int x = 0; x < a.length -1; x++)
		{
			b[x] = a[x +1];
		}
		b[a.length -1] = last;
		System.out.println(Arrays.toString(b));
		
		
	}
	
	public void Start()
	{
		Task92(GenerateArray());
	}
	//task 89-91, 93 undone
	public static void main(String[] args) { 
		P1 obj1 = new P1();
		obj1.Task106();
	}

}
