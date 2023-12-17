package V21

import java.time.LocalDateTime;

Spring.Controllers;

@Controller
public class PizzamenyController {

    @Autowired
    private PizzaService ps;

    @GetMapping("/pizzameny")
    public String hentPizzaer(Model model) {
        List<Pizza> allePizzaer = ps.hentAllePizzaer();
        model.addAttribute("pizzaer", pizzaer);
        return "pizzameny";
    }

    @PostMapping
    public String doPost(@RequestParam Map<String, String> requestParams,
            Model model, RedirectAttributes ra) {
        System.err.println(requestParams);
        Bestilling bestilling = new Bestilling(requestParams.get("kundemobil"));
        // Funksjon som gir antall bestilt av en gitt pizza
        Function<Pizza, Integer> antallAv = p -> Integer.parseInt(requestParams.get("antallAv" + p.getNr()));
        // Legger til "rader" i bestillingen
        List<Pizza> pizzaer = pizzaService.hentAllePizzaer();
        pizzaer.stream()
                .filter(p -> antallAv.apply(p) > 0)
                .forEach(p -> bestilling.leggTil(p, antallAv.apply(p)));
        pizzaService.lagreBestilling(bestilling);
        ra.addFlashAttribute(bestilling);
        return "redirect:kvittering";
    }

}
