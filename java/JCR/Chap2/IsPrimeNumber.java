class IsPrimeNumber 
{
	public static void main(String args[])
	{
		int number;
		boolean answer;
		IsPrimeNumber IPN1 = new IsPrimeNumber();

		number = 4;
		answer = IPN1.isPrime(number);

		if(answer)
		{
			System.out.println(number + " is a prime number");
		}
		else
		{
			System.out.println(number + " is not a prime number");
		}
	}

	public boolean isPrime(int number)
	{
		int limit = number / 2;

		for (int i = 2; i < limit; i++)
		{
			if ( number % i == 0)
			{
				return  false;
			}
		}
		return true;
	}
}

