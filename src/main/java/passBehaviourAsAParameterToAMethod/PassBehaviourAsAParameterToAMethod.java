package passBehaviourAsAParameterToAMethod;

import java.util.Random;

public class PassBehaviourAsAParameterToAMethod {

	public static void main(String[] args) {
//		MyFunInterface fun = () -> System.out.println("Hello");
//		fun.doSomething();
		// pass the behavior to a method like a parameter:
		MyFunInterface behaviour1 = () -> System.out.println("This is a behaviour");
		MyFunInterface behaviour2 = () -> {
			Random random = new Random();
			System.out.println(random.nextInt(1000) + " -> Another behavior");
			};
			
		followBehaviour(behaviour1);
		followBehaviour(behaviour2);
	}
	
	public static void followBehaviour(MyFunInterface fun) {
		fun.doSomething();
	}

}
