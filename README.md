Java EE 7 - Workshop
========================

Dies ist das Begleitprojekt zum Workshop "Java EE 7 - Enterprise-Anwendungen ohne Ballast" am 18.04.2016 im Rahmen der JAX 2016.

Zum Mitmachen benötigen Sie die folgenden Dinge:

- Einen PC (;-). Das Betriebssystem ist generell zweitrangig. Ich habe allerdings nur Erfahrungen mit Windows und (ein wenig) mit Linux. Zu MacOS kann ich nichts sagen.

- Ein installiertes JSDK. Wir benötigen Java 8 (Download für Windows und Linux: http://www.oracle.com/technetwork/java/javase/downloads/index.html)

- Einen Git-Client, z. B. Git Bash (Download: http://git-scm.com/downloads)

- Maven 3.x (Download: http://maven.apache.org/download.html)

- Eine IDE ihrer Wahl. Wichtig ist, dass Maven-Projekte importiert werden können und WildFly als Application Server eingebunden werden kann. Ich empfehle dazu das JBoss 
  Developer Studio (http://www.jboss.org/products/devstudio/download/, es reicht der sog. Stand-alone Installer). Anders als der Name es vermuten lässt, ist es nicht nur 
  für den JBoss Application Server nutzbar. Lassen Sie sich durch den Text auf der Download-Seite nicht verwirren: Die Software ist kostenlos. Sie müssen sich lediglich 
  registrieren.
  
  Das JBDS ist ein Eclipse (Luna bzw. Mars) mit hinzuinstallierten JBoss Tools. Sie können somit auch ihr ggf. bereits installiertes Eclipse aufrüsten. Ich habe in der
  Vergangenheit aber sporadisch das Problem gehabt, dass vermutlich aufgrund inkompatibler Versionen diverser Plugins die Integration nicht vollständig funktional war.
  So konnten bspw. keine Maven-Projekte importiert werden oder die SCM-Anbindung funktionierte nicht mehr etc. etc. Die sichere Wahl ist daher auf jeden Fall das JBDS.
  
  JBDS (wie auch Eclipse) enthält diverse Validatoren, die die Korrektheit von Deskriptoren etc. testen sollen. Leider funktionieren diese Validatoren (zumindest für 
  Maven-Projekte) nicht korrekt. Wenn nach dem Import der Projekte Validierungsfehler (z. B. "JPA Problem") angezeigt werden, sollten Sie die Validatoren deaktiviern 
  (Window -> Preferences -> Validation: Disable All).

- WildFly 10 (Download http://wildfly.org/downloads/). Wir setzen im Workshop diesen Server ein. Generell ist aber jeder Java-EE-7-Server geeignet.

- Recht praktisch zum Verfolgen der Änderungen in der Datenbank ist ein DB-Tool. Grundsätzlich sind viele Tools gut geeignet. Ich setze gerne
  SQL Workbench/J ein (http://www.sql-workbench.net). Im Workshop werden wir die H2-Datenbank nutzen, die auch mit einer eigenen GUI ausgestattet ist.  

Der Branch master enthält eine Startversion der Enterprise-Anwendung, die im Workshop aufgebaut wird. Initial ist der Branch jax16 identisch, wird aber im Workshop
mit der konkret entwickelten Software stückweise gefüllt.

Bitte checken Sie zur Vorbereitung den Branch jax16 aus, wenn Sie direkt mitmachen wollen.
  
Fragen können während der Veranstaltung natürlich jederzeit gestellt werden und vorher oder nachher gerne an dirk.weil(at)gedoplan.de.

Dirk Weil   