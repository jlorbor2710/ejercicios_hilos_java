package com;
/**
 * Ejercicio 5 · Esperar a otro hilo join()
Crea dos hilos A y B. El hilo B solo debe empezar su trabajo cuando A haya terminado.
 */
public class Ejercicio5 {
	public static void main(String [] args) {
		Thread hiloA = new Thread(
				()->{
					System.out.println("Es el hilo " +  Thread.currentThread().getName());
					System.out.println("Con el ID " + Thread.currentThread().getId());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Fin A");
				}
				);
		Thread hiloB = new Thread(
				()->{
					
					System.out.println("Es el hilo " +  Thread.currentThread().getName());
					System.out.println("Con el ID " + Thread.currentThread().getId());
					System.out.println("Fin B");
				}
				);
		hiloA.setName("Hilo A");
		hiloB.setName("Hilo B");
		hiloA.start();
		

		
		try {
			hiloA.join(1000);
			hiloB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}