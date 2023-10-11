package com.mycompany.bibiotecadigitale.gui;
import com.mycompany.bibiotecadigitale.dao.UtenteDAO;
import com.mycompany.bibiotecadigitale.dao.AdminDAO;
import com.mycompany.bibiotecadigitale.dao.TestoDAO;
import com.mycompany.bibiotecadigitale.dao.LibroDAO;
import com.mycompany.bibiotecadigitale.dao.ArticoloScientificoDAO;
import com.mycompany.bibiotecadigitale.dao.RichiestaDAO;
public class Controller {
    private Login login;
    private ManagerTesto managerTesto;
    private ManagerUtenti managerUtenti;
    private UpdatingAdmin updatingAdmin;
    private AcquistoUtentee acquistoUtentee;
    private Loading loading;
    private InterfacciaArticolo interfacciaArticolo;
    private InterfacciaLibro interfacciaLibro;
    private UpdatingUtente updatingUtente;
    private Registrazione registrazione;
    private UtenteDAO utenteDAO;
    private AdminDAO adminDAO;
    private TestoDAO testoDAO;
    private LibroDAO libroDAO;
    private ArticoloScientificoDAO articoloScientificoDAO;
    private RichiestaDAO richiestaDAO;

    public Controller(Login login, ManagerTesto managerTesto, ManagerUtenti managerUtenti, UpdatingAdmin updatingAdmin, AcquistoUtentee acquistoUtentee, Loading loading, InterfacciaArticolo interfacciaArticolo, InterfacciaLibro interfacciaLibro, UpdatingUtente updatingUtente, Registrazione registrazione) {
        this.login = login;
        this.managerTesto = managerTesto;
        this.managerUtenti = managerUtenti;
        this.updatingAdmin = updatingAdmin;
        this.acquistoUtentee = acquistoUtentee;
        this.loading = loading;
        this.interfacciaArticolo = interfacciaArticolo;
        this.interfacciaLibro = interfacciaLibro;
        this.updatingUtente = updatingUtente;
        this.registrazione = registrazione;
        UtenteDAO utenteDAO = new UtenteDAO();
        AdminDAO adminDAO = new AdminDAO();
        // Mostra la finestra di login
        login.setController(this);
        login.setVisible(true);
    }

    protected void AccediUtente() {
        login.dispose();
        updatingUtente.dispose();
        acquistoUtentee.setController(this);
        acquistoUtentee.setVisible(true);
    }

    protected void AccediAdmin() {
        login.dispose();
        managerTesto.setController(this);
        managerTesto.setVisible(true);
    }

    protected void ApriLibri() {
        managerTesto.dispose();
        managerUtenti.dispose();
        interfacciaArticolo.dispose();
        interfacciaLibro.setController(this);
        interfacciaLibro.setVisible(true);
    }

    protected void ApriArticoli() {
        managerTesto.dispose();
        managerUtenti.dispose();
        interfacciaLibro.dispose();
        interfacciaArticolo.setController(this);
        interfacciaArticolo.setVisible(true);
    }

    protected void ApriUtenti() {
        interfacciaLibro.dispose();
        interfacciaArticolo.dispose();
        managerTesto.dispose();
        managerUtenti.setController(this);
        managerUtenti.setVisible(true);
    }
    protected void ApriTesti()
    {
        managerUtenti.dispose();
        interfacciaArticolo.dispose();
        interfacciaLibro.dispose();
        managerTesto.setController(this);
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
        updatingUtente.setVisible(true);
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


    public static void main(String[] args) {
        // Esempio di inizializzazione delle classi necessarie
        Login login = new Login();
        ManagerTesto managerTesto = new ManagerTesto();
        ManagerUtenti managerUtenti = new ManagerUtenti();
        UpdatingAdmin updatingadmin = new UpdatingAdmin();
        AcquistoUtentee acquistoUtentee = new AcquistoUtentee();
        Loading loading = new Loading();
        InterfacciaArticolo interfacciaArticolo = new InterfacciaArticolo();
        InterfacciaLibro interfacciaLibro = new InterfacciaLibro();
        UpdatingUtente updatingutente = new UpdatingUtente();
        Registrazione registrazione = new Registrazione();
        // Creazione dell'istanza del controller
        Controller controller = new Controller(login, managerTesto, managerUtenti, updatingadmin, acquistoUtentee, loading, interfacciaArticolo, interfacciaLibro, updatingutente, registrazione);
    }
}
