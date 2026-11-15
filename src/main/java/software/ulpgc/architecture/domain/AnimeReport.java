package software.ulpgc.architecture.domain;

import software.ulpgc.architecture.domain.model.Anime;

import java.util.List;

public record AnimeReport(List<Anime> animes, Metadata metadata) {
}
