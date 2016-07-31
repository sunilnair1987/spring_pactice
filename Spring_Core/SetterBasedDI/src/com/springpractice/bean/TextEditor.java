package com.springpractice.bean;

public class TextEditor {
	private SpellChecker spellChecker;

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
