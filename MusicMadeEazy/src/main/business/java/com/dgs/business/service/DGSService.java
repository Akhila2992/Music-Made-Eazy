package com.dgs.business.service;

import java.util.List;

import com.dgs.data.domain.MmePlaylist;
import com.dgs.data.domain.MmeSongs;
import com.dgs.data.domain.MmeUser;


public interface DGSService {

	public List<MmeSongs> getAllSongs() throws Exception;
	public List<MmeUser> getAllUsers() throws Exception;
	public List<MmePlaylist> getMyPlaylists(long userId) throws Exception;
	public void deletePlaylist(long playlistId) throws Exception;
//	public List<Usermaster> getMyStudentDetails(String userId) throws Exception;
//	public List<Grademaster> getGrades() throws Exception;
	public void savePlaylist(MmePlaylist mmePlaylist);
	
}