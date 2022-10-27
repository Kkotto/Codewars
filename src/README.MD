## Fundamentals

### Even or Odd

Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

### Convert a String to a Number!

We need a function that can transform a string into a number. What ways of achieving this do you know?

### Convert number to reversed array of digits

Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):

```
35231 => [1,3,2,5,3]
0 => [0]
```

### Regex validate PIN code

ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6
digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)

```
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false
```

## Task 1

Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often
referred to as Pascal case).

Examples

```
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
```

## Task 2

Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a
string).

Examples:

```
solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
```

## Task 3

Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the
threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.