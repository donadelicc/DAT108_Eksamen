package V23.O4.Test;

public class AnmeldelseControllerTest {

    @Mock
    private BokAnmeldelseService bokAnmeldelseService;

    @InjectMocks
    private AnmeldelseController anmeldelseController;

    private MockMvc mockMvc;

    @Test
    public void hentAnmeldelseSkjemaTest() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(anmeldelseController).build();

        // Anta at en gyldig bok blir returnert
        when(bokAnmeldelseService.finnBok(anyInt())).thenReturn(new Bok(/* initialiser bokobjektet */));

        mockMvc.perform(get("/anmelde?bok_id=1"))
               .andExpect(status().isOk())
               .andExpect(view().name("anmeldeSkjema"));
    }