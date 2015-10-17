#Fork aktualisieren

Die hier vorgestellte Variante ist nur eine von vielen Möglichkeiten und kann in bestimmten Konstellationen fehlschlagen, weitere Tipps finden sind in der Datei doc/nuetzlicheLinks.md

###Fork aus dem Internet auf den (lokalen) Rechner clonen:

markus@linux-R60:~/coding/git-repos/stefan> git clone https://github.com/viSMemmel/notenrechner.git
Klone nach 'notenrechner' ...
remote: Counting objects: 465, done.
remote: Compressing objects: 100% (66/66), done.
remote: Total 465 (delta 32), reused 0 (delta 0), pack-reused 399
Empfange Objekte: 100% (465/465), 11.84 MiB | 3.00 MiB/s, Fertig.
Löse Unterschiede auf: 100% (206/206), Fertig.
Prüfe Konnektivität ... Fertig.

###In das Verzeichnis wechseln:

markus@linux-R60:~/coding/git-repos/stefan> cd notenrechner/

###Statusabfrage

markus@linux-R60:~/coding/git-repos/stefan/notenrechner> git status
Auf Branch master
Ihr Branch ist auf dem selben Stand wie 'origin/master'.
nichts zu committen, Arbeitsverzeichnis unverändert

###meinen Master als neuen (Online-)Branch "upstream" anlegen

markus@linux-R60:~/coding/git-repos/stefan/notenrechner> git remote add upstream https://github.com/themanwhosold/notenrechner.git

###die aktuellste Version von meinem Master(-Zweig) laden
markus@linux-R60:~/coding/git-repos/stefan/notenrechner> git pull upstream master
remote: Counting objects: 11, done.
remote: Compressing objects: 100% (11/11), done.
remote: Total 11 (delta 5), reused 0 (delta 0), pack-reused 0
Entpacke Objekte: 100% (11/11), Fertig.
Von https://github.com/themanwhosold/notenrechner
 * branch            master     -> FETCH_HEAD
 * [neuer Branch]    master     -> upstream/master
Aktualisiere 9902915..cee5973
Fast-forward
 .gitignore                                         |    7 +
 .travis.yml                                        |    9 +
 Impressum.xhtml                                    |   11 +
 README.md                                          |   10 +
 doc/Anforderungen.md                               |   39 +-
 doc/Coding_Guidelines.md                           |   10 +
 doc/DatenbankmodellSQL.sql                         |  110 +
 doc/SQLNotenModel.mwb                              |  Bin 0 -> 7456 bytes
 doc/Todo.md                                        |   23 +
 doc/meetings/2015-10-13KickoffMeeting.md           |   83 +
 doc/nuetzlicheLinks.md                             |   21 +
 doc/uml/Klassen_wird_nochmal_ueberarbeitet.mdj     | 4220 ++++++++++++++++++++
 doc/verwendeteSW.md                                |    9 +
 nb-configuration.xml                               |   19 +
 notenrechner-ear/nb-configuration.xml              |   19 +
 notenrechner-ear/pom.xml                           |   57 +
 .../src/main/application/META-INF/MANIFEST.MF      |    2 +
 .../src/main/application/META-INF/jboss-app.xml    |    2 +
 notenrechner-ejb/nb-configuration.xml              |   18 +
 notenrechner-ejb/pom.xml                           |   81 +
 .../src/main/java/de/hof/se2/NewSessionBean.java   |   25 +
 .../src/main/resources/META-INF/MANIFEST.MF        |    2 +
 .../src/main/resources/META-INF/jboss.xml          |    2 +
 notenrechner-web/nb-configuration.xml              |   19 +
 notenrechner-web/pom.xml                           |   81 +
 notenrechner-web/src/main/webapp/WEB-INF/beans.xml |    6 +
 .../src/main/webapp/WEB-INF/jboss-web.xml          |    4 +
 notenrechner-web/src/main/webapp/index.html        |   10 +
 pom.xml                                            |   14 +
 29 files changed, 4910 insertions(+), 3 deletions(-)
 create mode 100644 .gitignore
 create mode 100644 .travis.yml
 create mode 100644 Impressum.xhtml
 create mode 100644 doc/Coding_Guidelines.md
 create mode 100644 doc/DatenbankmodellSQL.sql
 create mode 100644 doc/SQLNotenModel.mwb
 create mode 100644 doc/Todo.md
 create mode 100644 doc/meetings/2015-10-13KickoffMeeting.md
 create mode 100644 doc/nuetzlicheLinks.md
 create mode 100644 doc/uml/Klassen_wird_nochmal_ueberarbeitet.mdj
 create mode 100644 doc/verwendeteSW.md
 create mode 100644 nb-configuration.xml
 create mode 100644 notenrechner-ear/nb-configuration.xml
 create mode 100644 notenrechner-ear/pom.xml
 create mode 100644 notenrechner-ear/src/main/application/META-INF/MANIFEST.MF
 create mode 100644 notenrechner-ear/src/main/application/META-INF/jboss-app.xml
 create mode 100644 notenrechner-ejb/nb-configuration.xml
 create mode 100644 notenrechner-ejb/pom.xml
 create mode 100644 notenrechner-ejb/src/main/java/de/hof/se2/NewSessionBean.java
 create mode 100644 notenrechner-ejb/src/main/resources/META-INF/MANIFEST.MF
 create mode 100644 notenrechner-ejb/src/main/resources/META-INF/jboss.xml
 create mode 100644 notenrechner-web/nb-configuration.xml
 create mode 100644 notenrechner-web/pom.xml
 create mode 100644 notenrechner-web/src/main/webapp/WEB-INF/beans.xml
 create mode 100644 notenrechner-web/src/main/webapp/WEB-INF/jboss-web.xml
 create mode 100644 notenrechner-web/src/main/webapp/index.html
 create mode 100644 pom.xml

###Statusabfrage:

markus@linux-R60:~/coding/git-repos/stefan/notenrechner> git status
Auf Branch master
Ihr Branch ist vor 'origin/master' um 134 Commits.
  (benutzen Sie "git push", um lokale Commits zu publizieren)
nichts zu committen, Arbeitsverzeichnis unverändert

###Die Online Variante ebenfalls auf den aktuellsten Stand bringen:

markus@linux-R60:~/coding/git-repos/stefan/notenrechner> git push

