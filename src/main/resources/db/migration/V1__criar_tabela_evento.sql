-- V1_criar_tabela_evento.sql

 CREATE TABLE Eventos (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    first_Name varchar(255) NOT NULL,
    beginning TIMESTAMP NOT NULL,
    the_End TIMESTAMP NOT NULL,
    description TEXT,
    identification VARCHAR(255) NOT NULL UNIQUE,
    localization varchar(255),
    capacity INTEGER NOT NULL,
    organizer varchar(255),
    event_Type VARCHAR(50) NOT NULL
 )