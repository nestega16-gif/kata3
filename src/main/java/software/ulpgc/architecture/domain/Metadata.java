package software.ulpgc.architecture.domain;

import java.time.Instant;

public record Metadata(int validRecords, int discardedRecords, Instant generatedAt) {

}