package V21

import java.lang.annotation.Inherited;

Spring;

@Entity
public class Pizza {
    

    @Id
    @GeneratedValue(GeneratedValue.type)
    private int Id;
    
    @Column(name="navn")
    private String navn;

    @Column(name="beskrivelse")
    private String beskrivelse;

    @Column(name="pris")
    private int pris;

    @Column(name="bildefil") //.../webapp/bilder/
    private String bildefil;

    public Pizza(int Id, String navn, String beskrivelse, int pris, String bildefil) {
        ...
    }




}
