use noten;
set foreign_key_checks = 0;

-- Es wird emphohlen, alles was man selbst in die Datenbank geschrieben hat, zu entfernen:
-- truncate table tablename;


-- idStudiengang, studiengangsleiter int, bezeichnung, anz_semester = 6, grundstudiumBis = 3
insert into studiengang values(1,1,'Verwaltungsinformatik',6,5);
-- idStudienfach, studiengang_id, bezeichnung, semester, dozent_id
insert into studienfaecher values(1001, 1, 'OOP', 1, 2001);
-- idPersonen, nachname, vorname, bio_geschlecht, Gebdat, passwort, rolle, studiengang_id
insert into personen values(1, 'Mueller', 'Hans', 1,'1980-1-1','passwort', 1,1);
-- show warnings;

-- idNotenart, studiengang_id, bezeichnung
insert into notenart values(1,1,'Klausur schriftlich 90 Minuten');

-- idNoten, studienfach_id, note, wunschnote, matnr,notenart_id, einzelgewicht
insert into noten values(1,1001,5,10,20171000, 1, 5000);

-- idPersonen, nachname, vorname, bio_geschlecht, Gebdat, passwort, rolle, studiengang_id
insert into personen values(20171000, 'Schmidt', 'Tom', 1,'1990-2-2','passwort', 2,1);

-- select * from personen;
set foreign_key_checks = 1;

select n.note, p.Nachname from noten n, personen p where n.Matrikelnr = p.idPersonen;