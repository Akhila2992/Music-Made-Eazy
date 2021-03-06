package com.dgs.data.domain;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MmePlaylist generated by hbm2java
 */
@Entity
@Table(name = "mme_playlist")
public class MmePlaylist implements java.io.Serializable {

	private long playlistId;
	private long playlistUserId;
	private String playlistName;
	private Date playlistCreatedDate;
	private Date playlistModifiedDate;

	public MmePlaylist() {
	}

	public MmePlaylist(long playlistId, long playlistUserId, String playlistName) {
		this.playlistId = playlistId;
		this.playlistUserId = playlistUserId;
		this.playlistName = playlistName;
	}

	public MmePlaylist(long playlistId, long playlistUserId, String playlistName, Date playlistCreatedDate,
			Date playlistModifiedDate) {
		this.playlistId = playlistId;
		this.playlistUserId = playlistUserId;
		this.playlistName = playlistName;
		this.playlistCreatedDate = playlistCreatedDate;
		this.playlistModifiedDate = playlistModifiedDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Playlist_ID", unique = true, nullable = false)
	public long getPlaylistId() {
		return this.playlistId;
	}

	public void setPlaylistId(long playlistId) {
		this.playlistId = playlistId;
	}

	@Column(name = "Playlist_User_ID", nullable = false)
	public long getPlaylistUserId() {
		return this.playlistUserId;
	}

	public void setPlaylistUserId(long playlistUserId) {
		this.playlistUserId = playlistUserId;
	}

	@Column(name = "Playlist_Name", nullable = false)
	public String getPlaylistName() {
		return this.playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Playlist_Created_Date", length = 15)
	public Date getPlaylistCreatedDate() {
		return this.playlistCreatedDate;
	}

	public void setPlaylistCreatedDate(Date playlistCreatedDate) {
		this.playlistCreatedDate = playlistCreatedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Playlist_Modified_Date", length = 15)
	public Date getPlaylistModifiedDate() {
		return this.playlistModifiedDate;
	}

	public void setPlaylistModifiedDate(Date playlistModifiedDate) {
		this.playlistModifiedDate = playlistModifiedDate;
	}

}
