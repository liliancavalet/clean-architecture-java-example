package dev.schertel.cq.circular.usecase.output;

import dev.schertel.cq.circular.entity.CircularQueue;

import java.util.List;
import java.util.Optional;

public interface ICircularQueueUseCase {
    CircularQueue create(CircularQueue entity);

    List<CircularQueue> readAll();

    Optional<CircularQueue> read(String id);
}
