import java.time.LocalDateTime;

public class HentCookie {

    @GetMapping("/")
    public String hey(@CookieValue(name="sistebesøk") String sisteBesok, Model model) {
        if(sisteBesok != null) {
            model.addAttribute("melding", "Hei. Velkommen første gang til oss.");
		} else {
			model.addAttribute("melding", "Hei. Ser du var sist inne " + sisteBesok);
		}
    
        Cookie c = new Cookie("sisteBesok", LocalDateTime.now().format(formatter));

        // Slette cookie
        c.setMaxAge(0); //I praksis blir minCookie slettet

    }
}
    

