use noten;
 set foreign_key_checks = 0;
 truncate table noten;
 truncate table notenart;
 truncate table personen;
 truncate table studiengang;
 truncate table studienfaecher;
 use noten;
 -- Studiengang:
  -- idStudienfach, studiengang_id, bezeichnung, semester, dozent_id
insert into studiengang values(1,1,'Verwaltungsinformatik',6,4);

 -- Personen:(Rolle: *Student: 1 *Dozent:2
 -- -Dozenten:
 -- idPersonen, nachname, vorname, bio_geschlecht, Gebdat, passwort, rolle, studiengang_id
insert into personen values(1, 'Mueller', 'Hans', 1,'1980-1-1','passwort', 1,1);
insert into personen values(2, 'Meier', 'Sepp', 1,'1980-1-1','passwort', 1,1);
insert into personen values(3, 'Hintertupfinger', 'Johann', 1,'1981-5-7','passwort', 1,1);
insert into personen values(4, 'Gscheidmeier', 'Michaela', 0,'1975-10-3','passwort', 1,1);
insert into personen values(5, 'Obermüller', 'Stefanie', 0,'1970-4-5','passwort', 1,1);
insert into personen values(6, 'Schlau', 'Horst', 1,'1973-2-3','passwort', 1,1);

 -- -Studenten: 
 insert into personen values(20171001, 'Schmidt', 'Tom', 1,'1990-2-2','passwort', 2,1);
 insert into personen values(20171002, 'Schröder', 'Dennis', 1,'1995-2-2','passwort', 2,1);
 insert into personen values(20171003, 'Faul', 'Manfred', 1,'1993-3-4','passwort', 2,1);
 insert into personen values(20171004, 'Schlau', 'Kevin', 1,'1988-6-5','passwort', 2,1);
 insert into personen values(20171005, 'Mayer', 'Julia', 1,'1995-9-8','passwort', 2,1);
 
 -- Studienfaecher
 -- id, studeingangId, bezeichnung, Semester, Dozent_id
insert into studienfaecher values(1001, 1, 'OOP', 1, 1);
insert into studienfaecher values(1002, 1, 'Mathematik', 1, 2);
insert into studienfaecher values(1003, 1, 'GdRT', 1, 3);
insert into studienfaecher values(1004, 1, 'GdI', 1, 4);
insert into studienfaecher values(1005, 1, 'Betriebssysteme', 1, 5);
insert into studienfaecher values(1006, 1, 'Statistik', 2, 6);
insert into studienfaecher values(1007, 1, 'Datenbanken', 2, 1);


-- Notenart
-- idNotenart, studiengang_id, bezeichnung
insert into notenart values(1,1,'Klausur schriftlich 90 Minuten');
insert into notenart values(2,1,'Leistungsnachweis FH');

-- Noten:
-- idNoten, studienfach_id, note, wunschnote, matnr,notenart_id, einzelgewicht
-- Noten Student1:
insert into noten values(1,1001,7,10,20171001, 1, 5000);
insert into noten values(2,1001,4,10,20171001, 2, 1000);
insert into noten values(3,1002,6,10,20171001, 1, 5000);
insert into noten values(4,1003,8,10,20171001, 1, 5000);
insert into noten values(5,1004,12,10,20171001, 1, 5000);
insert into noten values(6,1005,10,10,20171001, 1, 5000);
insert into noten values(7,1006,3,10,20171001, 2, 1000);

-- Noten Student 2:
insert into noten values(8,1001,6,10,20171002, 1, 5000);
insert into noten values(9,1001,7,10,20171002, 2, 1000);
insert into noten values(10,1002,8,10,20171002, 1, 5000);
insert into noten values(11,1003,9,10,20171002, 1, 5000);
insert into noten values(12,1004,12,10,20171002, 1, 5000);
insert into noten values(13,1005,13,10,20171002, 1, 5000);
insert into noten values(14,1006,5,10,20171002, 2, 1000);

-- Noten Student 3:
insert into noten values(15,1001,8,10,20171003, 1, 5000);
insert into noten values(16,1001,6,10,20171003, 2, 1000);
insert into noten values(17,1002,2,10,20171003, 1, 5000);
insert into noten values(18,1003,10,10,20171003, 1, 5000);
insert into noten values(19,1004,12,10,20171003, 1, 5000);
insert into noten values(20,1005,13,10,20171003, 1, 5000);
insert into noten values(21,1006,15,10,20171003, 2, 1000);

-- Noten Student 4:
insert into noten values(22,1001,14,10,20171004, 1, 5000);
insert into noten values(23,1001,12,10,20171004, 2, 1000);
insert into noten values(24,1002,11,10,20171004, 1, 5000);
insert into noten values(25,1003,12,10,20171004, 1, 5000);
insert into noten values(26,1004,8,10,20171004, 1, 5000);
insert into noten values(27,1005,7,10,20171004, 1, 5000);
insert into noten values(28,1006,2,10,20171004, 2, 1000);

-- Noten Student 5:

insert into noten values(29,1001,8,10,20171005, 1, 5000);
insert into noten values(30,1001,9,10,20171005, 2, 1000);
insert into noten values(31,1002,10,10,20171005, 1, 5000);
insert into noten values(32,1003,11,10,20171005, 1, 5000);
insert into noten values(33,1004,12,10,20171005, 1, 5000);
insert into noten values(34,1005,13,10,20171005, 1, 5000);
insert into noten values(35,1006,5,10,20171005, 2, 1000);

-- idNoten, studienfach_id, note, wunschnote, matnr,notenart_id, einzelgewicht
-- Noten für Fach Datenbanken
insert into noten values(36,1007,14,10,20171001, 1, 5000);
insert into noten values(37,1007,13,10,20171002, 1, 5000);
insert into noten values(38,1007,15,10,20171003, 1, 5000);
insert into noten values(39,1007,11,10,20171004, 1, 5000);
insert into noten values(40,1007,10,10,20171005, 1, 5000);
insert into noten values(41,1007,9,10,20171001, 1, 5000);


set foreign_key_checks = 1;




