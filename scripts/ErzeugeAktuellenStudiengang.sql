-- Nachbau unseres aktuellen STudienganges
-- Achtung alle Faecher werden vom selben Dozenten, der auch Studiengangsleiter ist unterrichtet!

use noten;
set foreign_key_checks = 0;
-- select * from notenart;
insert into personen values(4711,'Leiter','Oberster', 1,'1950-1-1', 'passwort',1,2);
insert into studiengang values(2,4711,'Verwaltungsinformatik 2013/2016',6,3); 
-- -Studenten: 
insert into personen values(20130000, 'Mustermann', 'Max', 1,'2000-1-1','passwort', 2,2);
-- Studienfaecher Die Dozent ID ist immer eins, da egal
-- erstes Semester
insert into studienfaecher values(2001, 2, 'Objektorientierte Programmierung 1', 1, 4711);
insert into studienfaecher values(2002, 2, 'Mathematik 1', 1, 4711);
insert into studienfaecher values(2003, 2, 'Grundlagen der Rechnertechnik', 1, 4711);
insert into studienfaecher values(2004, 2, 'Grundlagen der Informatik', 1, 4711);
insert into studienfaecher values(2005, 2, 'Betriebssysteme 1', 1, 4711);
-- zweites Semester
insert into studienfaecher values(2006, 2, 'Objektorientierte Programmierung 2', 2, 4711);
insert into studienfaecher values(2007, 2, 'Rechnernetze 1', 2, 4711);
insert into studienfaecher values(2008, 2, 'Datenbanken 1', 2, 4711);
insert into studienfaecher values(2009, 2, 'Software Engineering 1', 2, 4711);
insert into studienfaecher values(2010, 2, 'Computergestuetzte Geschaeftsprozesse', 2, 4711);
insert into studienfaecher values(2011, 2, 'Statistik', 2, 4711);
-- drittes Semster
insert into studienfaecher values(2012, 2, 'Allgemeines Staats- und Verwaltungsrecht', 3, 4711);
insert into studienfaecher values(2013, 2, 'Kosten- und Leistungsrechnung; Controlling; Wirtschaftslichkeitsrechnung', 3, 4711);
insert into studienfaecher values(2014, 2, 'Recht der Informationstechnologie 1', 3, 4711);
insert into studienfaecher values(2015, 2, 'Verwaltungslehre', 3, 4711);
-- viertes Semester
insert into studienfaecher values(2016, 2, 'Betriebssysteme 2', 4, 4711);
insert into studienfaecher values(2017, 2, 'Datenbanken 2', 4, 4711);
insert into studienfaecher values(2018, 2, 'Geschaeftsprozessmanagment', 4, 4711);
insert into studienfaecher values(2019, 2, 'Rechnernetze 2', 4, 4711);
insert into studienfaecher values(2020, 2, 'Serverseitiges Programmieren mit JAVA', 4, 4711);
insert into studienfaecher values(2021, 2, 'Algorithmen und Datenstrukturen', 4, 4711);
insert into studienfaecher values(2022, 2, 'Allgemeinwissenschaftliches Wahlpflichtfach', 4, 4711);
-- fuenftes Semester
insert into studienfaecher values(2023, 2, 'Effizientes Programmieren mit C/C++', 5, 4711);
insert into studienfaecher values(2024, 2, 'Geographische Informationssysteme', 5, 4711);
insert into studienfaecher values(2025, 2, 'Software Engineering 2', 5, 4711);
insert into studienfaecher values(2026, 2, 'Software - Projektmanagement', 5, 4711);
insert into studienfaecher values(2027, 2, 'Seminar', 5, 4711);
insert into studienfaecher values(2028, 2, 'Programmier Praktikum', 5, 4711);
insert into studienfaecher values(2029, 2, 'Seminar Referat', 5, 4711);
insert into studienfaecher values(3030, 2, 'Muendliche Pruefung FH', 5, 4711);
-- Sechstes Semester
insert into studienfaecher values(2030, 2, 'Datenschutz', 6, 4711);
insert into studienfaecher values(2031, 2, 'Recht der Informationstechnologie einschliessslich Vertrags- und Vergaberecht', 6, 4711);
insert into studienfaecher values(2032, 2, 'Bueroautomation und DV Anwendungen', 6, 4711);
insert into studienfaecher values(2033, 2, 'Kommunal/Staatliche Wirtschaftsfuehrung', 6, 4711);
insert into studienfaecher values(2034, 2, 'Muendliche Pruefung FHVR', 6, 4711);
insert into studienfaecher values(2035, 2, 'Praxisbeurteilung', 6, 4711);

