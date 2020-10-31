DROP TABLE IF EXISTS patients;
CREATE TABLE patients(id serial PRIMARY KEY, name VARCHAR(255), bsn VARCHAR(255));

DROP TABLE IF EXISTS medicines;
CREATE TABLE medicines(id serial PRIMARY KEY, name VARCHAR (255), unit_type VARCHAR(255),
 units integer, quantity_type VARCHAR (255), quantity integer );

DROP TABLE IF EXISTS  prescriptions;
CREATE TABLE  prescriptions (id serial PRIMARY KEY, patient_id serial, delivery_method VARCHAR(255),
prescription_date VARCHAR(255), prescription_end_date VARCHAR(255));

DROP TABLE IF EXISTS medicine_prescription;
CREATE TABLE medicine_prescription(prescription_id serial, medicine_id serial, instruction VARCHAR (255), PRIMARY KEY(prescription_id,medicine_id));