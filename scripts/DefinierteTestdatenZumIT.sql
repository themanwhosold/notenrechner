-- Einschreiben eines Testusers für Integrationstests
-- Als Testkennung werden MAtrikelnummern, mit 9999 beginnend verwendet

use noten;
set foreign_key_checks = 0;
-- select * from notenart;
insert into personen values(99994711,'Leiter-Test','Oberster-Test', 1,'1950-1-1', 'passwort',1,2);
insert into studiengang values(9990000,99994711,'TEST-Verwaltungsinformatik',6,3); 
-- -Studenten: 
insert into personen values(99990000, 'Test-Mustermann', 'Test-Max', 1,'2000-1-1','passwort', 2,99990000);
-- Studienfaecher Die Dozent ID ist immer eins, da egal
-- erstes Semester
insert into studienfaecher values(99992001, 99990000, 'Objektorientierte Programmierung 1', 1, 99994711);
insert into studienfaecher values(99992002, 99990000, 'Mathematik 1', 1, 99994711);
insert into studienfaecher values(99992003, 99990000, 'Grundlagen der Rechnertechnik', 1, 99994711);
insert into studienfaecher values(99992004, 99990000, 'Grundlagen der Informatik', 1, 99994711);
insert into studienfaecher values(99992005, 99990000, 'Betriebssysteme 1', 1, 99994711);
-- zweites Semester
insert into studienfaecher values(99992006, 99990000, 'Objektorientierte Programmierung 2', 2, 99994711);
insert into studienfaecher values(99992007, 99990000, 'Rechnernetze 1', 2, 99994711);
insert into studienfaecher values(99992008, 99990000, 'Datenbanken 1', 2, 99994711);
insert into studienfaecher values(99992009, 99990000, 'Software Engineering 1', 2, 99994711);
insert into studienfaecher values(99992010, 99990000, 'Computergestuetzte Geschaeftsprozesse', 2, 99994711);
insert into studienfaecher values(99992011, 99990000, 'Statistik', 2, 99994711);
-- drittes Semster
insert into studienfaecher values(99992012, 99990000, 'Allgemeines Staats- und Verwaltungsrecht', 3, 99994711);
insert into studienfaecher values(99992013, 99990000, 'Kosten- und Leistungsrechnung; Controlling; Wirtschaftslichkeitsrechnung', 3, 99994711);
insert into studienfaecher values(99992014, 99990000, 'Recht der Informationstechnologie 1', 3, 99994711);
insert into studienfaecher values(99992015, 99990000, 'Verwaltungslehre', 3, 99994711);
-- viertes Semester
insert into studienfaecher values(99992016, 99990000, 'Betriebssysteme 2', 4, 99994711);
insert into studienfaecher values(99992017, 99990000, 'Datenbanken 2', 4, 99994711);
insert into studienfaecher values(99992018, 99990000, 'Geschaeftsprozessmanagment', 4, 99994711);
insert into studienfaecher values(99992019, 99990000, 'Rechnernetze 2', 4, 99994711);
insert into studienfaecher values(99992020, 99990000, 'Serverseitiges Programmieren mit JAVA', 4, 99994711);
insert into studienfaecher values(99992021, 99990000, 'Algorithmen und Datenstrukturen', 4, 99994711);
insert into studienfaecher values(99992022, 99990000, 'Allgemeinwissenschaftliches Wahlpflichtfach', 4, 99994711);
-- fuenftes Semester
insert into studienfaecher values(99992023, 99990000, 'Effizientes Programmieren mit C/C++', 5, 99994711);
insert into studienfaecher values(99992024, 99990000, 'Geographische Informationssysteme', 5, 99994711);
insert into studienfaecher values(99992025, 99990000, 'Software Engineering 2', 5, 99994711);
insert into studienfaecher values(99992026, 99990000, 'Software - Projektmanagement', 5, 99994711);
insert into studienfaecher values(99992027, 99990000, 'Seminar', 5, 99994711);
insert into studienfaecher values(99992028, 99990000, 'Programmier Praktikum', 5, 99994711);
insert into studienfaecher values(99992029, 99990000, 'Seminar Referat', 5, 99994711);
insert into studienfaecher values(99993030, 99990000, 'Muendliche Pruefung FH', 5, 99994711);
-- Sechstes Semester
insert into studienfaecher values(99992030, 99990000, 'Datenschutz', 6, 99994711);
insert into studienfaecher values(99992031, 99990000, 'Recht der Informationstechnologie einschliessslich Vertrags- und Vergaberecht', 6, 99994711);
insert into studienfaecher values(99992032, 99990000, 'Bueroautomation und DV Anwendungen', 6, 99994711);
insert into studienfaecher values(99992033, 99990000, 'Kommunal/Staatliche Wirtschaftsfuehrung', 6, 99994711);
insert into studienfaecher values(99992034, 99990000, 'Muendliche Pruefung FHVR', 6, 99994711);
insert into studienfaecher values(99992035, 99990000, 'Praxisbeurteilung', 6, 99994711);


