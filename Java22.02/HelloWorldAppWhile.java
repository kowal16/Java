/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
class HelloWorldAppWhile {
    public static void main(String[] args) {
		int i =0;
		while(args.length>i){
			System.out.println(args[i]); // Display the string.
			i++;
			
		}
		while(String element:args){
			System.out.println(element); // Display the string.
		}
    }
}
