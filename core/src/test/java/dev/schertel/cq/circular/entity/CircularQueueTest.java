package dev.schertel.cq.circular.entity;

import com.jparams.verifier.tostring.NameStyle;
import com.jparams.verifier.tostring.ToStringVerifier;
import com.jparams.verifier.tostring.preset.Presets;
import io.github.glytching.junit.extension.random.Random;
import io.github.glytching.junit.extension.random.RandomBeansExtension;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(RandomBeansExtension.class)
class CircularQueueTest {
    private CircularQueue.Builder builder = CircularQueue.builder();

    @Test
    void getId(@Random String expected) {
        CircularQueue dto = builder
                .withId(expected)
                .build();

        assertAll(
                () -> assertEquals(expected, dto.getId()),
                () -> assertNull(dto.getName()),
                () -> assertNull(dto.getDescription())
        );
    }

    @Test
    void getName(@Random String expected) {
        CircularQueue dto = builder
                .withName(expected)
                .build();

        assertAll(
                () -> assertNull(dto.getId()),
                () -> assertEquals(expected, dto.getName()),
                () -> assertNull(dto.getDescription())
        );
    }

    @Test
    void getDescription(@Random String expected) {
        CircularQueue dto = builder
                .withDescription(expected)
                .build();

        assertAll(
                () -> assertNull(dto.getId()),
                () -> assertNull(dto.getName()),
                () -> assertEquals(expected, dto.getDescription())
        );
    }

    @Nested
    class Builder {
        @Test
        void nullObject() {
            CircularQueue dto = builder
                    .build();

            assertAll(
                    () -> assertNull(dto.getId()),
                    () -> assertNull(dto.getName()),
                    () -> assertNull(dto.getDescription())
            );
        }

        @Test
        void from(@Random String id, @Random String name, @Random String description) {
            CircularQueue expected = builder
                    .withId(id)
                    .withName(name)
                    .withDescription(description)
                    .build();

            CircularQueue actual = builder
                    .from(expected)
                    .build();

            assertEquals(expected, actual);
        }

        @Test
        void fullObject(@Random String id, @Random String name, @Random String description) {
            CircularQueue dto = builder
                    .withId(id)
                    .withName(name)
                    .withDescription(description)
                    .build();

            assertAll(
                    () -> assertEquals(id, dto.getId()),
                    () -> assertEquals(name, dto.getName()),
                    () -> assertEquals(description, dto.getDescription())
            );
        }
    }

    @Nested
    class Override {
        @Test
        void testToString() {
            ToStringVerifier.forClass(CircularQueue.class)
                    .withClassName(NameStyle.SIMPLE_NAME)
                    .withPreset(Presets.INTELLI_J)
                    .verify();
        }

        @Test
        void testEquals() {
            EqualsVerifier.forClass(CircularQueue.class).suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS).verify();
        }
    }
}