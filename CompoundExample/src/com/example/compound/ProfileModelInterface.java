package com.example.compound;

public interface ProfileModelInterface {
	void initialize();
	
	void next();
	
	void prev();
	
	Profile getCurrentProfile();
	
	void registerObserver(ProfileObserver observer);
	
	void removeObserver(ProfileObserver observer);
}
