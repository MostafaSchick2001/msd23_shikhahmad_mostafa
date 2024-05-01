# Git Befehle

- **git config:**
         1. Funktionsweise: Ermöglicht die Verwaltung von Git-Einstellungen wie Benutzername und E-Mail-Adresse.
        2. Parameter: Verschiedene Parameter wie --global für globale Einstellungen oder --local für repositoryspezifische Einstellungen.
        3. Betroffene Daten: Meta-Informationen wie Benutzerinformationen.
        Veränderungsort: Lokal, da Konfigurationen auf dem System festgelegt werden.
- **git init**:
   1. Funktionsweise: Initialisiert ein neues Git-Repository.
    2. Parameter: Keine.
    3. Betroffene Daten: Erstellt das lokale Repository-Verzeichnis .git.
    4. Veränderungsort: Lokal, durch Erstellung des Repository-Verzeichnisses im aktuellen Arbeitsverzeichnis.
- **git commit**:
    1. Funktionsweise: Speichert Änderungen im lokalen Repository.
    2. Parameter: -m für eine Commit-Nachricht.
    3. Betroffene Daten: Nutzdaten (Dateien) und Meta-Informationen (Autor, Zeitstempel).
    4. Veränderungsort: Lokal, da der Repository-Zustand aktualisiert wird
- **git status**:
    1. Funktionsweise: Zeigt den Status von Dateien im Arbeitsverzeichnis und im Staging-Bereich an.
    2. Parameter: Keine.
    3. Betroffene Daten: Statusinformationen zu Dateien im Arbeitsverzeichnis und Staging-Bereich.
    4. Veränderungsort: Lokal, durch Anzeige des Status im Terminal.
- **git add**:
    1. Funktionsweise: Fügt Änderungen im Arbeitsverzeichnis dem Staging-Bereich hinzu.
    2. Parameter: Dateinamen oder Verzeichnisse.
    3. Betroffene Daten: Dateien im Staging-Bereich.
    4. Veränderungsort: Lokal, durch Verschiebung von Dateien in den Staging-Bereich.
- **git log**:
    1. Funktionsweise: Zeigt die Commit-Historie an.
    2. Parameter: Verschiedene Parameter zur Anpassung der Ausgabe.
    3. Betroffene Daten: Meta-Informationen zu Commits.
    4. Veränderungsort: Lokal, durch Anzeige der Commit-Historie im Terminal.
- **git diff**:
    1. Funktionsweise: Zeigt Unterschiede zwischen verschiedenen Versionen an.
    2. Parameter: Verschiedene Parameter zur Anpassung der Ausgabe.
    3. Betroffene Daten: Unterschiede zwischen Dateiversionen.
    4. Veränderungsort: Lokal, durch Anzeige von Unterschieden im Terminal.
- **git pull**:
    1. Funktionsweise: Holt Änderungen aus einem Remote-Repository und führt ein Merge durch.
    2. Parameter: Verschiedene Parameter zur Anpassung des Zusammenführungsverhaltens.
    3. Betroffene Daten: Lokale Arbeitskopie und Remote-Repository.
    4. Veränderungsort: Lokal, durch Aktualisierung der Arbeitskopie.
- **git push**:
   1. Funktionsweise: Überträgt lokale Commits auf ein Remote-Repository.
    2. Parameter: Verschiedene Parameter zur Anpassung des Push-Verhaltens.
    3. Betroffene Daten: Lokale Commits und Remote-Repository.
    4. Veränderungsort: Lokal, durch Übertragung von Commits an das Remote-Repository
