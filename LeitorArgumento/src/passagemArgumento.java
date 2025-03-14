
public class passagemArgumento {
	public static void main(String[] args) {
		
		if(args.length > 0) {
			for(int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
			System.out.println(args.length);
		} else {
			System.out.println("Vazio");
		}
	}
}
