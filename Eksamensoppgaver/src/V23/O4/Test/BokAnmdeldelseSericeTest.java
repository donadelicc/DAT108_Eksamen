package V23.O4.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class BokAnmeldelseServiceTest {

    @Mock
    private BokRepo bokRepo;

    @Mock
    private AnmeldelseRepo anmeldelseRepo;

    @InjectMocks
    private BokAnmeldelseService bas;

    @Test
    public void anmeldeBokTest() {
        int bokid = 1;
        Bok mockBok = new Bok(/* initialiser bokobjektet */);
        when(bokRepo.findById(bokid)).thenReturn(Optional.of(mockBok));

        // Gitt en Bok og en anmeldelse, sjekk at anmeldelsen blir lagret
        bas.anmeldeBok(bokid, /* de andre parametrene */);

        // Verifiser at de riktige metodene blir kalt på repoene
        verify(bokRepo).findById(bokid);
        verify(anmeldelseRepo).save(any(Anmeldelse.class));
    }
}
