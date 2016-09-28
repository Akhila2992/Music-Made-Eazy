package com.dgs.data.domain;
// default package
// Generated 25 Aug, 2016 2:06:53 PM by Hibernate Tools 5.0.0.Alpha3

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MmeAlbumArtistSongMapping generated by hbm2java
 */
@Entity
@Table(name = "mme_album_artist_song_mapping", uniqueConstraints = @UniqueConstraint(columnNames = { "Album_ID",
		"Artist_ID", "Song_ID" }))
public class MmeAlbumArtistSongMapping implements java.io.Serializable {

	private MmeAlbumArtistSongMappingId id;

	public MmeAlbumArtistSongMapping() {
	}

	public MmeAlbumArtistSongMapping(MmeAlbumArtistSongMappingId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "albumId", column = @Column(name = "Album_ID")),
			@AttributeOverride(name = "artistId", column = @Column(name = "Artist_ID")),
			@AttributeOverride(name = "songId", column = @Column(name = "Song_ID")) })
	public MmeAlbumArtistSongMappingId getId() {
		return this.id;
	}

	public void setId(MmeAlbumArtistSongMappingId id) {
		this.id = id;
	}

}
