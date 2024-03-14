class SubString
{
	public static void main(String s[])
	{
		String s1="Gopal Narayan Singh University";
		String s2=s1.substring(6);
		System.out.println(s2);
		String s3=s1.substring(26,26);
		System.out.println(s3);
	}
}
/*
substring(int starting index)-Returns a sub-string starting from index "starting index" to end of the string
substring(int starting index, int end index)-Returns a sub-string starting from index "starting index" to index (end index-1)

If-
1. Staring index <0 or Starting index>=Length of String
2. End index <0 or end index>=Length of String
3. Starting index > End index
	then StringIndexOutOfBoundsException is thrown
4. If Starting index = End index, then empty string is returned
*/