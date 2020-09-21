CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;
CREATE TABLE animals (id serial PRIMARY KEY, name varchar);
CREATE TABLE   sightings(id serial PRIMARY KEY,animalName varchar,animalAge int,animalHealth varchar,location varchar);
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;