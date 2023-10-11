package com.mycompany.bibiotecadigitale.gui;

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

    public Controller(Login login, ManagerTesto managerTesto, ManagerUtenti managerUtenti, UpdatingAdmin updatingAdmin, AcquistoUtentee acquistoUtentee, Loading loading, InterfacciaArticolo interfacciaArticolo, InterfacciaLibro interfacciaLibro, UpdatingUtente updatingUtente) {
        this.login = login;
        this.managerTesto = managerTesto;
        this.managerUtenti = managerUtenti;
        this.updatingAdmin = updatingAdmin;
        this.acquistoUtentee = acquistoUtentee;
        this.loading = loading;
        this.interfacciaArticolo = interfacciaArticolo;
        this.interfacciaLibro = interfacciaLibro;
        this.updatingUtente = updatingUtente;

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
        login.setController(this);
        login.setVisible(true);
    }
    protected void ApriModificaUtente()
    {
        acquistoUtentee.dispose();
        updatingUtente.setController(this);
        updatingUtente.setVisible(true);
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

        // Creazione dell'istanza del controller
        Controller controller = new Controller(login, managerTesto, managerUtenti, updatingadmin, acquistoUtentee, loading, interfacciaArticolo, interfacciaLibro, updatingutente);
    }
}
