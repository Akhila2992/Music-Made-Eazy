package com.dgs.data.domain;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MmeAlbum generated by hbm2java
 */
@Entity
@Table(name = "mme_album")
public class MmeAlbum implements java.io.Serializable {

	private long albumId;
	private String albumName;
	private Date albumReleaseDate;
	private Date albumCreateOn;
	private Long albumCreatedBy;
	private Long albumModifiedBy;
	private Date albumModifiedOn;

	public MmeAlbum() {
	}

	public MmeAlbum(long albumId, String albumName, Date albumReleaseDate) {
		this.albumId = albumId;
		this.albumName = albumName;
		this.albumReleaseDate = albumReleaseDate;
	}

	public MmeAlbum(long albumId, String albumName, Date albumReleaseDate, Date albumCreateOn, Long albumCreatedBy,
			Long albumModifiedBy, Date albumModifiedOn) {
		this.albumId = albumId;
		this.albumName = albumName;
		this.albumReleaseDate = albumReleaseDate;
		this.albumCreateOn = albumCreateOn;
		this.albumCreatedBy = albumCreatedBy;
		this.albumModifiedBy = albumModifiedBy;
		this.albumModifiedOn = albumModifiedOn;
	}

	@Id

	@Column(name = "Album_ID", unique = true, nullable = false)
	public long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	@Column(name = "Album_Name", nullable = false)
	public String getAlbumName() {
		return this.albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Album_Release_Date", nullable = false, length = 13)
	public Date getAlbumReleaseDate() {
		return this.albumReleaseDate;
	}

	public void setAlbumReleaseDate(Date albumReleaseDate) {
		this.albumReleaseDate = albumReleaseDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Album_Create_On", length = 15)
	public Date getAlbumCreateOn() {
		return this.albumCreateOn;
	}

	public void setAlbumCreateOn(Date albumCreateOn) {
		this.albumCreateOn = albumCreateOn;
	}

	@Column(name = "Album_Created_By")
	public Long getAlbumCreatedBy() {
		return this.albumCreatedBy;
	}

	public void setAlbumCreatedBy(Long albumCreatedBy) {
		this.albumCreatedBy = albumCreatedBy;
	}

	@Column(name = "Album_Modified_By")
	public Long getAlbumModifiedBy() {
		return this.albumModifiedBy;
	}

	public void setAlbumModifiedBy(Long albumModifiedBy) {
		this.albumModifiedBy = albumModifiedBy;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Album_Modified_On", length = 15)
	public Date getAlbumModifiedOn() {
		return this.albumModifiedOn;
	}

	public void setAlbumModifiedOn(Date albumModifiedOn) {
		this.albumModifiedOn = albumModifiedOn;
	}

}