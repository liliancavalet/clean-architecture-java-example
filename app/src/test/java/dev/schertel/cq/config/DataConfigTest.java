package dev.schertel.cq.config;

import dev.schertel.cq.core.usecase.circular.CircularRepository;
import dev.schertel.cq.data.repository.circular.CircularEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = DataConfig.class)
class DataConfigTest {

    @MockBean
    CircularEntityRepository circularEntityRepository;

    @Autowired
    private CircularRepository circularRepository;

    @Test
    void circularRepository() {
        assertNotNull(circularRepository);
    }
}
