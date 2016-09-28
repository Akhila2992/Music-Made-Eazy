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
 * MmeGenre generated by hbm2java
 */
@Entity
@Table(name = "mme_genre")
public class MmeGenre implements java.io.Serializable {

	private long genreId;
	private String genreName;
	private Long genreModifiedBy;
	private Long genreCreatedBy;
	private Date genreCreatedDate;
	private Date genreModifiedDate;

	public MmeGenre() {
	}

	public MmeGenre(long genreId, String genreName) {
		this.genreId = genreId;
		this.genreName = genreName;
	}

	public MmeGenre(long genreId, String genreName, Long genreModifiedBy, Long genreCreatedBy, Date genreCreatedDate,
			Date genreModifiedDate) {
		this.genreId = genreId;
		this.genreName = genreName;
		this.genreModifiedBy = genreModifiedBy;
		this.genreCreatedBy = genreCreatedBy;
		this.genreCreatedDate = genreCreatedDate;
		this.genreModifiedDate = genreModifiedDate;
	}

	@Id

	@Column(name = "Genre_ID", unique = true, nullable = false)
	public long getGenreId() {
		return this.genreId;
	}

	public void setGenreId(long genreId) {
		this.genreId = genreId;
	}

	@Column(name = "Genre_Name", nullable = false)
	public String getGenreName() {
		return this.genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	@Column(name = "Genre_Modified_By")
	public Long getGenreModifiedBy() {
		return this.genreModifiedBy;
	}

	public void setGenreModifiedBy(Long genreModifiedBy) {
		this.genreModifiedBy = genreModifiedBy;
	}

	@Column(name = "Genre_Created_By")
	public Long getGenreCreatedBy() {
		return this.genreCreatedBy;
	}

	public void setGenreCreatedBy(Long genreCreatedBy) {
		this.genreCreatedBy = genreCreatedBy;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Genre_Created_Date", length = 15)
	public Date getGenreCreatedDate() {
		return this.genreCreatedDate;
	}

	public void setGenreCreatedDate(Date genreCreatedDate) {
		this.genreCreatedDate = genreCreatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Genre_Modified_Date", length = 29)
	public Date getGenreModifiedDate() {
		return this.genreModifiedDate;
	}

	public void setGenreModifiedDate(Date genreModifiedDate) {
		this.genreModifiedDate = genreModifiedDate;
	}

}
