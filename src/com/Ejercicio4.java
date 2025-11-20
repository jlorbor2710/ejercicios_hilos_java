package com;
//Muestra los estados de un hilo antes de arrancar, 
//mientras está trabajando y una vez que ha terminado.

public class Ejercicio4 {

	public static void main(String [] args) {
		Thread hilo = new Thread(() -> {
			System.out.println("Hilo: ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println("Estado antes de start()" + hilo.getState());
				
		hilo.start();
		System.out.println("Después de start()" + hilo.getState());
		System.out.println("is Alive?" + hilo.isAlive());
		
		
		try {
			hilo.join();
			System.out.println("Después de join()" + hilo.getState());
			System.out.println("is Alive?" + hilo.isAlive());
			
		}catch(InterruptedException iex) {
			
		}
	}
}