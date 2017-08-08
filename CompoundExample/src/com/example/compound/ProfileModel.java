package com.example.compound;
import java.util.ArrayList;

public class ProfileModel implements ProfileModelInterface{
	ArrayList<Profile> profiles;
	ArrayList<ProfileObserver> observers;
	int currentProfile;

	@Override
	public void initialize() {
		setUpProfiles();
		observers = new ArrayList<ProfileObserver>();
		currentProfile = 0;
	}

	@Override
	public void next() {
		currentProfile++;
		notifyObservers();
	}

	@Override
	public void prev() {
		currentProfile--;
		notifyObservers();
	}

	@Override
	public void registerObserver(ProfileObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ProfileObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(){
		for(ProfileObserver observer : observers){
			observer.update();
		}
	}
	
	private void setUpProfiles(){
		profiles = new ArrayList<Profile>();
		profiles.add(new Profile("Kim Hanbin", "Leader/Rapper", "22 October 1996"));
		profiles.add(new Profile("Kim Jinhwan", "Vocal", "7 February 1994"));
		profiles.add(new Profile("Kim Ji-won", "Rapper", "21 Desember 1995"));
	}

	@Override
	public Profile getCurrentProfile() {
		return profiles.get(currentProfile);
	}

}
