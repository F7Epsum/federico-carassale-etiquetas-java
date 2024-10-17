public class Main{
	public static void main (String[]args){
		System.out.println(args.length);
		if(args.length == 0) {
		System.out.println("No Hay Argumentos");
		} else {
		System.out.println("Hay " + args.length() + "argumentos");
		}

		try{
			for(int i=0; i < args.length(); i++){
			System.out.println(args[i]);
			}
		} catch (IntexOutOfBoundsException e){
			System.out.println("Error: " + e);
		}
	}
}
