package passBehaviourAsAParameterToAMethod;

import java.util.Random;

public class PassBehaviourAsAParameterToAMethod {

	public static void main(String[] args) {
//		MyFunInterface fun = () -> System.out.println("Hello");
//		fun.doSomething();
		// pass the behavior to a method
		followBehaviour(() -> System.out.println("This is a behaviour"));
		followBehaviour(() -> {
			Random random = new Random();
			System.out.println(random.nextInt(1000) + " -> Another behavior");
			});
	}
	
	public static void followBehaviour(MyFunInterface fun) {
		fun.doSomething();
	}

}
