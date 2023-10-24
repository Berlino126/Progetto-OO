package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Utente;

import java.util.List;

public interface UtenteDAO {
    List<Utente> getAllUtenti();
    void insertUtente(Utente utente);
    void updateUtente(String nome, String cognome, String email, long telefono);
    void deleteUtente(int codiceUtente);
    boolean utenteExists(int codice);
    void registerUtente(String nome, String cognome, String email, long telefono, String password);
    boolean verificaCredenziali(int codiceUtente, String passwordUtente);
    void updatePassword(int codiceUtente, String nuovaPassword);
    void close();
    int getUtenteRegistrato();
}

