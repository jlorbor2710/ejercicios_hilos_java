package com;

public class LanzadorHilosNew {
	public static void main(String[] args) throws InterruptedException {
		Thread h = new Thread(new Hilo("runneable"));
		h.start();
		System.out.println(h.getName() + "-->" + h.getState());
		Thread.sleep(50);
	}
}
