# Übung 4: Testfälle für die Calculator-Klasse

## Getestete Methoden und Testfälle

### 1. `add(double number1, double number2)`

#### Testfälle:
- **Addition von positiven Zahlen**:
  - Eingabe: `5`, `3`
  - Erwartetes Ergebnis: `8`

- **Addition einer positiven und einer negativen Zahl**:
  - Eingabe: `-2`, `2`
  - Erwartetes Ergebnis: `0`

- **Addition von zwei negativen Zahlen**:
  - Eingabe: `4`, `2`
  - Erwartetes Ergebnis: `2`

### 2. `minus(double number1, double number2)`

#### Testfälle:
- **Subtraktion von positiven Zahlen**:
  - Eingabe: `5`, `3`
  - Erwartetes Ergebnis: `2`

- **Subtraktion einer positiven und einer negativen Zahl**:
  - Eingabe: `-2`, `2`
  - Erwartetes Ergebnis: `-4`

- **Subtraktion von zwei negativen Zahlen**:
  - Eingabe: `-1`, `-2`
  - Erwartetes Ergebnis: `1`

### 3. `divide(double number1, double number2)`

#### Testfälle:
- **Division von positiven Zahlen**:
  - Eingabe: `6`, `3`
  - Erwartetes Ergebnis: `2`

- **Division einer positiven und einer negativen Zahl**:
  - Eingabe: `-2`, `2`
  - Erwartetes Ergebnis: `-1`

- **Division von positiven Zahlen mit nicht-ganzzahligem Ergebnis**:
  - Eingabe: `3`, `2`
  - Erwartetes Ergebnis: `1.5`

- **Division durch null (Sonderfall)**:
  - Eingabe: `1`, `0`
  - Erwartete Ausnahme: `ArithmeticException` mit der Nachricht "Cannot divide by zero"

### 4. `multiply(double number1, double number2)`

#### Testfälle:
- **Multiplikation von positiven Zahlen**:
  - Eingabe: `5`, `3`
  - Erwartetes Ergebnis: `15`

- **Multiplikation einer positiven und einer negativen Zahl**:
  - Eingabe: `-2`, `2`
  - Erwartetes Ergebnis: `-4`

- **Multiplikation von zwei negativen Zahlen**:
  - Eingabe: `-3`, `-2`
  - Erwartetes Ergebnis: `6`
