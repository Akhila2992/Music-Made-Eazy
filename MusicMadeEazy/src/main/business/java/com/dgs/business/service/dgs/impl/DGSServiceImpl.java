package com.dgs.business.service.dgs.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dgs.business.service.DGSService;
import com.dgs.data.dao.MmePlaylistDao;
import com.dgs.data.dao.MmeSongsDao;
import com.dgs.data.dao.MmeUserDao;
import com.dgs.data.domain.MmePlaylist;
import com.dgs.data.domain.MmeSongs;
import com.dgs.data.domain.MmeUser;


@Transactional
public class DGSServiceImpl implements DGSService {
	
	@Autowired
	private MmeSongsDao mmeSongsDao;
	
	@Autowired
	private MmePlaylistDao mmePlaylistDao;
	
	@Autowired
	private MmeUserDao mmeUserDao;
	
	public List<MmeSongs> getAllSongs() throws Exception {
		
		List<MmeSongs> songs = new ArrayList<MmeSongs>();
		songs = mmeSongsDao.getAllSongs();
		return songs;

	}

	public List<MmeUser> getAllUsers() throws Exception {
		
		List<MmeUser> users = new ArrayList<MmeUser>();
		users = mmeUserDao.getAllActiveRecords();
		return users;

	}

	@Override
	public List<MmePlaylist> getMyPlaylists(long userId) throws Exception {
		List<MmePlaylist> myPlaylists = new ArrayList<MmePlaylist>();
		myPlaylists = mmePlaylistDao.getMyPlaylists(userId);
		return myPlaylists;
		
	}
	
	@Override
	public void deletePlaylist(long playlistId) throws Exception {
		mmePlaylistDao.remove(mmePlaylistDao.findById(playlistId));
		
		
	}
	
	public void savePlaylist(MmePlaylist mmePlaylist) {
		mmePlaylist.setPlaylistCreatedDate(new Date());
		mmePlaylistDao.persist(mmePlaylist);
		

	}


}
