-- SCHEMA: lista_afazeres

-- DROP SCHEMA IF EXISTS lista_afazeres ;

CREATE SCHEMA IF NOT EXISTS lista_afazeres
    AUTHORIZATION postgres;

ALTER DEFAULT PRIVILEGES FOR ROLE postgres IN SCHEMA lista_afazeres
GRANT ALL ON TABLES TO postgres;

CREATE TABLE item (
	id serial PRIMARY KEY,
	nome VARCHAR ( 50 ) NOT NULL,
	data VARCHAR ( 50 ) NOT NULL,
	descricao VARCHAR ( 255 ) NOT NULL
);
