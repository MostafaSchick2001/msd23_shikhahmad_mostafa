# Wichtige Konfigurationsaspekte für Maven Site

## Maven Site Dokumentation generieren

### Notwendige Schritte

1. **Ordnerstruktur**:
    ```
    src
    └── site
        └── markdown
    ```

2. **site.xml erstellen**: Im Verzeichnis `src/site` anlegen, um die Site-Struktur zu definieren.

3. **Markdown-Dateien erstellen**: Im Verzeichnis `src/site/markdown`.

4. **Maven Site generieren**: Im Projektstammverzeichnis `mvn site` ausführen.

### Konfigurationen in site.xml und pom.xml

#### site.xml

- **Menüstruktur**:
    ```xml
        <project name="Drinks Documentation Demo">
            <publishDate position="right"/>
            <version position="left"/>
            <body>
                <menu name="Overview">
                    <item name="Introduction" href="index.html"/>
                    <item name="good_style" href="good_style.html"/>
        
                </menu>
                <menu ref="reports"/>
            </body>
        </project>
    ```