insert into noten values(99990101,99992001,11,10,20130000, 1, 190667); -- OOP
insert into noten values(99990106,99992001,15,10,20130000, 2, 69333); -- OOP Leistungsnachweis
insert into noten values(99990102,99992002,14,10,20130000, 1, 190667); -- Mathematik 1
insert into noten values(99990103,99992003,13,10,20130000, 1, 190667); -- Grundlagen der Rechnertechnik
insert into noten values(99990104,99992004,11,10,20130000, 1, 190667); -- Grundlagen der Informatik
insert into noten values(99990105,99992005,13,10,20130000, 1, 190667); -- Betriebssysteme 1
-- zweites Semester -> 6 Noten
insert into noten values(99990107,99992006,15,10,20130000, 1, 190667); -- Objektorientierte Programmierung 2
insert into noten values(99990108,99992007,13,10,20130000, 1, 190667); -- Rechnernetze 1
insert into noten values(99990109,99992008,12,10,20130000, 1, 190667); -- Datenbanken 1
insert into noten values(99990110,99992009,8,10,20130000, 1, 190667); -- Software Engineering 1
insert into noten values(99990111,99992010,13,10,20130000, 2, 69333); -- Computergestuetzte Geschaeftsprozesse
insert into noten values(99990112,99992011,9,10,20130000, 2, 69333); -- Statistik
-- drittes Semster -> 4 Noten
insert into noten values(99990113,99992012,12,10,20130000, 1, 286000); -- Allgemeines Staats- und Verwaltungsrecht
insert into noten values(99990114,99992013,13,10,20130000, 1, 286000); -- Kosten- und Leistungsrechnung; Controlling; Wirtschaftslichkeitsrechnung
insert into noten values(99990115,99992014,9,10,20130000, 2, 52000);	-- Recht der Informationstechnologie 1
insert into noten values(99990116,99992015,12,10,20130000, 2, 52000); -- Verwaltungslehre
-- Ende Grundstudium
-- viertes Semester -> 8 Noten
insert into noten values(99990117,99992016,15,10,20130000, 1, 400000); -- Betriebssysteme 2
insert into noten values(99990118,99992017,15,10,20130000, 1, 400000); -- Datenbanken 2
insert into noten values(99990119,99992018,15,10,20130000, 1, 400000); -- Geschaeftsprozessmanagment
insert into noten values(99990120,99992019,15,10,20130000, 1, 400000); -- Rechnernetze 2
insert into noten values(99990121,99992020,15,10,20130000, 1, 400000); -- Serverseitiges Programmieren mit JAVA
insert into noten values(99990124,99992020,15,10,20130000, 2, 80000);	-- SSP Leistungsnachweis
insert into noten values(99990122,99992021,15,10,20130000, 1, 400000); -- Algorithmen und Datenstrukturen
insert into noten values(99990123,99992022,15,10,20130000, 2, 80000); -- WPF
-- Fuenftes Semester -> 9 Noten
insert into noten values(99990125,99992023,15,10,20130000, 1, 400000); -- Effizientes Programmieren mit C/C++
insert into noten values(99990126,99992024,15,10,20130000, 1, 400000); -- Geographische Informationssysteme
insert into noten values(99990127,99992025,15,10,20130000, 1, 400000); -- SE 2
insert into noten values(99990200,99992025,15,10,20130000, 2, 80000); -- SE 2 Leistungsnachweis
insert into noten values(99990128,99992026,15,10,20130000, 1, 400000); -- Software - Projektmanagement
insert into noten values(99990129,99992027,15,10,20130000, 1, 500000); -- Seminararbeit
insert into noten values(99990130,99992028,15,10,20130000, 2, 80000);	-- Programmier Praktikum
insert into noten values(99990131,99992029,15,10,20130000, 2, 80000); -- Seminarreferat
insert into noten values(99990132,99993030,15,10,20130000, 1, 400000); -- Muendliche FH
-- Sechstes Semester -> 6 Noten
insert into noten values(99990133,99992030,15,10,20130000, 1, 400000); -- Datenschutz
insert into noten values(99990134,99992031,15,10,20130000, 1, 400000); -- Recht der Informationstechnologie einschliessslich Vertrags- und Vergaberecht
insert into noten values(99990135,99992032,15,10,20130000, 1, 400000); -- Bueroautomation und DV Anwendungen
insert into noten values(99990136,99992033,15,10,20130000, 2, 100000); -- Leistungsnachweis Kommunal/Staatliche Wirtschaftsfuehrung
insert into noten values(99990137,99992034,15,10,20130000, 1, 400000); -- Muendliche Pruefung FHVR
insert into noten values(99990138,99992035,15,10,20130000, 1, 400000);	-- Praxisbeurteilung

set foreign_key_checks = 1;