public class App {
    
@GetMapping("/...")
public String ...(..., HttpServletResponse response) {
    Cookie c = new Cookie("minCookie", "Mariekjeks");
    c.setMaxAge(30);
    response.addCookie(c);
    return "mittview";
    }
}
