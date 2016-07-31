package com.springpractice.bean;

public class TextEditor {
	
	private String name;
	private SpellChecker spellChecker;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside set spell checker.");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
