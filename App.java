package com.lab4.com;

import java.util.Scanner;

import com.lab4.com.service.BubbleSortImp;
import com.lab4.com.service.NotesCountService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
	int size = sc.nextInt();
	int notes[] = new int[size]; 
	System.out.println("Enter the  currency dominations value");
	for (int i=0; i<size; i++) {
		notes[i] = sc.nextInt();
	}
 BubbleSortImp bb = new BubbleSortImp();
 bb.bubbleSort(notes);
 //System.out.println("After Sort");
 //for(int i:notes) {
	// System.out.println(i+" ");
 //}
 System.out.println("Enter the amount to pay");
 int amount = sc.nextInt();
 NotesCountService ncs = new NotesCountService();
 ncs.notesCounter(notes, amount);
	}

}
