package _02_More_Algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	
//	public static int findBrokenEgg(List<String> eggs) {
//		for(int i=0;i<eggs.size();i++) {
//		//	if(eggs.get(i)=="cracked") {
//				return i;
//				
//			}
//		}
//		return 0;
//	}
	
	
	
//	public static int countPearls(List<Boolean> oysters) {
//		int counter=0;
//		for(int i=0;i<oysters.size();i++) {
//			if(oysters.get(i).booleanValue()==true) {
//				counter+=1;
//			}
//		}
//		return counter;
//	}
	
	
	
//	public static double findTallest(List<Double> peeps) {
//		double highest=0;
//		for(int i=1;i<peeps.size();i++) {
//			if(peeps.get(i)>peeps.get(i-1)) {
//				highest=peeps.get(i);
//			}
//		}
//		return highest;
//	}
	
	
	
//	public static String findLongestWord(List<String> words) {
//		String word=words.get(0); 
//		for(int i=1;i<words.size();i++) {
//			if(words.get(i).length()>word.length()) {
//				word=words.get(i);
//			}
//		}
//		return word;
//	}
	
	
	
//	public static Boolean containsSOS(List<String> message) {
//		
//
//		for(int i=0;i<message.size();i++) {
//			if(message.get(i).equals(" ... --- ... ")) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	
//	public static List<Double> sortScores(List<Double> grades) {
//		for(int o=0;o<grades.size();o++) {
//			for(int i=1;i<grades.size();i++) {
//				if(grades.get(i)<grades.get(i-1)) {
//				double replace = grades.get(i);
//				grades.set(i, grades.get(i-1));
//				grades.set(i-1, replace);
//				
//					
//		System.out.println(grades);
//				
//			}
//				
//				
//			}
//			
//		}
//		
//	
//		return grades;
//		
//	}
	
	
	
//	public static List<String> sortDNA(List<String> dna){
//		for(int I=0;I<dna.size();I++) {
//			for(int i=1;i<dna.size();i++) {
//				if(dna.get(i).length()<dna.get(i-1).length()) {
//					String replace = dna.get(i);
//					dna.set(i, dna.get(i-1));
//					dna.set(i-1, replace);
//				}
//			}
//	}
//		
//		
//		return dna;
//	}
	
	
	
	public static List<String> sortWords(List<String> words){
		for(int I=0;I<words.size();I++) {
			for(int i=1;i<words.size();i++) {
				if(words.get(i).compareTo(words.get(i-1))<0)  {
					String replace = words.get(i);
					words.set(i, words.get(i-1));
					words.set(i-1, replace);
				}
			}
		}
		return words;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
