package software.ulpgc.architecture.domain.model;

import java.time.LocalDate;

public record Anime(String id, String title, AnimeType type, int episodes,
                    double rating, LocalDate startDate) {}
