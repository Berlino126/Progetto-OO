CREATE TABLE Utente (
    codUtente INT PRIMARY KEY,
    nome VARCHAR(255),
    cognome VARCHAR(255),
    email VARCHAR(255),
    telefono BIGINT
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
    FOREIGN KEY (codTesto) REFERENCES Testo(codTesto) ON DELETE CASCADE
);


CREATE TABLE ArticoloScientifico (
    codTesto INT PRIMARY KEY,
    universita VARCHAR(255),
    riassunto TEXT,
    FOREIGN KEY (codTesto) REFERENCES Testo(codTesto) ON DELETE CASCADE
);
