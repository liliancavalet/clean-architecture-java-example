package dev.schertel.cq.circular.usecase.input;

import dev.schertel.cq.circular.entity.CircularQueue;

import java.util.List;
import java.util.Optional;

public interface CircularQueueDataProvider {
    /**
     * Store a {@link CircularQueue} and return it.
     *
     * @param entity The {@link CircularQueue} to store
     * @return The {@link CircularQueue} stored
     */
    CircularQueue create(CircularQueue entity);

    /**
     * List all {@link CircularQueue} stored.
     *
     * @return A list of {@link CircularQueue} stored
     */
    List<CircularQueue> readAll();

    /**
     * Retrieve a {@link CircularQueue} stored.
     *
     * @param id The {@code id} of the {@link CircularQueue} to retrieve
     * @return The {@link CircularQueue} retrieved
     */
    Optional<CircularQueue> read(String id);

    /**
     * Delete all {@link CircularQueue} stored.
     */
    void deleteAll();

    /**
     * Delete a {@link CircularQueue} stored.
     *
     * @param id The {@code id} of the {@link CircularQueue} to delete
     * @return The {@link CircularQueue} deleted
     */
    Optional<CircularQueue> delete(String id);
}
