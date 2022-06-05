# Assorted Exercises

These exercises are for a Java cohort I'm in as a student.

### System specifications

* Java 11, but Java 8 might be sufficient for the early exercises. 
* JUnit 5, at first more because of the imports than because of any specific 
JUnit 5 features.
* IntelliJ IDEA for ease of bringing the project into your local machine. Can 
use Apache NetBeans or Eclipse with just a little effort.

### Notes for Hacktoberfest participants

This repository is closed to Hacktoberfest. I have other repositories that I 
intend to open to Hacktoberfest shortly before October 1, 2022. Those other 
repositories have a CONTRIBUTING.md file at their respective root levels, this 
repository doesn't.

## Project 1: Dragon Cave

The classic text game in which you have to go into one of two caves. No 
consideration for exceptions or testing at this point.

See: `games.text.DragonCave`. Must enter 1 or 2 to choose the cave with a dragon 
who might eat you or give you treasure, any other input will cause an unhandled 
exception.

## Project 2: Guess the Number

A number guessing game, the computer thinks of a number between 1 and 20, you 
have six guesses to guess what the number is. No consideration for exceptions or 
testing at this point.

See `games.text.NumberGuessingGame`. Must enter integers in the range 
&minus;2<sup>31</sup> to 2<sup>31</sup> &minus; 1 (numbers out of the 1 to 20 
range eat up guesses). Any other input will cause an unhandled exception.

## Project 3: Revise earlier projects for exception handling

Project 1 and Project 2 been revised so that unexpected inputs don't cause the 
program to crash due to an unhandled exception. In Dragon Cave, an unexpected 
input will be interpreted as indecision and cause a bad outcome in the game. 
An unexpected input in the number guessing game (e.g., a word rather than a 
number) will "refund" you one guess, but numbers out of the 1 to 20 range will 
still eat up guesses).

## Project 4: Revise Project 1 and Project 2 to have unit tests

Haven't yet decided how I will go about this one. I haven't added tests 
retroactively in a long time.
