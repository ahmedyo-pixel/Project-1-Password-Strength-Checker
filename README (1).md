# Password Strength Evaluator Tools

This repository contains two Java-based command-line utilities designed to assess the strength of user passwords. Both programs analyze password complexity and provide actionable feedback, but they use different evaluation methods.

## Files Included

### 1. `p.java` (Advanced Scoring Evaluator)
This version uses a point-based scoring system to determine password strength.
* **Common Password Blacklist:** Checks the input against a built-in list of commonly used weak passwords (e.g., "123456", "password", "qwerty"). If a match is found, it immediately rejects it.
* **Scoring System:** Awards points based on length (8+ and 12+ characters), uppercase letters, numbers, and symbols.
* **Targeted Feedback:** Provides specific, formatted tips on exactly what to add to improve the password if it falls into the "Weak" or "Medium" tiers.

### 2. `password2.java` (Strict Condition Evaluator)
This version uses strict boolean conditions to categorize passwords into Strong, Medium, or Weak tiers.
* **Strong:** Must be at least 8 characters long AND contain an uppercase letter, a number, and a symbol.
* **Dynamic Feedback:** If the strict criteria are not met, the program dynamically constructs a message stating exactly which elements are missing to reach the next tier.

## Technologies Used
* **Language:** Java
* **Interface:** Command Line Interface (CLI)

## How to Run

1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Open your terminal or command prompt.
3. Navigate to the directory containing the files.
4. Compile the desired file using the `javac` command:
   ```bash
   javac p.java
   # OR
   javac password2.java
   ```
5. Run the compiled class using the `java` command:
   ```bash
   java p
   # OR
   java password2
   ```
