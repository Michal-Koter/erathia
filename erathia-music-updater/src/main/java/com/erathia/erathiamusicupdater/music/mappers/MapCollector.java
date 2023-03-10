package com.erathia.erathiamusicupdater.music.mappers;

import com.erathia.erathiadata.models.*;
import com.erathia.erathiamusicclient.musicsClient.contract.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class MapCollector implements ICollectMap{
    private final IMap<AlbumDto, Album> albumMapper;
    private final IMap<ArtistDto, Artist> artistMapper;
    private final IMap<GenreDto, Genre> genreMapper;
    private final IMap<TrackDto, Track> trackMapper;
}
