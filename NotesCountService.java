package com.lab4.com.service;

public class NotesCountService {
public void notesCounter(int notes[], int amount) {
	int noteCounter[]=new int[notes.length];
	
	for (int i=0; i<notes.length; i++) {
		if(amount>=notes[i]) {
			noteCounter[i]=amount/notes[i];
			amount=amount-noteCounter[i]*notes[i];
		}
	}
	if(amount>0) {
		System.out.println("Exact amount can't be given with the highets denomination");
	}else {
		System.out.println("Your payment approach is");
		for(int i=0;i<notes.length;i++) {
			if(noteCounter[i] !=0) {
				System.out.println(notes[i]+"-"+noteCounter[i]);
			}
		}
	}
}
}
