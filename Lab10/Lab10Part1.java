public class Lab10Part1
{
	public static void main(String[] args)
	{
		MyArrayList list = new MyArrayList();
		list.add("fuc");
		list.add("shi");
		list.add("bastar");
		list.add("cumputer");
		list.add("ho");
		
		int randomNum = (int)(Math.random() * list.size());
		String randomString = list.get(randomNum)+"";
		String uppString = randomString.toUpperCase();
		System.out.println(uppString);	
	}
}