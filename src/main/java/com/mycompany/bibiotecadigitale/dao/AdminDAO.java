package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Admin;

import java.util.List;

public interface AdminDAO {
    List<Admin> getAllAdmins();

    void insertAdmin(Admin admin);

    void updateAdmin(Admin admin);

    void deleteAdmin(int id);

    boolean verificaCredenziali(int codiceUtente, String passwordUtente);

    void updatePassword(int codiceUtente, String nuovaPassword);

    // Altri metodi CRUD e metodi accessori qui

    void close();
}
