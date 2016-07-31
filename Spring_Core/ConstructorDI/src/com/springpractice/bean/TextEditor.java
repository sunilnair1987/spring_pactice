package com.springpractice.bean;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor contructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.spellChecking();
	}

}
