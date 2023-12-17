package V21 Spring.Serice;

@Service
public class PizzaService {
    
    @Autowired private PizzaRepo prizzRepo;

    List<Pizza> hentAllePizzaer(){}

    void lagreBestilling(Bestilling b){}

}
