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
 * MmeArtist generated by hbm2java
 */
@Entity
@Table(name = "mme_artist")
public class MmeArtist implements java.io.Serializable {

	private long artistId;
	private String artistName;
	private Date artistCreateOn;
	private Long artistCreatedBy;
	private Long artistModifiedBy;
	private Date artistModifiedOn;

	public MmeArtist() {
	}

	public MmeArtist(long artistId, String artistName) {
		this.artistId = artistId;
		this.artistName = artistName;
	}

	public MmeArtist(long artistId, String artistName, Date artistCreateOn, Long artistCreatedBy, Long artistModifiedBy,
			Date artistModifiedOn) {
		this.artistId = artistId;
		this.artistName = artistName;
		this.artistCreateOn = artistCreateOn;
		this.artistCreatedBy = artistCreatedBy;
		this.artistModifiedBy = artistModifiedBy;
		this.artistModifiedOn = artistModifiedOn;
	}

	@Id

	@Column(name = "Artist_ID", unique = true, nullable = false)
	public long getArtistId() {
		return this.artistId;
	}

	public void setArtistId(long artistId) {
		this.artistId = artistId;
	}

	@Column(name = "Artist_Name", nullable = false)
	public String getArtistName() {
		return this.artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Artist_Create_On", length = 15)
	public Date getArtistCreateOn() {
		return this.artistCreateOn;
	}

	public void setArtistCreateOn(Date artistCreateOn) {
		this.artistCreateOn = artistCreateOn;
	}

	@Column(name = "Artist_Created_By")
	public Long getArtistCreatedBy() {
		return this.artistCreatedBy;
	}

	public void setArtistCreatedBy(Long artistCreatedBy) {
		this.artistCreatedBy = artistCreatedBy;
	}

	@Column(name = "Artist_Modified_By")
	public Long getArtistModifiedBy() {
		return this.artistModifiedBy;
	}

	public void setArtistModifiedBy(Long artistModifiedBy) {
		this.artistModifiedBy = artistModifiedBy;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Artist_Modified_On", length = 15)
	public Date getArtistModifiedOn() {
		return this.artistModifiedOn;
	}

	public void setArtistModifiedOn(Date artistModifiedOn) {
		this.artistModifiedOn = artistModifiedOn;
	}

}
