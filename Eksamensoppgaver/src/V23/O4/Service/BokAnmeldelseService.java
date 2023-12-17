package V23.O4.Service;

@Service
public class BokAnmeldelseService {

    @Autowired private BokRepo bokRepo;
    @Autowired private AnmeldelseRepo anmeldelseRepo;

    public Bok finnBok(int id) {
        return bokRepo.findById(id).orElse(null);
    }

    public void anmeldeBok(int bokid, int rating, String tekst, String anmelder) {
        Bok bok = finnBok(bokid);
        Anmeldelse anmeldelse = new Anmeldelse(rating, tekst, anmelder, bok);
        bok.leggTilAnmeldelse(anmeldelse);
        anmeldelseRepo.save(anmeldelse);

    }
    
}
