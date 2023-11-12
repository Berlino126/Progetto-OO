package com.mycompany.bibiotecadigitale.gui;
import com.mycompany.bibiotecadigitale.dao.*;
import com.mycompany.bibiotecadigitale.implementazione_dao.AdminDAOImpl;
import com.mycompany.bibiotecadigitale.implementazione_dao.TestoDAOImpl;
import com.mycompany.bibiotecadigitale.implementazione_dao.UtenteDAOImpl;

public class Controller {
    private Login login;
    private ManagerTesto managerTesto;
    private ManagerUtenti managerUtenti;
    private UpdatingAdmin updatingAdmin;
    private AcquistoUtentee acquistoUtentee;
    private InterfacciaArticolo interfacciaArticolo;
    private InterfacciaLibro interfacciaLibro;
    private UpdatingUtente updatingUtente;
    private Registrazione registrazione;
    private UtenteDAO utenteDAO;
    private AdminDAOImpl adminDAO;
    private TestoDAOImpl testoDAO;
    private LibroDAO libroDAO;
    private ArticoloScientificoDAO articoloScientificoDAO;
    private RichiestaDAO richiestaDAO;

    public Controller(Login login, ManagerTesto managerTesto, ManagerUtenti managerUtenti, UpdatingAdmin updatingAdmin, AcquistoUtentee acquistoUtentee, InterfacciaArticolo interfacciaArticolo, InterfacciaLibro interfacciaLibro, UpdatingUtente updatingUtente, Registrazione registrazione) {
        this.login = login;
        this.managerTesto = managerTesto;
        this.managerUtenti = managerUtenti;
        this.updatingAdmin = updatingAdmin;
        this.acquistoUtentee = acquistoUtentee;
        this.interfacciaArticolo = interfacciaArticolo;
        this.interfacciaLibro = interfacciaLibro;
        this.updatingUtente = updatingUtente;
        this.registrazione = registrazione;
        UtenteDAO utenteDAO = new UtenteDAOImpl();
        AdminDAO adminDAO = new AdminDAOImpl();
        // Mostra la finestra di login
        login.setController(this);
        login.setVisible(true);
    }

    protected void AccediUtente(int codiceUtente) {
        login.dispose();
        updatingUtente.dispose();
        acquistoUtentee.setController(this);
        acquistoUtentee.setCodice(codiceUtente);
        acquistoUtentee.refreshLibreriaTable();
        acquistoUtentee.setVisible(true);
    }

    protected void AccediAdmin(int codiceAdmin) {
        login.dispose();
        managerTesto.setController(this);
        managerTesto.setCodice(codiceAdmin);
        managerTesto.refreshTestoTable();
        managerTesto.setVisible(true);
    }

    protected void ApriLibri() {
        managerTesto.dispose();
        managerUtenti.dispose();
        interfacciaArticolo.dispose();
        interfacciaLibro.setController(this);
        interfacciaLibro.refreshLibroTable();
        interfacciaLibro.setVisible(true);
    }

    protected void ApriArticoli() {
        managerTesto.dispose();
        managerUtenti.dispose();
        interfacciaLibro.dispose();
        interfacciaArticolo.setController(this);
        interfacciaArticolo.refreshArticoloTable();
        interfacciaArticolo.setVisible(true);
    }

    protected void ApriUtenti() {
        interfacciaLibro.dispose();
        interfacciaArticolo.dispose();
        managerTesto.dispose();
        managerUtenti.setController(this);
        managerUtenti.refreshUtenteTable();
        managerUtenti.setVisible(true);
    }
    protected void ApriTesti()
    {
        managerUtenti.dispose();
        interfacciaArticolo.dispose();
        interfacciaLibro.dispose();
        managerTesto.setController(this);
        managerTesto.refreshTestoTable();
        managerTesto.setVisible(true);
    }

    protected void Logout() {
        managerTesto.dispose();
        managerUtenti.dispose();
        interfacciaLibro.dispose();
        interfacciaArticolo.dispose();
        acquistoUtentee.dispose();
        registrazione.dispose();
        login.setController(this);
        login.setVisible(true);
    }
    protected void ApriModificaUtente()
    {
        acquistoUtentee.dispose();
        updatingUtente.setController(this);
        updatingUtente.setCodice(acquistoUtentee.getCodice());
        updatingUtente.setVisible(true);
    }
    protected void ApriModificaAdmin()
    {
        managerTesto.dispose();
        updatingAdmin.setController(this);
        updatingAdmin.setCodice(managerTesto.getCodice());
        updatingAdmin.setVisible(true);
    }
    protected void ChiudiApp() {
        if (utenteDAO != null) {
            utenteDAO.close();
        }
        if (adminDAO != null) {
            adminDAO.close();
        }
        if (testoDAO != null) {
            testoDAO.close();
        }
        if (libroDAO != null) {
            libroDAO.close();
        }
        if (articoloScientificoDAO != null) {
            articoloScientificoDAO.close();
        }
        if (richiestaDAO != null) {
            richiestaDAO.close();
        }
        System.exit(0);
    }
    protected void ApriRegistrazione()
    {
        login.dispose();
        registrazione.setController(this);
        registrazione.setVisible(true);
    }
    protected void IndietroAdmin ()
    {
        updatingAdmin.dispose();
        managerTesto.setController(this);
        managerTesto.setVisible(true);
    }
    protected void IndietroUtente()
    {
        updatingUtente.dispose();
        acquistoUtentee.setController(this);
        acquistoUtentee.setVisible(true);
    }



    public static void main(String[] args) {
        // Esempio di inizializzazione delle classi necessarie
        Login login = new Login();
        ManagerTesto managerTesto = new ManagerTesto();
        ManagerUtenti managerUtenti = new ManagerUtenti();
        UpdatingAdmin updatingadmin = new UpdatingAdmin();
        AcquistoUtentee acquistoUtentee = new AcquistoUtentee();
        InterfacciaArticolo interfacciaArticolo = new InterfacciaArticolo();
        InterfacciaLibro interfacciaLibro = new InterfacciaLibro();
        UpdatingUtente updatingutente = new UpdatingUtente();
        Registrazione registrazione = new Registrazione();
        // Creazione dell'istanza del controller
        Controller controller = new Controller(login, managerTesto, managerUtenti, updatingadmin, acquistoUtentee, interfacciaArticolo, interfacciaLibro, updatingutente, registrazione);
    }
}
