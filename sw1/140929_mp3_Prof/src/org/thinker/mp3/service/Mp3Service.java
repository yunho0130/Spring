package org.thinker.mp3.service;

import java.util.List;

import org.thinker.mp3.vo.MP3;

public interface Mp3Service {
	
	public Mp3Service instance = new Mp3ServiceImpl();
	
	public List<MP3> getFolderList(String dirName);
	
	public void addMp3(MP3 mp3);
	
	public void removeMp3(String fileName);
}
