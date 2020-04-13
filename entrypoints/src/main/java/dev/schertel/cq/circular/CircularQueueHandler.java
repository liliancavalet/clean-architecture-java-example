package dev.schertel.cq.circular;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CircularQueueHandler {
    @Autowired CircularQueueUseCase useCase;
    @Autowired ModelMapper modelMapper;

    public List<CircularQueueDto> getAll() {
        return useCase.getAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public CircularQueueDto getById(String id) {
        return convertToDto(useCase.getById(UUID.fromString(id)));
    }

    private CircularQueueDto convertToDto(CircularQueue entity) {
        CircularQueueDto dto = modelMapper.map(entity, CircularQueueDto.class);
        return dto;
    }

    private CircularQueue convertToEntity(CircularQueueDto dto) {
        CircularQueue entity = modelMapper.map(dto, CircularQueue.class);
        return entity;
    }
}
