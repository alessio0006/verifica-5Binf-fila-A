# VERIFICA TPSI: Swing + GitHub

Benvenuti alla verifica scritta di TPSI: Swing+GitHub. Buon lavoro!

Nella cartella `design` trovate il file "wireframe.png" con la porzione di pagina che dovrete implementare.

## Esecuzione del compito
Eseguite le seguenti operazioni:

- [v ] accedete con il vostro account personale (**non sbagliate password!**)
- [v ] fate il fork di questo progetto
- [v ] copiate l'URL relativo al **vostro** progetto
- [v ] aprite git-bash su Windows
- [v ] navigate nella cartella `~/Documents/<classe>/<cognome>` con il comando `cd` (change directory), creando la cartella se necessario
- [v] scaricate il progetto con `git clone <URL-vostro-repo>`
- [v] navigate nella cartella appena creata
- [v] aprite Esplora Risorse
- [v] navigate nel repository scaricato ed aprite il file `design/wireframe.png`
- [v] aprite Eclipse
- [v] importate il progetto con `File->Import->General->Existing Project Into Workspace` e **selezionate la cartella `code`**
- [v] implementate nel progetto Eclipse il wireframe appena aperto (vedi note sotto)

Quando avete finito e **comunque 7 minuti prima** dello scadere del tempo (vi verrà ricordato dal docente), dovete pubblicare il codice seguendo la procedura:
- [v] salvate il vostro codice Java
- [v] da git-bash, assicuratevi di essere all'interno della cartella del repository (il prompt deve finire con `(master)`)
- [v] fate `git status` per controllare i file modificati
- [v] aggiungete il file che volete pubblicare con `git add <nome-file>`
- [v] fate il commit delle modifiche con `git commit`
- [v] mettete un commento **significativo**, ad esempio "Consegna compito" se state facendo il commit di consegna
- [v] pubblicate il codice con `git push`
- [v] rispondete alla issue sul mio repository originale con il testo "Consegnato"

# Note implementazione progetto
Fate girare il vostro progetto il più spesso possibile per controllare che non sia corretto.

Potete implementate la tabella con i div che abbiamo visto a lezione, o con i tag `<tr>`, `<th>`, etc. Entrambe le soluzioni vanno bene.

Usate StringBuilder per la costruzione della stringa. Convertitela correttamente in stringa prima di usarla nella JLabel.

# Calcolo del punteggio
- Fork progetto: 1 punto
- Correzione Java package: 1 punto
- Impostazione setSize: 1 punto
- Visualizzazione titolo pagina HTML: 1 punto
- Visualizzazione intestazione tabella: 1 punto
- Visualizzazione prima riga tabella: 1 punto
- Visualizzazione seconda e terza riga tabella: 1 punto
- Corretta indentazione del codice sorgente: 1 punto
- Uso StringBuilder: 1 punto
- Chiarezza del codice (commenti, identificativi variabili, etc.): 1 punto
- Codice che compila: 1 punto
- Scrittura di un messaggio di commit significativo: 1 punto
- Push su GitHub: 1 punto

# Note generali
**È possibile** consultare il progetto di esempio che è stato fornito durante la lezione.

Al contrario, **non è possibile** comunicare o copiare dai compagni di classe.

Il punteggio totale del compito è dato quindi da:
- ogni casella spuntata e risolta correttamente vale il punteggio indicato
- le caselle non spuntate valgono 0 punti
