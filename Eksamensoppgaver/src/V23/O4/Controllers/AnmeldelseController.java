package V23.O4.Controllers;

import V23.O4.Service.BokAnmeldelseService;

@Controller
public class AnmeldelseController {


    @Autowired private BokAnmeldelseService bas;

    @GetMapping("/anmelde")
    public String hentAnmeldelseSkjema(@RequestParam(name="bok_id") Integer id, Model model) {
        if(id == null || bas.finnBok(id) == null) {
            return "feilmelding";
        }
        Bok bok = bas.finnbok(id);
        mode.addAttributes("bok", bok);
        return "anmeldeSkjema";

    }

    @PostMapping("/anmelde")
    public String anmeldBok(
        @RequestParam(name="bok_id") int id,
        @RequestParam(name="rating") int rating,
        @RequestParam(name="tekst") String tekst
        @RequestParam(name="anmelder") String hilsen,
        RedirectAttributes ra) {

            if(hilsen.isBlank()) {
                hilsen = "Anonym";
            }

            

            bas.anmeldeBok(id, rating, tekst, hilsen);
            ra.addAttributes("bok_id", bokid);

        return "redirect:bokanmdelser";


        }
}
