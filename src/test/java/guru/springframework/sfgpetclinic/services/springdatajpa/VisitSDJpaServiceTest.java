package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * Created By john on Aug, 2019
 **/
@ExtendWith(MockitoExtension.class)
class VisitSDJpaServiceTest {

    @Mock
    private VisitRepository visitRepository;

    @InjectMocks
    private VisitSDJpaService service;

    @Test
    void findAll() {
        Set<Visit> visits = new HashSet<>();
        visits.add(mock(Visit.class));
        when(visitRepository.findAll()).thenReturn(visits);
        Set<Visit> foundVisits = service.findAll();

        verify(visitRepository).findAll();
        assertThat(foundVisits).hasSize(1);
        assertThat(foundVisits).isEqualTo(visits);
    }

    @Test
    void findById() {
        Visit visit = new Visit();
        when(visitRepository.findById(anyLong())).thenReturn(Optional.of(visit));

        Visit foundVisit = service.findById(1l);

        verify(visitRepository).findById(anyLong());
        assertThat(foundVisit).isEqualTo(visit);

    }

    @Test
    void save() {
        Visit visit = new Visit();
        when(visitRepository.save(any(Visit.class))).thenReturn(visit);
        Visit savedVisit = service.save(new Visit());

        verify(visitRepository).save(any(Visit.class));

        assertThat(savedVisit).isNotNull();
        assertThat(savedVisit).isEqualTo(visit);
    }

    @Test
    void delete() {
        Visit visit = new Visit();
        service.delete(visit);
        verify(visitRepository).delete(any(Visit.class));
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        verify(visitRepository).deleteById(anyLong());
    }
}
