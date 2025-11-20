package com;

public class Ejercicio6 {
	/**
	 * Ejercicio 6 · Espera con tiempo límite join(ms)
Simula una tarea que tarda mucho, pero el hilo principal 
solo esperará un tiempo máximo de 1 segundo.
	 */
	public static void main(String [] args) {
		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("FIN t1");
		});
		Thread t2 = new Thread(()->{
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("FIN t2");
		
			
		});
				
		
		t1.start();
		try {
			t1.join();
			t2.start();
			if(t1.isAlive()) {
				System.out.println("Esta vivo");
			}else {
				System.out.println("Termino");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}