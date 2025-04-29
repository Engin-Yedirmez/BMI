# BMIProject - Body Mass Index Calculator (Java)

This project contains three versions of a Java program that calculates Body Mass Index (BMI) based on user input. Each version demonstrates a different level of programming—from basic procedural code to object-oriented programming using classes and arrays.

---

## 🧮 What is BMI?

**BMI (Body Mass Index)** is a measure of health based on your height and weight.  
It is calculated using the formula:
BMI = weight (kg) / (height (m))²

BMI Categories:
- **Underweight:** BMI < 18.5
- **Normal:** 18.5 ≤ BMI < 25.0
- **Overweight:** 25.0 ≤ BMI < 30.0
- **Obese:** BMI ≥ 30.0


---

## ✅ Part 1 – Simple Console-Based BMI Calculator

- All code written in the `main` method.
- No reusable methods or classes.
- Input format: `weight height` (space-separated).
- Uses `nextLine()` to read input.
- Prints BMI and interpretation directly.

📄 File: `Part1/BMI_Part1.java`

---

## ✅ Part 2 – Using Methods and Arrays (Modular Design)

- Two separate classes:
  - `BmiFunctions.java` (with reusable `calculateBMI` and `interpretBMI` methods).
  - `Main.java` (contains input logic, arrays, and printing results).
- Handles multiple users (array size = 3).
- Input format: `name name age weight height` (space-separated).
- Uses both `split()` and `substring()` methods for parsing.

📄 Files:
- `Part2/BmiFunctions.java`
- `Part2/Main.java`

---

## ✅ Part 3 – Object-Oriented Programming (Using Class and Object Arrays)

- Uses a class named `Bmi` to store individual records.
- Contains:
  - Private fields for `name`, `age`, `weight`, and `height`.
  - Constructors (default, 3-parameter, and 4-parameter).
  - Methods `getBMI()` and `getStatus()`.
- Uses an array of `Bmi` objects (reference types) instead of primitive arrays.
- Includes input splitting using both `split()` and `substring()/indexOf()`.

📄 Files:
- `Part3/Bmi.java`
- `Part3/BmiTest.java`

---

### 📄 License
This project was developed for educational purposes and is shared as a sample academic assignment.