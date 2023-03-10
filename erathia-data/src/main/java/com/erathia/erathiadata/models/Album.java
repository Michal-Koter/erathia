package com.erathia.erathiadata.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private Integer fans;
    private LocalDate releaseDate;
    @Column(columnDefinition = "integer default -1")
    private Integer sourceId;
    @ManyToOne()
    private Artist artist;
    @OneToMany(mappedBy = "album")
    private List<Track> tracks;
    @ManyToOne
    private Genre genre;

    @Override
    public int hashCode() {
        return Objects.hash(id, title, fans, releaseDate, sourceId, artist, tracks, genre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Album album = (Album) obj;
        return id.equals(album.getId()) && title.equals(album.getTitle()) && releaseDate.equals(album.getReleaseDate()) && sourceId.equals(album.getSourceId()) && artist.equals(album.getArtist()) && tracks.equals(album.getTracks()) && genre.equals(album.getGenre());
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", fans=" + fans +
                ", releaseDate=" + releaseDate +
                ", sourceId=" + sourceId +
                ", artist=" + artist.getName() +
                ", tracksCount=" + tracks.size() +
                ", genre=" + genre.getName() +
                '}';
    }
}
