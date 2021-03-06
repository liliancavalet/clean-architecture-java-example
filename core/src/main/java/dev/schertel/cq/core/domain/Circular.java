package dev.schertel.cq.core.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@Value
@Builder(builderClassName = "Builder", setterPrefix = "with")
@EqualsAndHashCode
@ToString
public class Circular {
    private final Identity id;
    private final String name;
    private final String description;
}
