# Protokoll zum Kickoff Meeting für das Projekt SE II
erstellt am: 2015-10-13 09:56:08-CEST  1444722968

### Tagesordnung:
I.) Diskussion über Grundlagen des Projekts

- Frontend: Webseite (Java Server Faces)
	- keine App
	- keine JavaFX Oberfläche
	- Bootstrap oder AngularJS (optional)

- DB Anbindung: 
	- Hibernate

- Test:
	- Testdaten generieren oder bereits vorhandene Echtdaten verwenden
	- JUnit?

- Lasten und Pflichtenheft:
 1.) Hochschule
	- Ortsunabhängiger Aufruf
	- Dozenten sollen von jedem Ort der Erde Noten einpflegen können.
	- Dozenten können ihre Prüfungen aufrufen und auswerten
	- Ein Admin (Studiengangsleiter) soll die Gewichting der Noten ändern können.
	- Admin soll Fächer zwischen den Semestern verschieben können
	- Statistik mit grafischer Aufarbeitung
		- Aufruf von jedem, Einzelnoten können nur vom jeweiligen Studenten gesehen werden
		- Nachprüfungen werden wie Erstversuch behandelt
		- Möglichkeit Leistungsnachweise in die Prüfungsnote einrechnen oder nicht
		- 
	- Reminder für Dozenten zur Eingabe der Prüfungsnoten (Mail 4 Wochen nach Prüfungsende)
	- Reminder für Studenten wenn neue Noten vorliegen (E-Mail)
	- Studiengang kann per Drag&Drop zusammengestellt werden (durch den Studiengangsleiter)
	- Studiengang kann dupliziert und bearbeitet werden

	- Authentifizierung: Über vorhandene User (JAAS mit LDAP)
	- benötigte Rollen:
		- Dozent/Prüfungsamt
			- kann nur Noten eintragen
			- seine Prüfungen einsehen
		- Studiengangsleiter (Admin)
			- kann Gewichtung ändern
		- Student
			- Einsicht, Wunsch-/Traumnoten

 2.) Student
 	- Reminder wenn neue Noten da sind
	- Wunschnoten können eingetragen werden und werden überschrieben wenn "echte" Noten vorhanden sind ODER "echte" Noten stehen neben den Traumnoten
	- Statistik (farblich aufbereitet in der Notenübersicht, z.B. grün = über dem Durchschnitt & bestanden, rot = durchgefallen, gelb = bestanden, aber unter dem Durchschnitt)
	- Ortsunabhängiger Abruf
	- Übersicht über nicht bestandene Klausuren bzw. unterpunktete Leistungsnachweise
	- Zwischennoten (welche Noten hatte ich in ZP?), Anzeige welche Noten noch notwendig sind um zu bestehen (Leistungsnachweise)
	-  

II.) Verwendete Programme

- Programmierumgebung: Netbeans 8.0.2
- UML-Tool: StarUML
- Java Version 8u60 (aktuelleste Version), Java EE 7
- Versionsverwaltung: Github
- Applicationserver: Wildfly
- Buildumgebung Maven
- Testumgebung Linux-VM: Opensuse über SuSE Studio
- Datenbank: MySQL, Verwaltungssoftware: MySQL Workbench
- Authentifizierung: JAAS mit LDAP, für Projekt erstmal per MySQL Tabelle

III.) Aufgaben
- UML-Diagramme: Stefan
- Test Hibernate mit Maven (Markus)

IV.) Programmtechnische Umsetzung
- Admin kann komplett neue Studiengänge erstellen
- AWPF als ein Wahlpflichtfach, Note wird durch Prüfungsamt eingetragen

V.) Datenbankmodell
- Tabellen:
	- User&Gruppen (für JAAS)
	-  


VI.) nächstes Treffen
- 
