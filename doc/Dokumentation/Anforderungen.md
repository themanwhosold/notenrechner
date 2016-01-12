Anforderungsliste an das Projekt "Notenrechner":
- 2 Frontends (Verwaltung & Studierende)
- individualisierbare Notenliste/-berechnung pro Jahrgang
- Studiengangspezifisch, d.h. Programm nur für Vinf oder allgemeingültig?
	- Wenn allgemeingültig müsste der Administrator in der Lage sein Studiengänge mit Spezifikation zu erstellen - kann schwierig werden
- Ablage der Noten in einer Datenbank -> Diskussionsbedarf, SQL oder NoSQL
- Generierung von Testdaten (Mock data) für die Datenbank
	- Ist möglich durch CSV Dateien der ersten Semester
- Ablage der Noten kann nur durch den Administrator/Dozenten erfolgen
- graphische Aufbereitung der Noten in Diagrammen
- statistische Kennzahlen berechen (Standartabweichung, Durchschnittsnote,...)
- Statistikfunktionen für den Jahrgang
- Farbliche Abhebung der Noten, ob durchgefallen (rot), über- (grün)/unterdurchschnittlich (gelb) usw...
- Durchschnittsnote für alle sichtbar (kann bedenklich sein wenn nur zwei Studenten das Fach geschrieben haben)
- Authentifizierung notwendig über JAAS
- Desktop Client mit JavaFX (optional?)
- Umsetzung in "gesprochene Noten"
- Eintragung von "Traumnoten" der Studenten und anschließende Berechnung der "resultierenden/prognostizierenden" Endnote, die überschrieben werden durch Eintragung der echten Note durch den Dozenten
- Technologie fuer die Abhaengigkeitsverwaltung?
	- Ant
	- Maven
	- Gradle
- Mobile Devices über App oder AngularJS? Wenn App, welche Plattformen?


eingesetzte Technologien:
- Java 8 (Update 60) -> neueste Version
- Java EE 7
- Netbeans 8.0.2 oder 8.1.0 als IDE
- Glassfish oder Wildfly als Application Server
	-derzeit ist Wildfly 8.2.0 als AS eingestellt (Stand: 08.10.2015)
		-Wildfly 9 und 10 werden noch weiterentwickelt
- Angular.JS als Framework (?)
- MySQL oder MongoDB/CouchDB oder whatever (?)
- Authentifizierung mit JAAS und DB als Backend (später evtl. LDAP)
- Welches Tool für UML?
	- Star UML?

- individualisierbare Notenberechnung pro Jahrgang
