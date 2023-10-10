CREATE TABLE Utente (
    codUtente INT PRIMARY KEY,
    nome VARCHAR(255),
    cognome VARCHAR(255),
    email VARCHAR(255),
    telefono BIGINT,
    password VARCHAR(255)
);


CREATE TABLE Testo (
    codTesto INT PRIMARY KEY,
    titolo VARCHAR(255),
    annoPubblicazione DATE,
    formato VARCHAR(255),
    edizione VARCHAR(255),
    disponibilita BOOLEAN,
    tipologia VARCHAR(255)
);


CREATE TABLE Libro (
    codTesto INT PRIMARY KEY,
    genere VARCHAR(255),
    capitoli INT,
    pagine INT,
    Evento VARCHAR(255),
    Collana VARCHAR(255),
    FOREIGN KEY (codTesto) REFERENCES Testo(codTesto) ON DELETE CASCADE
);



CREATE TABLE ArticoloScientifico (
    codTesto INT PRIMARY KEY,
    universita VARCHAR(255),
    riassunto TEXT,
    nomerivista VARCHAR(255),
    argomento VARCHAR(255),
    responsabile VARCHAR(255),
    luogoconferenza VARCHAR(255),
    dataconferenza DATE,
    FOREIGN KEY (codTesto) REFERENCES Testo(codTesto) ON DELETE CASCADE
);
CREATE TABLE Admin (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    password VARCHAR(255)
);
CREATE TABLE Richiesta (
    CodRichiesta INT PRIMARY KEY, 
    DataRichiesta DATE, 
    CodiceUtente INT, 
    CodiceTesto INT,
    FOREIGN KEY (CodiceUtente) REFERENCES Utente(codUtente) ON DELETE CASCADE,
    FOREIGN KEY (CodiceTesto) References Testo(codTesto) ON DELETE CASCADE
);
    