insert into notenart values(3,2,'Klausur');
insert into notenart values(4,2,'Leistungsnachweis');
-- Gewichtung mit 100_000 multipliziert
-- erstes Semester -> 6 Noten
-- Genau  = 190666,666 und 693,333
insert into noten values(101,2001,11,10,20130000, 1, 190667); -- OOP
insert into noten values(106,2001,15,10,20130000, 2, 69333); -- OOP Leistungsnachweis
insert into noten values(102,2002,14,10,20130000, 1, 190667); -- Mathematik 1
insert into noten values(103,2003,13,10,20130000, 1, 190667); -- Grundlagen der Rechnertechnik
insert into noten values(104,2004,11,10,20130000, 1, 190667); -- Grundlagen der Informatik
insert into noten values(105,2005,13,10,20130000, 1, 190667); -- Betriebssysteme 1
-- zweites Semester -> 6 Noten
insert into noten values(107,2006,15,10,20130000, 1, 190667); -- Objektorientierte Programmierung 2
insert into noten values(108,2007,13,10,20130000, 1, 190667); -- Rechnernetze 1
insert into noten values(109,2008,12,10,20130000, 1, 190667); -- Datenbanken 1
insert into noten values(110,2009,8,10,20130000, 1, 190667); -- Software Engineering 1
insert into noten values(111,2010,13,10,20130000, 2, 69333); -- Computergestuetzte Geschaeftsprozesse
insert into noten values(112,2011,9,10,20130000, 2, 69333); -- Statistik
-- drittes Semster -> 4 Noten
insert into noten values(113,2012,12,10,20130000, 1, 286000); -- Allgemeines Staats- und Verwaltungsrecht
insert into noten values(114,2013,13,10,20130000, 1, 286000); -- Kosten- und Leistungsrechnung; Controlling; Wirtschaftslichkeitsrechnung
insert into noten values(115,2014,9,10,20130000, 2, 52000);	-- Recht der Informationstechnologie 1
insert into noten values(116,2015,12,10,20130000, 2, 52000); -- Verwaltungslehre
-- Ende Grundstudium
-- viertes Semester -> 8 Noten
insert into noten values(117,2016,15,10,20130000, 1, 400000); -- Betriebssysteme 2
insert into noten values(118,2017,15,10,20130000, 1, 400000); -- Datenbanken 2
insert into noten values(119,2018,15,10,20130000, 1, 400000); -- Geschaeftsprozessmanagment
insert into noten values(120,2019,15,10,20130000, 1, 400000); -- Rechnernetze 2
insert into noten values(121,2020,15,10,20130000, 1, 400000); -- Serverseitiges Programmieren mit JAVA
insert into noten values(124,2020,15,10,20130000, 2, 80000);	-- SSP Leistungsnachweis
insert into noten values(122,2021,15,10,20130000, 1, 400000); -- Algorithmen und Datenstrukturen
insert into noten values(123,2022,15,10,20130000, 2, 80000); -- WPF
-- Fuenftes Semester -> 9 Noten
insert into noten values(125,2023,15,10,20130000, 1, 400000); -- Effizientes Programmieren mit C/C++
insert into noten values(126,2024,15,10,20130000, 1, 400000); -- Geographische Informationssysteme
insert into noten values(127,2025,15,10,20130000, 1, 400000); -- SE 2
insert into noten values(200,2025,15,10,20130000, 2, 80000); -- SE 2 Leistungsnachweis
insert into noten values(128,2026,15,10,20130000, 1, 400000); -- Software - Projektmanagement
insert into noten values(129,2027,15,10,20130000, 1, 500000); -- Seminararbeit
insert into noten values(130,2028,15,10,20130000, 2, 80000);	-- Programmier Praktikum
insert into noten values(131,2029,15,10,20130000, 2, 80000); -- Seminarreferat
insert into noten values(132,3030,15,10,20130000, 1, 400000); -- Muendliche FH
-- Sechstes Semester -> 6 Noten
insert into noten values(133,2030,15,10,20130000, 1, 400000); -- Datenschutz
insert into noten values(134,2031,15,10,20130000, 1, 400000); -- Recht der Informationstechnologie einschliessslich Vertrags- und Vergaberecht
insert into noten values(135,2032,15,10,20130000, 1, 400000); -- Bueroautomation und DV Anwendungen
insert into noten values(136,2033,15,10,20130000, 2, 100000); -- Leistungsnachweis Kommunal/Staatliche Wirtschaftsfuehrung
insert into noten values(137,2034,15,10,20130000, 1, 400000); -- Muendliche Pruefung FHVR
insert into noten values(138,2035,15,10,20130000, 1, 400000);	-- Praxisbeurteilung

set foreign_key_checks = 1;
-- select count(*) from noten where Matrikelnr = 20130000;
-- select s.grundstudiumBis from studiengang s, personen p where p.studiengang_id = s.idStudiengang and p.idPersonen = 20130000;
-- select * from personen where idPersonen = 20130000;
-- select * from studienfaecher where dozent_id = 4711;

-- select n.* from noten n,studienfaecher s where n.Matrikelnr = 20130000 and n.studienfach_id = s.idStudienfach and s.semester <= 3 and n.notenart_id = 2;
 -- select * from noten where Matrikelnr = 20130000;
-- delete from noten where Matrikelnr = 20130000;
-- select * from noten where Matrikelnr = 20130000;
-- select * from personen;
-- select p.* from studiengang s, personen p where s.idStudiengang = p.studiengang_id and s.idStudiengang = 2;