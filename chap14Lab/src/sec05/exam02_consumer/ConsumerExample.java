package sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	/*
	//?͸???????ü
	Consumer<String> consumer = new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t + "8");
		}
		
	};
	*/
	
	
	public static void main(String[] args) {
		
		/*
		//?͸???????ü
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t + "8");
			}
			
		};
		*/
		
		//???ٽ?
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		//???ٽ?
		/*
		BiConsumer<String, String> bigConsumer = new Consumer<String>() {
			
			@Override
			public void accept(String t, String u) {
				 System.out.println(t + u);
			}
			
		};
		*/
		
		//???ٽ?
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8"); //"Java8"
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);//"Java8.0
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8); // "Java8"
	}
}
