package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.repositories.VetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created By john on Aug, 2019
 **/

@ExtendWith(MockitoExtension.class)
class VetSDJpaServiceTest {

    @Mock
    private VetRepository vetRepository;

    @InjectMocks
    private VetSDJpaService vetSDJpaService;

    @Test
    void deleteById() {
        vetSDJpaService.deleteById(1l);
        verify(vetRepository, times(1)).deleteById(1l);
    }
}