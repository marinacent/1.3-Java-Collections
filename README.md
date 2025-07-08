# Task 3 - Collections

## 📄 Description

### Level 1

#### Exercises 1 and 2

1. Create a Month class with a "name" attribute.
2. Add 11 Month objects (all months except “August”) to an ArrayList.
3. Insert the missing “August” object in its correct position and show that the ArrayList has the correct month order.
4. Convert the ArrayList to a HashSet and ensure that duplicates are not allowed.
5. Traverse the list using both a for loop and an Iterator.
6. Create and populate a List<Integer>.
7. Create a second List<Integer> and insert the elements from the first list in reverse order, using a ListIterator.

#### Exercise 3

Given a file called countries.txt that contains pairs of countries and their capitals, the program:

1. Reads this file and stores the data in a HashMap<String, String>.
2. Asks the user for their username.
3. Randomly selects a country from the HashMap and asks the user to enter the capital of that country.
4. If the user answers correctly, they get one point.
5. This process repeats 10 times, each time with a random country.
6. After the 10 questions, the program writes the user’s name and their score to an output file.

### Level 2

#### Exercises 1 and 2

1. Create a Restaurant class with two attributes: name (String) and score (int).
2. Make sure a HashSet does not allow duplicates with the same name and score (same name but different score is allowed).
3. Sort restaurants by name and score (high to low).

### Level 3

#### Exercise 1

1. Read a CSV file with information on people: each entry has three fields: name, surnames and DNI.
2. The Person class has these three fields: name, surnames, DNI.
3. The main menu lets you:

   - Add a person.
   - Show people sorted by name, surnames or DNI (ascending or descending order).
   - Exit.
  
## 💻 Technologies used

Java 21

## 📋 Requirements

Java 21

## 🛠️ Set up

1. Clone repository: -> git clone
2. Access project repository: cd 1.3-Collections
3. The *collections* folder contains level 1 exercises 1 and 2; *nivell-1_ex-3* contains level 1 exercise 3; *nivell-2* contains level 2; *nivell-3* contains level 3.

## ▶️ Run

1. Open the folders in your IDE.
2. Make sure your current directory is "1.3-Java-Collections-main". Otherwise, change the value of the variables *countriesPath* in *nivell-1_ex-3* and *peoplePath* in *nivell-3* to make sure the path to the files is correct.
3. Run the Main files.
