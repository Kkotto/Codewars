## Stop gninnipS My sdroW!

Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is
present.

Examples:

```
spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
```

## Multiples of 3 or 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally,
if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.

## Find The Parity Outlier

You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array
is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write
a method that takes the array as an argument and returns this "outlier" N.

Examples

```
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
```

## Simple Pig Latin

Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks
untouched.

Examples

``` 
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !'); // elloHay orldway !
```