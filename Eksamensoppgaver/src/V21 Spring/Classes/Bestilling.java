package V21 Spring.Classes;

public class Bestilling {

    private LocalDateTime tidspunkt;
    private String mobilnummer;
    private Map<Pizza, Integer> pizzaer;

    public Bestilling(LocalDateTime tidspunkt, String mobil, Map<Pizza, Integer> pizzaer) {
        this.tidspunkt = tidspunkt;
        this.mobil = mobil;
        this.pizzaer = pizzaer;
    }

    public LocalDateTime getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(LocalDateTime tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public Map<Pizza, Integer> getPizzaer() {
        return pizzaer;
    }

    public void setPizzaer(Map<Pizza, Integer> pizzaer) {
        this.pizzaer = pizzaer;
    }
    
}
