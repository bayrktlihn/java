package com.bayrktlihn;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for(int i = 0 ; i<songs.size(); i++) {
			Song song = songs.get(i);
			if(song.getTitle().equals(title))
				return song;
		}
		
		return null;
	}
	
	public boolean addToPlayList(int truckNumber, LinkedList<Song> playList) {
		int index = truckNumber -1 ;
		if(index >= 0 && index <= this.songs.size()) {
			playList.add(this.songs.get(index));
			return true;
		}
		
		System.out.println("This album does not have a track");
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playList ) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song "+title+" is not in this album");
		return false;
	}
	
	
	
}