CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;
CREATE TABLE IF NOT EXISTS animals(id SERIAL PRIMARY KEY , name varchar,rangerName varchar);
CREATE TABLE IF NOT EXISTS sightings(id SERIAL PRIMARY KEY ,name varchar,age varchar,health varchar,location varchar,rangerName varchar);
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;