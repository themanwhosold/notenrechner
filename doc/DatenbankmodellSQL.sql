create database noten;
use noten;

SET foreign_key_checks = 0;
SET foreign_key_checks = 1;

drop table studenten;
drop table studienfaecher;
drop table noten;
drop table studiengang;

create table studenten (
matrikelnummer INT not null
,vorname nvarchar(100) not null
,nachname nvarchar(100) not null
,geburtsdatum date not null
,geschlecht bit not null
,addresse nvarchar(100)
,studiengangID int not null
,primary key(matrikelnummer)
,foreign key (studiengangID) references studiengang(id)
);

create table noten (
id int not null
,matrikelnummer INT not null
,studienfachID int not null
,note int not null
,primary key(id)
,foreign key (matrikelnummer) references studenten(matrikelnummer)
,foreign key (studienfachID) references studienfaecher(id)
);

create table studienfaecher (
id int not null
,studiengangID int not null
,bezeichnung nvarchar(100) not null
,ort nvarchar(100)
,zeit time
,dozent nvarchar(100)
,gewichtung int not null
,primary key(id)
,foreign key (studiengangID) references studiengang(id)
);

create table studiengang(
id int not null
,studiengangsleiter nvarchar(100) not null
,bezeichnung nvarchar(100) not null
,primary key(id)
);

insert into studenten values(
201747113
,'Max'
,'Stift'
,'1999.5.13'
,1
,'Berlin, Straße 12'
,1
);

insert into studiengang values(
1
,'Meister des Studiengangs'
,'Verwaltungsinformatik'
);


insert into studienfaecher values(
42
,1 
,'Unsinniges Fach'
,'Bei dir Zuhause'
,'12:00:00'
,'Dozent'
,100
);
insert into studienfaecher values(
43
,1 
,'Sinniges Fach'
,'FHVR Hof'
,'15:00:00'
,'HWU'
,100
);

insert into noten values(
4712
,201747113
,42
,15
);
insert into noten values(
4713
,201747113
,43
,11
);


delete from studenten where matrikelnummer > 1;
select * from studenten;
select * from studiengang;
select * from studienfaecher;
select * from noten;

select st.bezeichnung, s.vorname, s.matrikelnummer ,avg(n.note) Durchschnittsnote from studiengang st, studenten s, noten n where n.matrikelnummer = s.matrikelnummer and st.id = s.studiengangID;

